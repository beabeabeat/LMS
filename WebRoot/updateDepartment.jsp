<%@page import="com.service.EmployeeService"%>
<%@page import="com.po.Employee"%>
<%@page import="com.po.Role"%>
<%@page import="com.po.Company"%>
<%@page import="com.po.Department"%>
<%@page import="com.service.DepartmentService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改部门</title>
    
	<meta http-equiv="pragma" content="no-cache">

	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
    

  </head>
  
  <body>
 
    		<div style="margin: 15px;">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				<legend>修改部门</legend>
			</fieldset>

			<form class="layui-form" action="updateDepartmentAction.do">
			<div class="layui-form-item">
					<label class="layui-form-label">部门ID</label>
					<div class="layui-input-block">

						<p class="layui-input" >${d.did}</p>
						<input type="hidden" name="id" value='${d.did}' >
					</div>
				</div>
			
			<div class="layui-form-item">
					<label class="layui-form-label">部门名称</label>
					<div class="layui-input-block">
						<input type="text" name="dname"  value='${d.dname }' class="layui-input">
					</div>
				</div>
				
				
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">备注</label>
					<div class="layui-input-block">
						<textarea placeholder="请输入备注" class="layui-textarea"></textarea>
					</div>
				</div>
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button type="submit" class="layui-btn">立即修改</button>
						<button type="reset" class="layui-btn">重置</button>
                        <input value="返回部门管理页" type="button" onclick="javascript:window.location.href='DepartmentsManage.jsp'" class="layui-btn layui-btn-normal layui-btn-primary layui-btn-warm">
					</div>
				</div>
			</form>
		</div>
		<script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script>
			layui.use(['form'], function() {
				var form = layui.form(),
					layer = layui.layer;
			});
		</script>
  </body>
</html>
