package com.service;

import com.dao.EmployeeDao;
import com.po.Employee;

public class EmployeeService {
	private EmployeeDao employeeDao;
	
	public Employee getEmployee(int eid) {
		return employeeDao.getEmployee(eid);
		
	}
	public Employee getEmployeeByEname(String ename) {
		return employeeDao.getEmployeeByEname(ename);
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
