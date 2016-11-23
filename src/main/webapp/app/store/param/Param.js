Ext.define('Admin.store.param.Param', {
	extend: 'Ext.data.Store',
	alias: 'store.param.ParamStore',
    method: 'GET',
	model: 'Admin.model.param.Model',
    proxy: {
        type: 'ajax',
        url: '/param/selectByType.action'
    }
});