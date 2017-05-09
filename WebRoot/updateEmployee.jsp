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
    
    <title>修改员工</title>
    
	<meta http-equiv="pragma" content="no-cache">

	<link rel="stylesheet" href="plugins/layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">
    

  </head>
  
  <body>
 
    		<div style="margin: 15px;">
			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
				<legend>修改员工</legend>
			</fieldset>

			<form class="layui-form" action="updateEmployeeAction.do">
			<div class="layui-form-item">
					<label class="layui-form-label">员工ID</label>
					<div class="layui-input-block">

						<p class="layui-input" >${e.eid}</p>
						<input type="hidden" name="id" value='${e.eid}' >
						<input type="hidden" name="regTime" value='${e.regTime}' >
					</div>
				</div>
				
				<div class="layui-form-item">
					<label class="layui-form-label">员工姓名</label>
					<div class="layui-input-block">
						<input type="text" name="ename"  value='${e.ename}' class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">员工密码</label>
					<div class="layui-input-block">
						<input type="text" name="password"  value='${e.password}' class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">真实姓名</label>
					<div class="layui-input-block">
						<input type="text" name="realName"  value='${e.realName}' class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">手机号码</label>
					<div class="layui-input-block">
						<input type="text" name="phoneNumber"  value='${e.phoneNumber}' class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">所属公司</label>
					<div class="layui-input-inline">
						<select name="company">
							<option value="">--请选择所属公司--</option>
							<%List<Company> listCompany=(List<Company>)session.getAttribute("allCompany"); 
							for(Company c:listCompany){%>
							<option value="<%=c.getCid()%>"><%=c.getCname() %></option>
							<%} %>
						</select>
					</div>
					<label class="layui-form-label">所属部门</label>
					
					<div class="layui-input-inline">
						<select name="department">
						<option value="">--请选择所属部门--</option>
						<% List<Department> list=(List<Department>)session.getAttribute("allDepartment");
						for(Department d:list){%>
						
						
						 <option value="<%=d.getDid()%>"><%=d.getDname() %></option>
						<%
						}
					    %>
						</select>
					</div>
					<label class="layui-form-label">所属角色</label>
					<div class="layui-input-inline">
						<select name="roleID">
							<option value="">--请选择所属角色--</option>
							<% List<Role> listRole=(List<Role>)session.getAttribute("allRole");
						for(Role r:listRole){%>
							 <option value="<%=r.getRid()%>"><%=r.getRname() %></option>
						<%
						}
					    %>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">员工状态</label>
					<div class="layui-input-block">
						<input type="radio" name="eState" value="1" title="在职" checked="checked">
						<input type="radio" name="eState" value="0" title="离职" >
						<input type="radio" name="eState" value="2" title="休假">
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
                        <input value="返回员工管理页" type="button" onclick="javascript:window.location.href='employeesManage.jsp'" class="layui-btn layui-btn-normal layui-btn-primary layui-btn-warm">
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
