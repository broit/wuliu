Ext.define('Admin.view.user.UserForm', {
	extend: 'Admin.view.common.Form',
	controller : 'userController',
    width: 380,
    height: 540,
	title: '用户信息',
    //保存添加url
    addUrl: '/user/save.action',
    //加载表单地址
    loadUrl: '/user/',
    //修改地址
    modifyUrl: '/user/save.action',
	items:[
        {
            reference: 'UserForm',
            items:[
                {
                    xtype: 'hiddenfield',
                    name: 'id'
                },{
                    xtype: 'hiddenfield',
                    name: 'status'
                },
                {
                    emptyText : '登录名',
                    fieldLabel: '登录名',
                    name: 'code',
                    allowBlank: false
                },
                {
                    emptyText : '姓名',
                    fieldLabel: '姓名',
                    name: 'name',
                    allowBlank: false
                },
                {
                    emptyText : '密码',
                    fieldLabel: '密码',
                    name: 'password',
                    // allowBlank: false,
                    inputType: 'password',
                    cls: 'wizard-form-break',
                    listeners: {
                        validitychange: 'validateField',
                        blur: 'validateField'
                    }
                },
                {
                    emptyText : '密码确认',
                    fieldLabel: '密码确认',
                    inputType: 'password',
                    name: 'repassword',
                    // allowBlank: false,
                    vtype: 'password',
                    initialPassField: 'password'
                },
                {
                    emptyText : '电话',
                    fieldLabel: '电话',
                    name: 'mobile'
                },
                {
                    xtype: 'combobox',
                    fieldLabel: '级别',
                    name: 'rank',
                    allowBlank: false,
                    editable: false,
                    displayField: 'name',
                    valueField: 'level',
                    queryMode: 'local',
                    store: {
                        type: 'user.LevelStore'
                    }
                },
                {
                    xtype: 'combobox',
                    fieldLabel: '职务',
                    name: 'job',
                    displayField: 'name',
                    valueField: 'id',
                    queryMode: 'local',
                    store: {
                        type: 'param.ParamStore'
                    }
                },
                {
                    xtype: 'combobox',
                    fieldLabel: '所属公司',
                    name: 'branch',
                    displayField: 'name',
                    valueField: 'id',
                    queryMode: 'local',
                    store: {
                        type: 'workshop.BranchStore'
                    }
                },
                {
                    xtype: 'combobox',
                    fieldLabel: '所属车间',
                    // editable: false,
                    name: 'ws',
                    displayField: 'name',
                    valueField: 'id',
                    queryMode: 'local',
                    store: {
                        type: 'team.WorkshopStore'
                    }
                },
                {
                    xtype: 'combobox',
                    fieldLabel: '所属班组',
                    // editable: false,
                    name: 'team',
                    displayField: 'name',
                    valueField: 'id',
                    queryMode: 'local',
                    store: {
                        type: 'user.TeamStore'
                    }
                }
            ]
        }
    ]
    ,onSave:function(btn){
        var win = btn.up('window');
        var currentView = win.getController().getViewModel().getData().currentView;
        if(win){
            var form = win.down('form').getForm();
            var level = form.findField("rank").getValue();
            if(level==5){
                var team = form.findField("team").getValue();
                if(team==""||team==null){
                    Ext.MessageBox.show({
                                title: '提示',
                                msg: '请给员工用户指定所属班组',
                                buttons: Ext.MessageBox.OK,
                                icon: Ext.MessageBox.ERROR
                            });
                    return;
                }
            }else if(level==4){
                var team = form.findField("team").getValue();
                if(team==""||team==null){
                    Ext.MessageBox.show({
                                title: '提示',
                                msg: '请给班组用户指定所属班组',
                                buttons: Ext.MessageBox.OK,
                                icon: Ext.MessageBox.ERROR
                            });
                    return;
                }
            }else if(level==3){
                var ws = form.findField("ws").getValue();
                if(ws==""||ws==null){
                    Ext.MessageBox.show({
                                title: '提示',
                                msg: '请给车间用户指定所属车间',
                                buttons: Ext.MessageBox.OK,
                                icon: Ext.MessageBox.ERROR
                            });
                    return;
                }
            }else if(level==2){
                var branch = form.findField("branch").getValue();
                if(branch==""||branch==null){
                    Ext.MessageBox.show({
                                title: '提示',
                                msg: '请给分公司用户指定所属分公司',
                                buttons: Ext.MessageBox.OK,
                                icon: Ext.MessageBox.ERROR
                            });
                    return;
                }
            }
            if(form&&form.isValid()){
                    form.submit({
                        url : win.addUrl||win.modifyUrl,
                        waitMsg : '正在提交数据',
                        waitTitle : '提示',
                        method : "POST",
                        submitEmptyText:false,
                        success : function(form, action) {
                            if(action.result.success){
                                var grid = currentView.lookupReference(currentView.getViewModel().getData().grid);
                                grid.getStore().reload();
                                if(win.saveCallback){
                                    win.saveCallback(form,action);
                                }
                                win.close();
                            }else{
                                Ext.MessageBox.show({
                                    title: '提示',
                                    msg: '保存失败：'+action.result.msg,
                                    buttons: Ext.MessageBox.OK,
                                    icon: Ext.MessageBox.ERROR
                                });
                            }
                        },
                        failure : function(form, action) {
                            Ext.MessageBox.show({
                                title: '提示',
                                msg: '保存失败：'+action.result.msg,
                                buttons: Ext.MessageBox.OK,
                                icon: Ext.MessageBox.ERROR
                            });
                        }
                    });
            }/*else{
            }*/
        }
    }
    ,showAddCallback: function(){
        var me = this;
        var form = this.down('form').getForm();
        form.findField("branch").getStore().on({
            load: function(store){
                store.removeAt(0);
            }
        });
        form.findField("branch").getStore().reload();

        form.findField("job").getStore().reload({params:{type: Ext.sysparam.JOB.type}});
        //给combo加监听
        me.addBranchComboListener();
        me.addWsComboListener();
    },loadCallback: function(form,response){
        var me = this;
        //字段填充
        form.findField("repassword").setValue(response.result.data.password);
        form.findField("job")
            .getStore()
            .loadData(response.result.data.jobList);
        form.findField("job").setValue(response.result.data.job);

        form.findField("branch")
            .getStore()
            .loadData(response.result.data.branchList);
        form.findField("branch").setValue(response.result.data.branch);

        form.findField("ws")
            .getStore()
            .loadData(response.result.data.wsList||[]);
        form.findField("ws").setValue(response.result.data.ws);
        form.findField("team")
            .getStore()
            .loadData(response.result.data.teamList||[]);
        form.findField("team").setValue(response.result.data.team);

        //给combo加监听
        me.addBranchComboListener();
        me.addWsComboListener();
    },
    addBranchComboListener: function(){//公司与车间的联动事件,独立出来为了在表单加载的时候不再重复查询
        var me = this;
        var form = this.down('form').getForm();
        var branch = form.findField("branch");
        branch.on({
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
            });
    },
    addWsComboListener: function(){//车间与班组联动
        var me = this;
        var form = this.down('form').getForm();
        var ws = form.findField("ws");
        ws.on({
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
            });
    }
});