package com.education.dao;

import com.education.model.Department;
import com.education.model.University;

public interface DepartmentDaoIntf {
	
	public abstract Department findDepartmentById(University[] universities, int departmentIdKey);
	
	public abstract Department[] findDepartmentByName(University[] universities, String departmentNamekey);

}
