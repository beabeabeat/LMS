package com.util;

import java.util.List;

import com.po.Department;
import com.service.DepartmentService;

public class Test {
	public static void main(String[] args) {
		DepartmentService ds=new DepartmentService();
		List<Department> list=ds.getAllDepartment();
		for(Department d:list){
			System.out.println(d.getDid());
		}
	}

}
