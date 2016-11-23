Ext.define('Admin.view.role.RoleMessage', {
	extend: 'Admin.view.common.Form',
	controller : 'roleController',
    width: 480,
    height: 340,
	title: '消息类型',
    idColumn: 'roleUid',//主键列名
    //保存添加url
    addUrl: '/role/RoleMessage.action',
    //加载表单地址
    loadUrl: '/role/RoleMessage/',
    //修改地址
    modifyUrl: '/role/RoleMessage.action',
	items:[
        {
            items:[
                {
                    xtype: 'hiddenfield',
                    name: 'roleid'
                },
                {
                	xtype: 'hiddenfield',
                	name: 'id'
                },
                {
                	fieldLabel: '角色名',
                	xtype: 'displayfield',
                    name: 'roleName',
                    allowBlank: false
                },
                {
                 	xtype:'checkboxgroup',
                 	emptyText : '消息类型',
                    name:'checkboxgroup',
                 	fieldLabel : '消息类型',
                    width:400,
                    border: true,                       
                    items:[
                     {
                         boxLabel:'库存报警',
                         name: 'waring',
                         inputValue:'11'
                     }
                     ,{
                         boxLabel:'库存预报警',
                         name: 'forecast',
                         inputValue:'12'
                     },{
                         boxLabel:'入库消息',
                         name: 'eMessage',
                         inputValue:'21'                        
                     }
                     ,{
                         boxLabel:'出库消息',
                         name: 'dMessage',
                         inputValue:'22'
                     }
                   ]                              
                 }
            ]
        }
    ],
    loadCallback:function(form,response){
        var me = this;
        var roleName = form.findField('roleName').setValue(me.roleName);
        var roleid = form.findField('roleid').setValue(me.roleUid);
      if(response.result.data!=null){
	        var list = response.result.data; 
	        var group = form.findField('checkboxgroup');

				 for(var k=0;k<list.length;k++){
				        	var data=list[k];				        	
					        for(var i=0;i<group.items.length;i++){ 
			                     if(group.items.get(i).inputValue==data.mtype){
			                         group.items.get(i).setValue(true);
			                         break;
			                     }
					        }
		          }
      }
}
});