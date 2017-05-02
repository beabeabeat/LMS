<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.po.Employee"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'myInfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="css/global.css" media="all">
	<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/table.css" />

  </head>
  
  <body>
  <%Employee e=(Employee)session.getAttribute("employee"); %>
    <div style="margin: 15px;">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				<legend>我的信息</legend>
			</fieldset>

			<form class="layui-form">
				<div class="layui-form-item">
					<label class="layui-form-label">ID:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getEid() %></span>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">用户名:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getEname() %></span>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">真实姓名:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getRealName() %></span>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">手机号:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getPhoneNumber() %></span>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">所属公司:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getCompany() %></span>
					</div>
				</div>	
				<div class="layui-form-item">
					<label class="layui-form-label">所属部门:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getDepartment() %></span>
					</div>
				</div>	
				<div class="layui-form-item">
					<label class="layui-form-label">所属角色:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getRoleID() %></span>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">状态:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.geteState() %></span>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">注册时间:</label>
					<div class="layui-input-block">
						<span class="layui-input"><%=e.getRegTime()%></span>
					</div>
				</div>				
				
			</form>
		</div>
  </body>
</html>
