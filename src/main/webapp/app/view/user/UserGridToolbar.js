Ext.define('Admin.view.user.UserGridToolbar', {
	extend: 'Admin.view.common.GridToolbar',
	// disableAdd: true, //去掉添加按钮
	// disableModify: true, //去掉修改按钮
	// disableRemove: true, //去掉删除按钮
	xtype: 'userGridToolbar',
	func: 'user',//所属功能编码
	buttons: [
		{
            text: '用户角色',
            oper: 'userRole',//操作编码
            listeners: {
                click: 'onUserRole'
            }
        },{
            text: '启用',
            oper: 'enable',
            listeners: {
                click: 'enableUser'
            }
        },{
            text: '禁用',
            oper: 'disable',
            listeners: {
                click: 'disableUser'
            }
        }
	]
});