Ext.define('Admin.view.role.RoleGridToolbar', {
	extend: 'Admin.view.common.GridToolbar',
	xtype: 'roleGridToolbar',
	func: 'role',
	buttons: [
		{
            text: '角色功能',
            oper: 'roleFunc',//操作编码
            listeners: {
                click: 'onRoleFunc'
            }
        },
        {
            text: '消息类型',
            oper: 'roleMessage',//操作编码
            listeners: {
                click: 'onRoleMessage'
            }        	
        }
	]
});