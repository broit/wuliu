Ext.define('Admin.view.user.UserController', {
    extend: 'Admin.view.common.Controller',

    alias: 'controller.userController',
    validateField: function(field) {//密码匹配验证
        field.next().validate();
    },
    onUserRole: function(btn){
    	var me = this;
        var grid = me.lookupReference(me.getViewModel().getData().grid);
        var record = grid.getSelectionModel().getSelection()[0];
        if(record === undefined){
            Ext.MessageBox.show({
                msg: '请选择一条记录',buttons: Ext.MessageBox.OK,icon: Ext.MessageBox.WARNING,minWidth:200
            });
            return;
        }else{
            var win = Ext.create('Admin.view.user.UserRole',{userId: record.data.id});
            win.loadForm(btn);
        }
    },
    enableUser: function(){
        var me = this;
        var grid = me.lookupReference(me.getViewModel().getData().grid);
        var record = grid.getSelectionModel().getSelection()[0];
        if(record === undefined){
            Ext.MessageBox.show({
                msg: '请选择一条记录',buttons: Ext.MessageBox.OK,icon: Ext.MessageBox.WARNING,minWidth:200
            });
            return;
        }else{
            Ext.MessageBox.confirm('提示', '确定启用吗?', function(btn){
                if(btn=='yes'){
                    var idColumn = me.getViewModel().getData().idColumn;
                    var id =(idColumn)?record.data[idColumn]:record.data.id;
                    Ext.Ajax.request({
                        url: "/user/enable.action",
                        method: "POST",
                        params: {
                            id: id,
                            status: '1'
                        },
                        callback:function(options,success,response){
                            var responseData = Ext.decode(response.responseText);
                            if(responseData.success){
                                grid.getStore().reload();
                            }else{
                                Ext.MessageBox.show({
                                    title: '提示',
                                    msg: '启用失败：'+responseData.errorMessage,
                                    buttons: Ext.MessageBox.OK,
                                    icon: Ext.MessageBox.ERROR
                                });
                            }
                        }
                    });
                }
            });
        }
    },
    disableUser: function(){
        var me = this;
        var grid = me.lookupReference(me.getViewModel().getData().grid);
        var record = grid.getSelectionModel().getSelection()[0];
        if(record === undefined){
            Ext.MessageBox.show({
                msg: '请选择一条记录',buttons: Ext.MessageBox.OK,icon: Ext.MessageBox.WARNING,minWidth:200
            });
            return;
        }else{
            Ext.MessageBox.confirm('提示', '确定禁用吗?', function(btn){
                if(btn=='yes'){
                    var idColumn = me.getViewModel().getData().idColumn;
                    var id =(idColumn)?record.data[idColumn]:record.data.id;
                    Ext.Ajax.request({
                        url: "/user/disable.action",
                        method: "POST",
                        params: {
                            id: id,
                            status: '0'
                        },
                        callback:function(options,success,response){
                            var responseData = Ext.decode(response.responseText);
                            if(responseData.success){
                                grid.getStore().reload();
                            }else{
                                Ext.MessageBox.show({
                                    title: '提示',
                                    msg: '禁用失败：'+responseData.errorMessage,
                                    buttons: Ext.MessageBox.OK,
                                    icon: Ext.MessageBox.ERROR
                                });
                            }
                        }
                    });
                }
            });
        }
    }
});
