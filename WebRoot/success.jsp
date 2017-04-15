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

  </head>
  
  <body>
	<div class="main">
	  <div class="container">

			<div class="w3l-txt">
					<div class="four-grids">
					<div class="col-md-3 four-grid">
						
							<div class="icon">
								<i class="glyphicon glyphicon-ok-sign"></i>
								<div class="four-text">
								<h3>添加成功！</h3>								
							    </div>							
						</div>

			     </div>	
			</div>					
	   </div>
	  </div>
	</div>
  </body>
</html>
