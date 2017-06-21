<%@page import="com.po.Employee"%>
<%@page errorPage="errorpage.jsp"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<% Employee employee=(Employee)session.getAttribute("employee"); 
	   if(employee==null){	   
	   response.sendRedirect("login.jsp");
	   return;
	}%>
     <script type="text/javascript"> 
          window.onload=function(){ 
          var info="欢迎您,<%=((Employee)session.getAttribute("employee")).getEname() %>！"; 
          alert(info); 
          } 
     </script>
	 <head>
		<meta charset="utf-8">
		<title>物流管理系统</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/global.css" media="all">
		<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
	</head>
	<body>
	
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header header header-demo">
				<div class="layui-main">
					<div class="admin-login-box">
						<a class="logo" style="left: 0;" href="index.jsp">
							<span style="font-size: 22px;">物流管理系统</span>
						</a>
						<div class="admin-side-toggle">
							<i class="fa fa-bars" aria-hidden="true"></i>
						</div>       
						
					</div>
					
					<div class="layui-main" style="margin-left: 600;margin-top: -45">
					<a >
							<i class="fa fa-volume-up" aria-hidden="true"></i>
							<span style="font-size:18px;">欢迎使用物流管理系统</span>
						</a>
					</div>
					
					
             
					<ul class="layui-nav admin-header-item">
						<li class="layui-nav-item">
							<a href="javascript:;" class="admin-header-user">
								<img src="images/alex.jpg" />
								<span><%=((Employee)session.getAttribute("employee")).getEname() %></span>
							</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="javascript:onclick()" ><i class="fa fa-user-circle" aria-hidden="true"></i>个人信息</a>
								</dd>
								<dd>
									<a href="javascript:logout()"><i class="fa fa-sign-out" aria-hidden="true" ></i>注销</a>
								</dd>
							</dl>
						</li>
					</ul>
				</div>
			</div>
			<div class="layui-side layui-bg-black" id="admin-side">
				<div class="layui-side-scroll" id="admin-navbar-side" lay-filter="side"></div>
			</div>
			<div class="layui-body" style="bottom: 0;border-left: solid 2px #1AA094;" id="admin-body">
				<div class="layui-tab admin-nav-card layui-tab-brief" lay-filter="admin-tab">
					<ul class="layui-tab-title">
						<li class="layui-this">
							<i class="fa fa-dashboard" aria-hidden="true"></i>
							<cite>控制面板</cite>
						</li>
					</ul>
					<div class="layui-tab-content" style="min-height: 150px; padding: 5px 0 0 0;">
						<div class="layui-tab-item layui-show">
							<iframe src="dashboard.jsp"></iframe>
						</div>
					</div>
				</div>
			</div>
			<div class="layui-footer footer footer-demo" id="admin-footer">
				<div class="layui-main">
					<p>&copy; 2017 Powered by alex
					</p>
				</div>
			</div>
			<script type="text/javascript" src="plugins/layui/layui.js"></script>
			<script type="text/javascript" src="js/nav.js"></script>
			<script type="text/javascript" src="js/nav_normal.js"></script>
			<script src="js/index.js"></script>
		<!-- 超级管理员  显示所有功能-->
        <%if(employee.getEname().toString().equals("alex")){%>
			<script type="text/javascript">
			layui.config({base: 'js/'}).use(['navbar', 'tab'], function() {
		    navbar = layui.navbar(),
		    tab = layui.tab({
			elem: '.admin-nav-card' //设置选项卡容器
		     });
	        //设置navbar
	        navbar.set({
		    spreadOne: true,
		    elem: '#admin-navbar-side',
		    cached: true,
		    data: navs
	           });
	        //渲染navbar
	        navbar.render();
	        //监听点击事件
	        navbar.on('click(side)', function(data) {
		    tab.tabAdd(data.field);
	        });
        });
		</script>
		<%} else{%>
		<!-- 非超级管理员  显示部分功能-->
		<script type="text/javascript">
			layui.config({base: 'js/'}).use(['navbar', 'tab'], function() {
		    navbar = layui.navbar(),
		    tab = layui.tab({
			elem: '.admin-nav-card' //设置选项卡容器
		     });
	        //设置navbar
	        navbar.set({
		    spreadOne: true,
		    elem: '#admin-navbar-side',
		    cached: true,
		    data: navs_normal
	           });
	        //渲染navbar
	        navbar.render();
	        //监听点击事件
	        navbar.on('click(side)', function(data) {
		    tab.tabAdd(data.field);
	        });
        });
		</script>
		
		<%} %>
		</div>
		<script>
		var myInfo={
		"title": "查看个人信息",
		"icon": "&#xe649;",
		"href": "myInfo.jsp"}
         function onclick(){
            tab.tabAdd(myInfo)
        }
        function logout(){
        if(confirm("您确定注销吗,注销后将跳转到登录界面！")){          
          window.location.href='logOutAction.do';
          //setTimeout("javascript:location.href='logOutAction.do'", 3000);
              }else{  
                return;  
                } 
              }  
			</script>
	</body>
</html>