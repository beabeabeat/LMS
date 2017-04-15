package com.service;

import com.dao.EmployeeDao;
import com.po.Employee;
import java.util.List;


public class EmployeeService {
	private EmployeeDao employeeDao;
	
	public Employee getEmployee(int eid) {
		return employeeDao.getEmployee(eid);
		
	}
    public void addEmployee(Employee employee){
    	employeeDao.addEmployee(employee);
    }
	public List<Employee> queryEmployeesByID(int id){
		return employeeDao.queryEmployeesByID(id);
	}
	public List<Employee> queryEmployeesByCompany(String company) {
		return employeeDao.queryEmployeesByCompany(company);
		
	}
	public List<Employee> queryEmployeesByDepartment(String department){
		return employeeDao.queryEmployeesByDepartment(department);
	}
	public Employee getEmployeeByEname(String ename) {
		return employeeDao.getEmployeeByEname(ename);
	}
	public List<Employee> showEmployeeList(){
		return employeeDao.getAllEmployees();
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
