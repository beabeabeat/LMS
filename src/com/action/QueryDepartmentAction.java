package com.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.po.Department;
import com.service.DepartmentService;

public class QueryDepartmentAction extends ActionSupport{
	private String dname;
	DepartmentService departmentService;
	List<Department> list;
	public String queryDepartmentByName(){
		list=departmentService.queryDepartmentByName(dname);
		HttpSession session=ServletActionContext.getRequest().getSession();
		session.setAttribute("queryDepartments", list);	
		return "success";
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
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
