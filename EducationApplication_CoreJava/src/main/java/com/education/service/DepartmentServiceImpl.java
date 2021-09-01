package com.education.service;

import com.education.dao.DepartmentDaoImpl;
import com.education.dao.DepartmentDaoIntf;
import com.education.model.Department;
import com.education.model.University;

public class DepartmentServiceImpl implements DepartmentServiceIntf {

	@Override
	public Department findDepartmentById(University[] universities, int departmentIdKey) {
		
		Department tempDepartment = null;
		
		if (universities != null) 
		{
			DepartmentDaoIntf departmentDaoIntf = new DepartmentDaoImpl();
			
			tempDepartment = departmentDaoIntf.findDepartmentById(universities, departmentIdKey);
		}
		
		return tempDepartment;
	}

	@Override
	public Department[] findDepartmentByName(University[] universities, String departmentNamekey) {
		
		Department[] tempDepartments = null;
		
		if (universities != null)
		{
			DepartmentDaoIntf departmentDaoIntf = new DepartmentDaoImpl();
			
			tempDepartments = departmentDaoIntf.findDepartmentByName(universities, departmentNamekey);
		}
		
		return tempDepartments;
	}

}
