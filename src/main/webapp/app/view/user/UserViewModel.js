Ext.define('Admin.view.user.UserViewModel', {
    extend: 'Admin.model.BaseViewModel',
    alias: 'viewmodel.userViewModel',

    data: {
    	//模块名称
    	funcName: '用户管理',
    	//列表reference名
    	grid: 'userListGrid',
    	
	    //添加表单
	    addForm: 'Admin.view.user.UserForm',
	    
	    //修改表单
	    modifyForm: 'Admin.view.user.UserForm',
	    
	    //删除地址
	    removeUrl: '/user/remove/'
    },
    
    stores:{
    	//列表store
    	gridStore: {
    		model: 'Admin.model.user.UserModel',
		    proxy: {
		        type: 'ajax',
		        url: '/user/list.action',
		        reader: {
		            type: 'json',
		            rootProperty: 'rows',
		            totalProperty: 'count'
		        }
		    }
    	}
    }
});