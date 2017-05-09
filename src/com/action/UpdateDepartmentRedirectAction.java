package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Department;
import com.service.DepartmentService;

public class UpdateDepartmentRedirectAction extends ActionSupport{
	public Department d;
	public DepartmentService departmentService;
	private int did;
	public String updateRedirectDepartment(){
		d=departmentService.getDepartment(did);
		return "success";
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
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
	
}
