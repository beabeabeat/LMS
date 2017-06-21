<%@page import="com.po.Company"%>
<%@page import="com.po.Department"%>
<%@page import="com.service.DepartmentService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加公司</title>
    
	<meta http-equiv="pragma" content="no-cache">

	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
	
    

  </head>
  
  <body>
    		<div style="margin: 15px;">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				<legend>添加公司</legend>
			</fieldset>

			<form name="myform" class="layui-form" action="addCompanyAction">
				<div class="layui-form-item">
					<label class="layui-form-label">公司名称</label>
					<div class="layui-input-block">
						<input type="text" name="cname"  placeholder="请输入公司名称" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">负责人</label>
					<div class="layui-input-block">
						<input type="text" name="header"  placeholder="请输入负责人" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">负责人电话</label>
					<div class="layui-input-block">
						<input type="text" name="headerPhone"  placeholder="请输入负责人电话" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">公司电话</label>
					<div class="layui-input-block">
						<input type="text" name="companyPhone"  placeholder="请输入公司电话" class="layui-input">
					</div>
				</div>
				
				<div class="layui-form-item">
					<div class="layui-inline">
						<label class="layui-form-label">省份</label>
						<div class="layui-input-block">
							<input type="text" name="province" placeholder="请输入省份"  class="layui-input">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">城市</label>
						<div class="layui-input-block">
							<input type="text" name="city" placeholder="请输入城市" class="layui-input">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">区县</label>
						<div class="layui-input-block">
							<input type="text" name="county" placeholder="请输入区县" autocomplete="off" class="layui-input">
						</div>
					</div>
					<div class="layui-inline">
						<label class="layui-form-label">街道</label>
						<div class="layui-input-block">
							<input type="text" name="street" placeholder="请输入街道" class="layui-input">
						</div>
					</div>
				</div>
			
				<div class="layui-form-item">
					<label class="layui-form-label">区域</label>
					<div class="layui-input-block">
						<input type="text" name="zone"  placeholder="请输入区域" class="layui-input">
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
						<button type="submit" class="layui-btn">立即添加</button>
						<button type="reset" class="layui-btn">重置</button>
                        <input value="返回公司管理页" type="button" onclick="javascript:window.location.href='companiesManage.jsp'" class="layui-btn layui-btn-normal layui-btn-primary layui-btn-warm">
					</div>
				</div>
			</form>
		</div>
		<script type="text/javascript" src="plugins/layui/layui.js"></script>
		<script type="text/javascript">
			layui.use(['form'], function() {
				var form = layui.form(),
					layer = layui.layer;
			});
		</script>
  </body>
</html>
