Ext.define('Admin.view.main.Modify', {
    extend: 'Ext.window.Window',
    controller : 'mainviewport',
    modal:true,
    width: 400,
    height:380,
    title:"修改密码",
    autoScroll:true,
    bodyPadding: 15,  
    defaults: {
        xtype: 'form',
        border: false
    },
    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
     items:[                
                {
                  layout: {
                      type: 'vbox',
                      align: 'stretch'
                  },
                    items:[
                           {
                               xtype: 'form',
                               layout: 'column', 
                               border: false,
                               items:[
                                      {
                                          xtype: 'fieldset',
                                          title: cfg.titleName,
                                          defaultType: 'textfield',
                                          width:360,
                                          layout: 'hbox',
                                          defaults: {
                                              anchor: '100%'
                                          },
				                           items:[
													{
													    xtype:'container',
													    columnWidth:.5,
													    defaults: {
													        labelWidth: 150,
													        width:300,
													        labelAlign: 'right',
													        submitEmptyText: false,
													        anchor: '100%'
													    },
													    items:[	
													           {
													                xtype: 'hiddenfield',
													                name: 'id'
													            },
													           {
													               fieldLabel:'旧密码',
													               name: 'oldpassword',
													               allowBlank: false,
													               xtype: 'textfield',
													               inputType: 'password'
													           },
													           {
													               fieldLabel:'新密码',
													               name: 'password',
													               allowBlank: false,
													               xtype: 'textfield',
													               inputType: 'password'
													           },
													           {
													               fieldLabel:'再输入一次',
													               name: 'passwordAgin',
													               allowBlank: false,
													               xtype: 'textfield',
													               inputType: 'password'
													           }   
													    ]
													}       
				                           ]
                                      }
                             ]
                          }
                    ]          
                }          
   			]
        },
                  cfg)]); 
    },
       buttons: [{
		            text: '提交',
		            ui: 'blue',
		            formBind: true,
		            listeners: {
		                click: function(){
		                    this.up('window').onSave(this);
		                }
		            }
		        },{
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
         onClose:function (btn){
             var win = btn.up('window');
             if (win) {
                 win.close();
             }
         },     
         onSave:function(btn){
             var win = btn.up('window');
             if(win){
                 var form = win.down('form').getForm();
                 var password=form.findField("password").getValue();
                 var passwordAgin=form.findField("passwordAgin").getValue();
                 if(password==passwordAgin){
                 if(form&&form.isValid()){
                         form.submit({
                             url : '/modify.action',
                             waitMsg : '正在提交数据',
                             waitTitle : '提示',
                             method : "POST",
                             submitEmptyText:false,
                             success : function(form, action) {
                                 if(action.result.success){
                                     Ext.MessageBox.show({
                                         title: '提示',
                                         msg: '修改成功',
                                         buttons: Ext.MessageBox.OK,
                                         icon: Ext.MessageBox.INFO
                                     });
                                     win.close();
                                 }else{
                                     Ext.MessageBox.show({
                                         title: '提示',
                                         msg: '保存失败：'+action.result.msg,
                                         buttons: Ext.MessageBox.OK,
                                         icon: Ext.MessageBox.ERROR
                                     });
                                 }
                             },
                             failure : function(form, action) {
                                 Ext.MessageBox.show({
                                     title: '提示',
                                     msg: '保存失败：'+action.result.msg,
                                     buttons: Ext.MessageBox.OK,
                                     icon: Ext.MessageBox.ERROR
                                 });
                             }
                         });
                 }
                 }else{
                     Ext.MessageBox.show({
                         title: '提示',
                         msg: '修改失败：两次新密码不一致',
                         buttons: Ext.MessageBox.OK,
                         icon: Ext.MessageBox.ERROR
                     });
                 }
             }
         }
   });