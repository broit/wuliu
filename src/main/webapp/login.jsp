<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta charset="UTF-8">
    <title>IMMES登陆</title>

    <script  src="ext/ext-all.js"></script>
    <script  src="ext/locale/locale-zh_CN-debug.js"></script>
    
    <link rel="stylesheet" type="text/css" href="app/resources/style.css" />
</head>
<body>
	<script type="text/javascript">
		Ext.onReady(function(){
		  	 var formPanel = new Ext.FormPanel({
			   	 labelWidth: 75, // label settings here cascade unless overridden
			     frame:true,
			     bodyStyle:'padding:5px 5px 0',
			     width: 380,
			     defaults: {width: 300},
			     defaultType: 'textfield',
			     items: [{xtype:'textfield',fieldLabel: '用户名',name:'code',allowBlank: false},
			         	 {xtype:'textfield',fieldLabel: '密 码',name:'password', inputType: 'password'}]
			     })
		 	var win = new Ext.Window({   
		        title:'${base.coname}'+'用户登录', 
		        width:380,
		        autoHeight: 'true',
		        resizable: false,
		        modal:true,
		        closeAction: 'hide',
		        buttonAlign:'center',
		        items:formPanel,
		          buttons:[
		                  {text: '登陆',
		                	  handler: function login(){
		                		  var form = formPanel.getForm();
		                          if(form&&form.isValid()){
		                          form.submit({
		                              url : "/login.action",
		                              waitMsg : '正在提交数据',
		                              waitTitle : '提示',
		                              method : "POST",
		                              submitEmptyText:false,
		                              success : function(form, action) {
		                                  if(action.result.success){
		                                	  location.href='<%=basePath %>toMain.action';
		                                      win.close();
		                                  }else{
		                                      Ext.MessageBox.show({
		                                          title: '提示',
		                                          msg: '登陆失败：'+action.result.msg,
		                                          buttons: Ext.MessageBox.OK,
		                                          icon: Ext.MessageBox.ERROR
		                                      });
		                                  }
		                              },
		                              failure : function(form, action) {
		                                  Ext.MessageBox.show({
		                                      title: '提示',
		                                      msg: '登陆失败：'+action.result.msg,
		                                      buttons: Ext.MessageBox.OK,
		                                      icon: Ext.MessageBox.ERROR
		                                  });
		                              }
		                          });
		                          }else{
		                			if(name==''||pwd==''){
		                				alert('请填写登录信息');
		                				return;
		                			}
		                          }
}},
		    			  {text: '重置',handler: function(){
		               Ext.getCmp('username').setValue("");
		               Ext.getCmp('password').setValue("");
		          }}]
		     })
		  	 
				document.onkeydown = function(e){
			        var ev = document.all ? window.event : e;//判断浏览器类型
			        if(ev.keyCode==13) {
			        	login();
			        }
			    };
			    function login(){
          		  var form = formPanel.getForm();
                  if(form&&form.isValid()){
                  form.submit({
                      url : "/login.action",
                      waitMsg : '正在提交数据',
                      waitTitle : '提示',
                      method : "POST",
                      submitEmptyText:false,
                      success : function(form, action) {
                          if(action.result.success){
                        	  location.href='<%=basePath %>toMain.action';
                              win.close();
                          }else{
                              Ext.MessageBox.show({
                                  title: '提示',
                                  msg: '登陆失败：'+action.result.msg,
                                  buttons: Ext.MessageBox.OK,
                                  icon: Ext.MessageBox.ERROR
                              });
                          }
                      },
                      failure : function(form, action) {
                          Ext.MessageBox.show({
                              title: '提示',
                              msg: '登陆失败：'+action.result.msg,
                              buttons: Ext.MessageBox.OK,
                              icon: Ext.MessageBox.ERROR
                          });
                      }
                  });
                  }else{
        			if(name==''||pwd==''){
        				alert('请填写登录信息');
        				return;
        			}
                  }
			    }
		             win.show();
		})
	</script>
</body>
</html>
