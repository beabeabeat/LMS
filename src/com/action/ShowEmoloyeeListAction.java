package com.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.Session;
import javax.servlet.http.HttpSession;

import org.apache.log4j.rewrite.RewriteAppender;
import org.apache.struts2.ServletActionContext;
import org.springframework.jdbc.core.RowCallbackHandler;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Employee;
import com.service.EmployeeService;
import com.util.PageUtil;


public class ShowEmoloyeeListAction extends ActionSupport{
	EmployeeService employeeService;
	List<Employee> list;
	
	public String showEmployeeList(){
		list=employeeService.showEmployeeList();
		HttpSession session=ServletActionContext.getRequest().getSession();
	    session.setAttribute("employeeList",list); 
	        return "success";
	       }
	public String showEmployeePassword(){
		list=employeeService.showEmployeeList();
		HttpSession session=ServletActionContext.getRequest().getSession();
	    session.setAttribute("employeeList",list); 
	        return "success";
	       }
    public List<Employee> getList() {
		return list;
	   }
	public void setList(List<Employee> list) {
		this.list = list;
	}
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
}
