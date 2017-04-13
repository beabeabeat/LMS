<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Error Page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
    <link href="css/style.css" rel='stylesheet' type='text/css' />

  </head>
  
  <body>
    <div class="main">
	<div class="container">
		<div class="agile">
			
			<div class="w3l-txt">
				<div class="text">
					<h1>没有找到此页面</h1>	
					
					<p>对不起，我们没有找到此页面</p>
					<p>请检查您的URL或者<a href="index.jsp">回到主页</a></p>
				</div>
				<div class="image">
					<img src="images/smile.png">
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="back">
						<a href="index.jsp">回到主页</a>
				</div>
				<div class="footer">
					<p>&copy; 2016 Powered by alex</p>
				</div>					
	</div>
	</div>
	</div>
  </body>
</html>
