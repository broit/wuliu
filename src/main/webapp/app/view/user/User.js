Ext.define('Admin.view.user.User', {
    extend: 'Admin.view.common.Container',

    title: '用户',
    requires: [
        'Admin.view.user.UserSearchField',
        'Admin.view.user.UserList',
        'Admin.view.user.UserForm',
        'Admin.view.user.UserViewModel',
        'Admin.view.user.UserController',
        'Admin.model.user.UserModel',
        'Admin.store.workshop.Branch',
        'Admin.store.team.Workshop',
        'Admin.store.user.Team',
        'Admin.store.param.Param',
        'Admin.store.user.Level',
        'Admin.view.user.UserGridToolbar',
        'Ext.ux.AdvancedVType'
    ],

    viewModel: {
        type: 'userViewModel'
    },

    controller: 'userController',

    items:[
        { 
            xtype: 'userSearchField'
        },
        {
            xtype: 'userList',
            flex: 1
        }
    ]
});
