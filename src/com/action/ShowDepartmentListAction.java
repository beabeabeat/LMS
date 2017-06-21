package com.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Department;
import com.service.DepartmentService;

public class ShowDepartmentListAction extends ActionSupport{
	DepartmentService departmentService;
	List<Department> list;
	
	public String showDepartmentList(){
		list=departmentService.getAllDepartment();
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("departmentList",list);
		return "success";
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public List<Department> getList() {
		return list;
	}

	public void setList(List<Department> list) {
		this.list = list;
	}
	
	

}
