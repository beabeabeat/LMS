package com.action;

import org.apache.struts2.ServletActionContext;

import com.po.Department;
import com.service.DepartmentService;

public class UpdateDepartmentAction {
	DepartmentService departmentService;
	private int did;
	private String dname;
	public String updateDepartment(){
		did=Integer.parseInt(ServletActionContext.getRequest().getParameter("id").toString());
		Department department=new Department(did, dname);
		departmentService.updateDepartment(department);
		return "success";
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	

}
