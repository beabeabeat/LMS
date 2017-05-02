package com.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Employee;
import com.service.EmployeeService;

public class UpdateEmployeeRedirectAction extends ActionSupport {
	EmployeeService employeeService;
	private int eid;
	
	public String updateRedirectEmployee(){
		Employee employee=employeeService.getEmployee(eid);
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("updateEmployee", employee);
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
