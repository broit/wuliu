Ext.define('Admin.view.user.UserSearchField', {
	xtype: 'userSearchField',
	extend: 'Admin.view.common.SearchField',
	// disableSearch: true,//是否不自动添加'查询'按钮
	items: [
        {
            xtype: 'textfield',
            name: 'code',
            width: 120,
            hideLabel: true,
            emptyText: '登录名'
        },
        {
            xtype: 'textfield',
            name: 'name',
            style: 'margin-left:10px',
            width: 120,
            hideLabel: true,
            emptyText: '姓名'
        },
        {
            xtype: 'combo',
            style: 'margin-left:10px',
            editable: false,
            queryMode: 'local',
            width: 120,
            emptyText: '所属公司',
            store: {
                type: 'workshop.BranchStore',
                autoLoad: true
            },
            name: 'branch',
            valueField: 'id',
            displayField: 'name',
            listeners: {
                change: function(combo,value){
                    var ws = combo.up('form').getForm().findField("ws");
                    ws.clearValue();
                    if(value=='all'){
                            ws.getStore().removeAll();
                        }else{
                            ws.getStore().reload({
                                 params : {
                                    branchid : value
                                }
                            })
                        }
                }
            }
        },
        {
            xtype: 'combo',
            style: 'margin-left:10px',
            // editable: false,
            queryMode: 'local',
            width: 120,
            emptyText: '所属车间',
            store: {
                type: 'team.WorkshopStore',
                listeners: {
                    load: function(store){
                        store.insert(0,{"id": "all","name": "全部"});
                    }
                }
            },
            editable: false,
            name: 'ws',
            valueField: 'id',
            displayField: 'name',
            listeners: {
                change: function(combo,value){
                    var team = combo.up('form').getForm().findField("team");
                    team.clearValue();
                    if(value=='all'){
                            team.getStore().removeAll();
                        }else{
                            team.getStore().reload({
                                 params : {
                                    wsid : value
                                }
                            })
                        }
                }
            }
        },
        {
            xtype: 'combo',
            style: 'margin-left:10px',
            // editable: false,
            queryMode: 'local',
            width: 120,
            emptyText: '所属班组',
            store: {
                type: 'user.TeamStore',
                listeners: {
                    load: function(store){
                        store.insert(0,{"id": "all","name": "全部"});
                    }
                }
            },
            editable: false,
            name: 'team',
            valueField: 'id',
            displayField: 'name'
        }
	]
});