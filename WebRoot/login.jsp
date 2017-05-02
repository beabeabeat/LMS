<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>物流管理系统</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/login.css" />
	</head>

	<body class="beg-login-bg">
		<div class="beg-login-box">
			<header>
				<h1>物流管理系统</h1>
			</header>
			<div class="beg-login-main">
				<form  class="layui-form" method="post" action="validateLogin.action"> <input name="__RequestVerificationToken" type="hidden"  />
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
						<input type="text" name="ename" lay-verify="userName" autocomplete="off" placeholder="这里输入登录名" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="password" lay-verify="password" autocomplete="off" placeholder="这里输入密码" class="layui-input">
					</div>
					<div >
						<div class="beg-pull-left">
                        <input value="登陆" type="submit" class="layui-btn layui-btn-primary">
						</div>
						<div class="beg-clear"></div>
					</div>
				</form>
			</div>
			<footer>
				<p>&copy; 2016 Powered by alex</p>
			</footer>
		</div>

	</body>

</html>