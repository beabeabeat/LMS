package com.service;

import com.po.Employee;

public class ValidateLoginService {
	
	EmployeeService employeeService;
	
	public Employee validateLogin(String ename,String password) {
		Employee employee=employeeService.getEmployeeByEname(ename);
		String Password=employee.getPassword();
		System.out.println(employeeService.getEmployeeByEname(ename).getRealName());
		if(Password.equals(password)){
			return employee;
		}
		return null;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	
	

}
