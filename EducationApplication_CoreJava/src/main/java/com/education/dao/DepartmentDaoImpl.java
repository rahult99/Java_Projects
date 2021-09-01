package com.education.dao;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.University;

public class DepartmentDaoImpl implements DepartmentDaoIntf {

	@Override
	public Department findDepartmentById(University[] universities, int departmentIdKey) {
		
		Department tempDepartment =null;
		
		for (int i = 0; i < universities.length; i++) {
			
			College[] arrCollege = universities[i].getColleges();
			
			for (int j = 0; j < arrCollege.length; j++) {
				
				Department[] arrDepartment = arrCollege[j].getDepartments();
				
				for (int k = 0; k < arrDepartment.length; k++) {
					
					if (arrDepartment[k].getDepartmentId() == departmentIdKey)
					{
						tempDepartment = arrDepartment[k];
					}
					
				}
				
			}
			
		}
		
		return tempDepartment;
	}

	@Override
	public Department[] findDepartmentByName(University[] universities, String departmentNamekey) {
		
		Department[] tempDepartments = new Department[universities.length];
		
		int dIndex = 0;
		
		for (int i = 0; i < universities.length; i++) {
			
			College[] arrCollege = universities[i].getColleges();
			
			for (int j = 0; j < arrCollege.length; j++) {
				
				Department[] arrDepartment = arrCollege[i].getDepartments();
				
				for (int k = 0; k < arrDepartment.length; k++) {
					
					if (arrDepartment[k].getDepartmentName().equals(departmentNamekey))
					{
						tempDepartments[dIndex] = arrDepartment[k];
						dIndex += 1;
					}
					
				}
				
			}
			
		}
		
		return tempDepartments;
	}

}
