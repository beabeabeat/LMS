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
			<div class="layui-inline"><a href="companiesManage.jsp" class="layui-btn  ">
			<i class="layui-icon">&#xe603;</i>返回公司管理页
		    </a></div>	
			</blockquote>		
			<fieldset class="layui-elem-field">
				<legend>公司列表</legend>
				<div class="layui-field-box">
					<table class="site-table table-hover">
						<thead>
							<tr>
								<th>公司ID</th>
								<th>公司名称</th>
								<th>负责人</th>
								<th>负责人电话</th>
								<th>公司电话</th>
								<th>公司地址</th>
								<th>公司区域</th>
								<th>操作</th>
							</tr>
						</thead>
		<%List<Company> list=(List<Company>)session.getAttribute("companyList");
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
                         Company c = list.get(i);%>
                        <tr>
                            <td><%=c.getCid() %></td>
                            <td><%=c.getCname() %></td>
                            <td><%=c.getHeader() %></td>
                            <td><%=c.getHeaderPhone() %></td>
                            <td><%=c.getCompanyPhone() %></td>
                            <td><%=c.getProvince()+c.getCity()+c.getCounty()+c.getStreet() %></td>
                            <td><%=c.getZone()%></td>
                            <td>
									<a href="updateCompanyRedirectAction?cid=<%=c.getCid()%>" class="layui-btn layui-btn-mini   layui-btn-mini">修改</a>
									<a href="deleteCompanyAction?cid=<%=c.getCid() %>" class="layui-btn layui-btn-danger layui-btn-mini">删除</a>
								</td>                       
                        </tr><%} %>														
						</tbody>						
					</table>
				</div>
			</fieldset>
			<center><div class="admin-table-page" >   
			<%if(pages != 1){%>                
                    <p class="layui-btn layui-btn-small" ><a href='showAllCompanies.jsp?page=<%= (pages-1)%>'>上一页</a></p>
                    <%}
                    if(pages != pageCount){%>                  
                    <p class="layui-btn layui-btn-small" ><a href='showAllCompanies.jsp?page=<%= (pages+1)%>'>下一页</a></p>  
                    <%}%>                 
				</div></center>
			</div>
	</body>
</html>
