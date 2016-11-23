Ext.define('Admin.view.func.List', {
    extend: 'Admin.view.common.GridList',
    xtype: 'funcList',
    reference : 'funcListGrid',
    columns: [
        {hidden: true,dataIndex: 'funcUid'},
        {hidden: true, dataIndex: 'funcParent'},
        {text: '所属功能', dataIndex: 'funcParentName'},
        {text: '级别', dataIndex: 'funcLevel'},
        {text: '名称', dataIndex: 'funcName'},
        {text: '编码',  dataIndex: 'funcCode' },
        {text: 'URL', dataIndex: 'funcUrl'},
        {text: '图标', dataIndex: 'funcImg',align:'center'
            ,renderer:function(value){
                return '<i class="x-fa '+value+'"></i>';
            }},
        {text: '排序', dataIndex: 'funcIserial'},
        {text: '备注', dataIndex: 'funcRemark'}
    ],
    toolbar : 'funcGridToolbar'
});
