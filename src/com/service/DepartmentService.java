package com.service;

import java.util.List;

import com.dao.DepartmentDao;
import com.po.Department;

public class DepartmentService {
	private DepartmentDao departmentDao;
	public List<Department> getAllDepartment(){
		return departmentDao.getAllDepartment();
	}
	public Department getDepartment(int did){
		return departmentDao.getDepartment(did);
	}
	public List<Department> queryDepartmentByName(String dname){
		return departmentDao.queryDepartmentByName(dname);
	}
	public void deleteDepartment(int did){
		departmentDao.deleteCompany(did);
	}
	public void updateDepartment(Department department){
		departmentDao.updateDepartment(department);
	}
	public void addDepartment(Department department){
		departmentDao.addDepartment(department);
	}
	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	

}
