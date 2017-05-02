package com.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.po.Company;
import com.po.Department;
import com.po.Employee;
import com.po.Role;
import com.service.CompanyService;
import com.service.DepartmentService;
import com.service.EmployeeService;
import com.service.RoleService;
import com.service.ValidateLoginService;

public class ValidateLoginAction extends ActionSupport{
	private String ename;
	private String password;
	private ValidateLoginService validateLoginService;
	private EmployeeService employeeService;
	private DepartmentService departmentService;
	private CompanyService companyService;
	private RoleService roleService;
	public String validateLogin() {
		Employee employee=validateLoginService.validateLogin(ename, password);
		if(employee!=null){
			HttpSession session=ServletActionContext.getRequest().getSession();
		    session.setAttribute("employee",employee);
		    List<Department> listDepartmrnt=departmentService.getAllDepartment();
		    session.setAttribute("allDepartment",listDepartmrnt);
		    List<Company> listCompany=companyService.getAllCompany();
		    session.setAttribute("allCompany", listCompany);
		    List<Role> listRoles=roleService.getAllRoles();
		    session.setAttribute("allRole", listRoles);
			return "success";
		}
		return "failed";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ValidateLoginService getValidateLoginService() {
		return validateLoginService;
	}
	public void setValidateLoginService(ValidateLoginService validateLoginService) {
		this.validateLoginService = validateLoginService;
	}
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public CompanyService getCompanyService() {
		return companyService;
	}
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
	public RoleService getRoleService() {
		return roleService;
	}
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	
	

}
