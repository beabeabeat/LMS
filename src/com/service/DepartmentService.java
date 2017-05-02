package com.service;

import java.util.List;

import com.dao.DepartmentDao;
import com.po.Department;

public class DepartmentService {
	private DepartmentDao departmentDao;
	public List<Department> getAllDepartment(){
		return departmentDao.getAllDepartment();
	}
	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	

}
