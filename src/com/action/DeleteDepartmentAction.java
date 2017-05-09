package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Department;
import com.service.DepartmentService;

public class DeleteDepartmentAction extends ActionSupport{
	private int did;
	public DepartmentService departmentService;
	public String deleteDepartment(){
		departmentService.deleteDepartment(did);
		return "success";
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
}
