package com.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Employee;
import com.service.EmployeeService;

public class QueryEmployeeAction extends ActionSupport{
	private int eid;
	private String company;
	private String department;
	EmployeeService employeeService;
	List<Employee> list;
	
	public String queryEmployeesById(){		
		eid=Integer.parseInt(ServletActionContext.getRequest().getAttribute("eid").toString());
		System.out.println(eid);
		list=employeeService.queryEmployeesByID(eid);
		for(Employee e:list){
			System.out.println(e.getDepartment());
		}
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("queryEmployees", list);
		return "success";
	}
	public String queryEmployeesByCompany(){
		list=employeeService.queryEmployeesByCompany(company);
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("queryEmployees", list);
		return "success";
	}
	public String queryEmployeesByDepartment(){
		list=employeeService.queryEmployeesByDepartment(department);
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("queryEmployees", list);
		return "success";
	}
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public List<Employee> getList() {
		return list;
	}
	public void setList(List<Employee> list) {
		this.list = list;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
