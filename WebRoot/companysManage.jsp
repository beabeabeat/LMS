<%@page import="com.po.Employee"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags"  prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showAllEmployees.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta charset="UTF-8">
		<title>Table</title>
		<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="css/global.css" media="all">
		<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/table.css" />

  </head>
  
  <body>
		<div class="admin-main">
		<blockquote class="layui-elem-quote">
		<fieldset class="layui-elem-field layui-field-title">
				<legend>公司操作</legend>
			</fieldset>
		<div class="layui-inline"><a href="" class="layui-btn layui-btn-primary layui-btn-radius layui-btn-danger">
			<i class="layui-icon">&#xe612;</i>查看/删除公司
		 </a></div>
		<div class="layui-inline"><a href="" class="layui-btn layui-btn-primary layui-btn-radius layui-btn-warm">
			<i class="layui-icon">&#xe608;</i>新增公司
		 </a></div>	 
		 </blockquote>
		<blockquote class="layui-elem-quote"> 
		<fieldset class="layui-elem-field layui-field-title">
				<legend>公司查询</legend>
			</fieldset>
		<div class="layui-inline">			
						<center><form action="" method="post">
						<input type="text" name="cname" id="eid" placeholder="请输入公司名称"  class="layui-input" />
                        <input type="submit" value="根据公司名称查询" class="layui-btn  layui-btn-normal layui-btn-primary layui-btn-radius" />
                        </form></center></div>
		    				
		<div class="layui-inline">			
						<center><form action="" method="post">
						<input type="text" name="address" placeholder="请输入公司地址"  class="layui-input" />
                        <input type="submit" value="根据公司地址" class="layui-btn layui-btn-primary layui-btn-radius layui-btn-warm"/>
                        </form></center></div>	
                        	
			</blockquote>
			</div>
	</body>
</html>
