Ext.define('Admin.view.main.Viewport', {
    extend: 'Ext.container.Viewport',
    xtype: 'mainviewport',
    id:'mainviewport',
    requires: [
        'Ext.list.Tree',
        'Admin.view.main.MainContainerWrap',
        'Admin.view.main.ViewportController',
        'Admin.view.main.Modify',
        'Admin.view.main.ViewportModel'
    ],

    controller: 'mainviewport',
    viewModel: {
        type: 'mainviewport'
    },

    cls: 'sencha-dash-viewport',
    itemId: 'mainView',

    layout: {
        type: 'vbox',
        align: 'stretch'
    },

    listeners: {
        render: 'onMainViewRender'
    },

    items: [
        {
            xtype: 'toolbar',
            cls: 'sencha-dash-dash-headerbar toolbar-btn-shadow',
            height: 64,
            itemId: 'headerBar',
            items: [
                {
                    xtype: 'component',
                    reference: 'senchaLogo',
                    cls: 'sencha-logo',
                    html: '<div class="main-logo">&nbsp;<img src="logo/'+sessionUiLogo+'" height="45" text-align:center">'+sessionSysname+'</div>',
                    width: 220
                },
                {
                    margin: '0 0 0 8',
                    cls: 'delete-focus-bg',
                    iconCls:'x-fa fa-navicon',
                    id: 'main-navigation-btn',
                    handler: 'onToggleNavigationSize'
                },
                {
                    xtype: 'tbspacer',
                    flex: 1
                },
//
//                {
//                    cls: 'delete-focus-bg',
//                    iconCls:'x-fa fa-bell'
//                },
//                {
//                    cls: 'delete-focus-bg',
//                    iconCls:'x-fa fa-search',
//                    href: '#search',
//                    hrefTarget: '_self',
//                    tooltip: 'See latest search'
//                },
                {
                    cls: 'delete-focus-bg',
                    iconCls:'x-fa fa-edit',
                    text:'修改密码 ',
                    listeners: {
                        click: 'onChangePassword'
                    }
                },
                {
                    cls: 'delete-focus-bg',
                    iconCls:'x-fa fa-info',
                    text: '退出',
                    href: '/exit.action',
                    hrefTarget: '_self'
                },
                {
                    xtype: 'tbtext',
                    text: sessionUserName,
                    cls: 'top-user-name'
                },
                {
                    xtype: 'image',
                    cls: 'header-right-profile-image',
                    height: 35,
                    width: 35,
                    alt:'current user image',
                    src: 'app/resources/images/user-profile/user_default1.png'
                }
            ]
        },
        {
            xtype: 'maincontainerwrap',
            id: 'main-view-detail-wrap',
            itemId: 'main-view-detail-wrap',
            reference: 'mainContainerWrap',
            flex: 1,
            items: [
                {
                    xtype: 'treelist',
                    reference: 'navigationTreeList',
                    itemId: 'navigationTreeList',
                    ui: 'navigation',
                    store: 'UserAuth',
                    width: 220,
                    expanderFirst: false,
                    expanderOnly: false,
                    singleExpand: true,
                    listeners: {
                        selectionchange: 'onNavigationTreeSelectionChange'
                    }
                    ,onNodeCollapse: function (node) {//重写方法
                        var item = this.itemMap[node.internalId];
                        if (item) {
                            //treelist配置singleExpand=true时,节点关闭后不会自动调用父容器的updateLayout()
                            //传入false,在节点关闭动画后会调用父容器的updateLayout()
                            item.nodeCollapse(node, false);
                        }
                    }
                },
                {
                    xtype: 'container',
                    flex: 1,
                    reference: 'mainCardPanel',
                    cls: 'sencha-dash-right-main-container',
                    itemId: 'contentPanel',
                    layout: {
                        type: 'card',
                        anchor: '100%'
                    },
                    listeners:{
                        add: 'onAdd'
                    }
                }
            ]
        }
    ]
});
