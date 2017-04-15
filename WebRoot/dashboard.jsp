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
								<i class="glyphicon glyphicon-ok-sign"></i>
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
				
				
                      <div >
                            <div class="card">
                                <div class="card-body">
                                    <div class="widget widget-report-table">
                                        <header class="widget-header m-b-15">
                                        </header>
                                        
                                        <div class="row m-0 md-bg-grey-100 p-l-20 p-r-20">
                                            <div class="col-md-6 col-sm-6 col-xs-6 w3layouts-aug">
                                                <h3>最近订单</h3>
                                                <p>REPORT</p>
                                            </div>
                                            <div class="col-md-6 col-sm-6 col-xs-6 ">
                                                <h2 class="text-right c-teal f-300 m-t-20">$21,235</h2>
                                            </div>
                                        </div>
                                        
                                        <div class="widget-body p-15">
                                            <table class="table table-bordered">
                                                <thead>
                                                    <tr>
                                                        <th>ID</th>
                                                        <th>Name</th>
                                                        <th>Amount</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <tr>
                                                        <td>2356</td>
                                                        <td>dummy text </td>
                                                        <td>6,200.00</td>
                                                    </tr>
                                                    <tr>
                                                        <td>4589</td>
                                                        <td>Lorem Ipsum</td>
                                                        <td>6,500.00</td>
                                                    </tr>
                                                    
                                                    <tr>
                                                        <td>3269</td>
                                                        <td>specimen book</td>
                                                        <td>6,800.00</td>
                                                    </tr>                                                    
                                                    <tr>
                                                        <td>5126</td>
                                                        <td>Letraset sheets</td>
                                                        <td>7,200.00</td>
                                                    </tr>
                                                    <tr>
                                                        <td>7425</td>
                                                        <td>PageMaker</td>
                                                        <td>5,900.00</td>
                                                    </tr>
                                                </tbody>
                                            </table>    
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
					
					
								
				</div>
				
							
			</fieldset>
			</blockquote>		
		</div>	

  </body>
</html>
