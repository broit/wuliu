Ext.define('Admin.store.user.User', {
	extend: 'Ext.data.Store',
	alias: 'store.user.UserStore',
    method: 'GET',
	model: 'Admin.model.user.UserModel',
    proxy: {
        type: 'ajax',
        url: '/user/teamUserList.action'
    }
});