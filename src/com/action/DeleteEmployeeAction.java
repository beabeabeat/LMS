package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.EmployeeService;

public class DeleteEmployeeAction extends ActionSupport{
	private int eid;
	EmployeeService employeeService;
	public String deleteEmployee(){
		employeeService.deleteEmployee(eid);
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
	

}
