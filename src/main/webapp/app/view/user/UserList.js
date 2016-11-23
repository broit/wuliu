Ext.define('Admin.view.user.UserList', {
    extend: 'Admin.view.common.GridList',
    xtype: 'userList',
    reference : 'userListGrid',
    columns: [
        {hidden: true,dataIndex: 'id'},
        {text: '登录名', dataIndex: 'code'},
        {text: '姓名',  dataIndex: 'name' },
        // {text: '密码', dataIndex: 'password'},
        {text: '电话', dataIndex: 'mobile'},
        {text: '级别', dataIndex: 'rank'
                ,renderer: function(value){
                    var rank = value;
                    Ext.Array.each(Ext.userlevel,function(level){
                        if(level.level==value){
                            rank = level.name;
                            return false;
                        }
                    });
                    return rank;
                }},
        {text: '职务', dataIndex: 'jobName'},
        {text: '分公司', dataIndex: 'branchName'},
        {text: '车间', dataIndex: 'wsName'},
        {text: '班组', dataIndex: 'teamName'},
        {text: '状态', dataIndex: 'status'
            ,renderer: function(value){
                if('0'==value){
                    return '禁用';
                }else if('1'==value){
                    return '启用';
                }
            }
        }
    ],
    toolbar : 'userGridToolbar'
});
