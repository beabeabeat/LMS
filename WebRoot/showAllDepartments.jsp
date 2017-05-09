<%@page import="com.po.Department"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.po.Company"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryEmployees.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
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
			<div class="layui-inline"><a href="departmentsManage.jsp" class="layui-btn  ">
			<i class="layui-icon">&#xe603;</i>返回部门管理页
		    </a></div>	
			</blockquote>		
			<fieldset class="layui-elem-field">
				<legend>部门列表</legend>
				<div class="layui-field-box">
					<table class="site-table table-hover">
						<thead>
							<tr>
								<th>部门ID</th>
								<th>部门名称</th>
								<th>操作</th>
							</tr>
						</thead>
		<%List<Department> list=(List<Department>)session.getAttribute("departmentList");
		int pages = 1;
		String mypage = request.getParameter("page");
  	    if(mypage != null){
  		    pages = Integer.parseInt(mypage);
  	      }
  	    int pageNum =7;//每页显示条数
  	    int startNum = (pages - 1) * pageNum;
  	    int endNum= startNum + pageNum;
  	    if(endNum > list.size()){
  		    endNum = list.size();
  	}
  	    int pageCount = list.size() / pageNum;
  	    if(list.size() % pageNum != 0){
  	        pageCount = pageCount + 1;}%>  				
						<tbody>	
						<%for(int i = startNum;i < endNum;i++){
                         Department d = list.get(i);%>
                        <tr>
                            <td><%=d.getDid() %></td>
                            <td><%=d.getDname() %></td>
                            <td>
									<a href="updateDepartmentRedirectAction.do?did=<%=d.getDid() %>" class="layui-btn layui-btn-mini   layui-btn-mini">修改</a>
									<a href="deleteDepartmentAction?did=<%=d.getDid() %>" class="layui-btn layui-btn-danger layui-btn-mini">删除</a>
								</td>                       
                        </tr><%} %>														
						</tbody>						
					</table>
				</div>
			</fieldset>
			<center><div class="admin-table-page" >   
			<%if(pages != 1){%>                
                    <p class="layui-btn layui-btn-small" ><a href='showAllDepartments.jsp?page=<%= (pages-1)%>'>上一页</a></p>
                    <%}
                    if(pages != pageCount){%>                  
                    <p class="layui-btn layui-btn-small" ><a href='showAllDepartments.jsp?page=<%= (pages+1)%>'>下一页</a></p>  
                    <%}%>                 
				</div></center>
			</div>
	</body>
</html>
