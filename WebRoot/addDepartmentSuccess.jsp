<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'success.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="css/login.css" />

  </head>
  
  <body class="main">

	<div class="beg-login-box2">
	  <div class="beg-login-main">
				<div  class="layui-form" >
	                
	                <center><table class="layui-input-inline">
	                <tr class="four-grid"><br>                
						<td><i class="glyphicon glyphicon-ok-sign"></i></td>				
						<td><h3>&nbsp;&nbsp;&nbsp;添加部门成功！</h3></td>						
						</tr>	
					</table></center>					
					<div >
						<div class="beg-pull-left">
						<br><br>
                        <input value="返回部门管理页" type="button" onclick="javascript:window.location.href='departmentsManage.jsp'" class="layui-btn layui-btn-normal layui-btn-primary layui-btn-warm">
						</div>
						<div class="beg-clear"></div>
					</div>
				</div>
			</div>
       </div>

  </body>
</html>
