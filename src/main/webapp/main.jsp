<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta charset="UTF-8">

    <title>IMMES管理</title>
    <script src="ext/ext-all.js"></script>
    <script src="ext/locale/locale-zh_CN-debug.js"></script>
    <script  src="Popup.js"></script>
    <script  src="app/view/material/Notification.js"></script>
    <script type="text/javascript">
    var ROOT = window.location.protocol+"//"+window.location.host;
    
 	var sessionUserid='${sessionScope.loginUser.userId}';
 	var sessionUserName='${sessionScope.loginUser.userName}';
 	var sessionSysname='${sessionScope.baseCo.sysname}';
 	var sessionConame='${sessionScope.baseCo.coname}';
 	var sessionUiLogo='${sessionScope.baseCo.uiLogo}';

    var host=(window.location.protocol == 'http:') ? 'ws://' : 'wss://' ; 
	host += window.location.host + '/messageWebsocket/'+sessionUserid;
	
	var webSocket = 
		new WebSocket(host);

	webSocket.onerror = function(event) {
		onError(event);
	};

	webSocket.onopen = function(event) {
		onOpen(event);
	};

	webSocket.onmessage = function(event) {
		onMessage(event);
	};

	function onOpen(event) {	
		refreshMessage(event);
	};

	
	function refreshMessage(event) {
        var task = {
            run: function () {
                Ext.Ajax.request({	                    	 
                    url: '/frameWork.action',
                    method: 'POST'
                });
            },
            interval: 3600000
        }
        var runner = new Ext.util.TaskRunner();
        runner.start(task);
	};
	
	function onError(event) {
		alert("登录超时,系统将自动跳转到登陆页面,请重新登录!");
		top.window.location.href="/welcome.action";
	};

    </script>


    <script type="text/javascript">
		//ext session 过期处理  
		Ext.Ajax.on('requestcomplete',checkSessionStatus, this);         
		function checkSessionStatus(conn,response,options){
	    	var json = Ext.decode(response.responseText);
	    	if(typeof json == 'object' 
				&& !json.success 
				&& json.timeout){
				alert("登录超时,系统将自动跳转到登陆页面,请重新登录!");
				top.window.location.href = json.redirectUri;				
			}
		          
		}  


    	
        var Ext = Ext || {}; // Ext namespace won't be defined yet...

        Ext.auth = ${auth};
        Ext.author = Ext.auth.operMap;
        
        Ext.sysparam = ${sysparam};
        
        Ext.userlevel = ${userlevel};
        
        Ext.message = ${message};

        Ext.Loader.setConfig({  
            enabled:true,  
            paths:{  
                'Ext.ux':'ext/ux',
                'Ext.chart':'ext/chart',
                'Ext.draw':'ext/draw'
            }  
        });  
    </script>
    <!-- The line below must be kept intact for Sencha Cmd to build your application -->
    <script src="app/app.js"></script>
    <link rel="stylesheet" type="text/css" href="app/resources/style.css" />
    <!--[if IE 7]>
    <link rel="stylesheet" href="app/resources/font-awesome-ie7.min.css">
    <![endif]-->
    <style type="text/css">
        .x-text-readonly .x-form-field{
            background:#E6E6E6;
            color:#999
        }
    </style>
    
    <!-- 打印组件 -->
	<script language="javascript" src="${pageContext.request.contextPath}/lodop/LodopFuncs.js"></script>
	<object  id="LODOP_OB" classid="clsid:2105C259-1E0C-4534-8141-A753534CB4CA" width=0 height=0> 
		<embed id="LODOP_EM" type="application/x-print-lodop" width=0 height=0></embed>
	</object>
</head>
<body>

</body>
</html>
