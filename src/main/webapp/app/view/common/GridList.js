Ext.define('Admin.view.common.GridList', {
    extend: 'Ext.grid.Panel',
    enableColumnHide: false,
    enableColumnMove: false,
    sortableColumns: false,
    forceFit: true,
    bind: {
        store: '{gridStore}'
    },
    listeners: {
        select: 'onItemSelected',
        deselect: 'onItemDelected'
    },
    dockedItems: [
        {
            xtype: 'pagingtoolbar',
            dock: 'bottom',
            displayInfo: true,
            bind: {
                store: '{gridStore}'
            }
        }
    ],
    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({}, cfg)]);
        if(me.toolbar){
            me.addDocked({xtype: me.toolbar});
        }
    }
    
});
