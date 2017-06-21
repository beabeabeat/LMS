package com.action;


import java.util.Date;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Employee;
import com.service.EmployeeService;

public class AddEmployeeAction extends ActionSupport{
	EmployeeService employeeService;
	private String ename;
	private String realName;
	private String password;
	private String phoneNumber;
	private String company;
	private String department;
	private int eState; 
	private int roleID;
	private String regTime;
	
	public String addEmployee(){
		eState=Integer.parseInt(ServletActionContext.getRequest().getParameter("eState").toString());
		//Employee employee=new Employee(ename, realName, password, phoneNumber, company, department, eState, roleID);
		Date date = new Date();
		regTime=date.toLocaleString();
		Employee employee=new Employee(ename, realName, password, phoneNumber, company, department, eState, roleID, regTime);
		employeeService.addEmployee(employee);
		return "success";
	}


	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public int geteState() {
		return eState;
	}

	public void seteState(int eState) {
		this.eState = eState;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}


	public EmployeeService getEmployeeService() {
		return employeeService;
	}


	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	

}
