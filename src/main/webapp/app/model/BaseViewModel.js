Ext.define('Admin.model.BaseViewModel', {
    extend: 'Ext.app.ViewModel',
    data: {
    	pageSize : 10
    },
    stores:{
    	//列表store
    	gridStore: {
    		pageSize: '{pageSize}',
    		autoLoad: true,
		    method: 'GET',
		    listeners: {
		    	beforeload: "beforeListLoad"
		    }
    	}
    }
});