package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Department;
import com.service.DepartmentService;

public class AddDepartmentAction extends ActionSupport{
	DepartmentService departmentService;
	private String dname;
	public String addDepartment(){
		Department department=new Department(dname);
		departmentService.addDepartment(department);
		return "success";
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	

}
