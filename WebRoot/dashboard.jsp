<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'dashboard.jsp' starting page</title>
	<meta name="apple-mobile-web-app-status-bar-style" content="black">
	<meta name="apple-mobile-web-app-capable" content="yes">
	<meta name="format-detection" content="telephone=no">
	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css" />
	<link rel="stylesheet" href="css/layout.css" media="all" />
		
	<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
    <link href="css/style.css" rel='stylesheet' type='text/css' />

  </head>
  
  <body>
    <div>
			<blockquote class="layui-elem-quote">
			<fieldset class="layui-elem-field">
				<legend>控制面板</legend>
				<div class="layui-field-box">
							
				<div class="four-grids">
					<div class="col-md-3 four-grid">
						<div class="four-agileits">
							<div class="icon">
								<i class="glyphicon glyphicon-user"></i>
							</div>
							<div class="four-text">
								<h3>员工数量</h3>
								<h4> 24,420  </h4>								
							</div>							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-agileinfo">
							<div class="icon">
								<i class="glyphicon glyphicon-list-alt"></i>
							</div>
							<div class="four-text">
								<h3>订单数量</h3>
								<h4>15,520</h4>

							</div>
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-w3ls">
							<div class="icon">
								<i class="glyphicon glyphicon-folder-open"></i>
							</div>
							<div class="four-text">
								<h3>销售总额</h3>
								<h4>12,430</h4>
								
							</div>
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-wthree">
							<div class="icon">
								<i class="glyphicon glyphicon-briefcase"></i>
							</div>
							<div class="four-text">
								<h3>已配送</h3>
								<h4>14,430</h4>
								
							</div>
							
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				
								
				</div>
				
				<div class="layui-field-box">
							
				<div class="four-grids">
					<div class="col-md-3 four-grid">
						<div class="four-wdddd">
							<div class="icon">
								<i class="glyphicon glyphicon-shopping-cart"></i>
							</div>
							<div class="four-text">
								<h3>待收货</h3>
								<h4> 24,420  </h4>								
							</div>							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-waaaa">
							<div class="icon">
								<i class="glyphicon glyphicon-retweet"></i>
							</div>
							<div class="four-text">
								<h3>待发货</h3>
								<h4>15,520</h4>

							</div>
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-wbbbb">
							<div class="icon">
								<i class="glyphicon glyphicon-magnet"></i>
							</div>
							<div class="four-text">
								<h3>已配送</h3>
								<h4>12,430</h4>
								
							</div>
							
						</div>
					</div>
					<div class="col-md-3 four-grid">
						<div class="four-wcccc">
							<div class="icon">
								<i class="glyphicon glyphicon-plane"></i>
							</div>
							<div class="four-text">
								<h3>未配送</h3>
								<h4>14,430</h4>
								
							</div>
							
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
				
								
				</div>
				
							
			</fieldset>
			</blockquote>		
		</div>	

  </body>
</html>
