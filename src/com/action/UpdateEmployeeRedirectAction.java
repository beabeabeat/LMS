package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Employee;
import com.service.EmployeeService;

public class UpdateEmployeeRedirectAction extends ActionSupport {
	public Employee e;
	public EmployeeService employeeService;
	private int eid;
	
	public String updateRedirectEmployee(){
		e=employeeService.getEmployee(eid);
		return "success";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}


	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Employee getE() {
		return e;
	}

	public void setE(Employee e) {
		this.e = e;
	}

}
