package com.service;

public class ValidateLoginService {
	
	EmployeeService employeeService;
	
	public String validateLogin(String ename,String password) {
		String Password=employeeService.getEmployeeByEname(ename).getPassword();
		if(Password==password){
			return "success";
		}
		else{
			return "failed";
		}
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	
	

}
