Ext.define('Admin.view.user.UserRole', {
	extend: 'Ext.window.Window',
    title: '用户角色',
    modal: true,
    bodyBorder: false,
	layout: 'fit',
    width: 280,
    height: 340,
    items:[
        {
            xtype: 'form',
            bodyBorder: false,
            bodyPadding: 0,
            layout: 'fit',
            defaults: {
                bodyBorder: false,
                bodyPadding: 0
            },
            items:[
                {
                    xtype: 'treepanel',
                    rootVisible: false,
                    useArrows: true,
                    bufferedRenderer: false,
                    animate: true,
                    frame:true,
                    split: true,
                    autoScroll:true
                }
            ]
        }
    ],
    buttons: [
            {
                text: '全选',
                ui: 'blue',
                checkType: true,
                formBind: true,
                listeners: {
                    click: function(){
                        this.up('window').onSelectAll(this);
                    }
                }
            },
            {
                text: '保存',
                ui: 'blue',
                formBind: true,
                listeners: {
                    click: function(){
                        this.up('window').onSave(this);
                    }
                }
            },
            {
                text: '关闭',
                ui: 'blue',
                formBind: true,
                listeners: {
                    click: function(){
                        this.up('window').onClose(this);
                    }
                }
            }
    ],
    /*constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({},cfg)]);
    },*/
    loadForm: function(btn){
        var win = this;
        var formPanel = this.down('form');
        var form = formPanel.getForm();
        form.load({
                waitMsg:'正在加载',
                waitTitle:'',
                url : '/user/userRole/'+win.userId+'.action',
                method:'GET',
                success:function(form,action){
                    formPanel.down('treepanel').setStore(new Ext.data.TreeStore({
                                    root: {
                                    expanded: true,
                                    children: action.result.data
                                    }
                                }))
                    win.show(btn);
                },
                failure:function(form,action){
                    Ext.MessageBox.show({
                        msg: '加载信息失败:'+action.result.errorMessage,buttons: Ext.MessageBox.OK,icon: Ext.MessageBox.WARNING,minWidth:200
                    });
                }
            });
    },
    onSave:function(btn){
        var win = btn.up('window');
        var treepanel = win.down('treepanel');
        // console.log(treepanel.getView());
        var records = treepanel.getView().getChecked(),
            userRole = {"userId": win.userId};
        Ext.Array.each(records, function(rec,index){
            userRole["list["+index+"].userroleRoleid"] = rec.get('value');
            userRole["list["+index+"].userroleUserid"] = win.userId;
        });
        
        Ext.Ajax.request({
             url: '/user/userRole.action',
             method: 'POST',
             params : userRole,
             success: function(response, opts) {
                 var obj = Ext.decode(response.responseText);
                 if(obj.success){
                    Ext.MessageBox.show({
                        title: '信息',
                        msg: '保存成功',
                        icon: Ext.MessageBox.INFO,
                        buttons: Ext.MessageBox.OK
                    });
                    win.close();
                 }else{
                    Ext.MessageBox.show({
                        title: '信息',
                        msg: obj.errorMsg,
                        icon: Ext.MessageBox.WARNING,
                        buttons: Ext.MessageBox.OK
                    });
                 }
             },
             failure: function(response, opts) {
                 Ext.MessageBox.show({
                        title: '信息',
                        msg: '保存失败,服务器代码:'+response.status,
                        icon: Ext.MessageBox.WARNING,
                        buttons: Ext.MessageBox.OK
                    });
             }
         });
    },
    onClose: function (btn) {
        var win = btn.up('window');
        if (win) {
            win.close();
        }
    },
    onSelectAll: function(btn){
        var treepanel = btn.up('window').down('treepanel');
        var node = treepanel.getRootNode();
        node.eachChild(function (child) {
            child.set('checked',btn.checkType);   
        });
        btn.checkType = !btn.checkType;
        if(btn.checkType){
            btn.setText("全选");
        }else{
            btn.setText("全取消");
        }
        
    }
});