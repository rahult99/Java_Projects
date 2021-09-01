package com.education.dao;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;

public class StudentDaoImpl implements StudentDaoIntf {

	@Override
	public Student findStudentById(University[] universities, int studentIdKey) {
		
		Student tempStudent = null;
		
		for (int i = 0; i < universities.length; i++) {
			
			College[] arrCollege = universities[i].getColleges();
			
			for (int j = 0; j < arrCollege.length; j++) {
				
				Department[] arrDepartment = arrCollege[j].getDepartments();
				
				for (int k = 0; k < arrDepartment.length; k++) {
					
					Student[] arrStudent = arrDepartment[k].getStudents();
					
					for (int l = 0; l < arrStudent.length; l++) {
						
						if (arrStudent[l].getStudentId() == studentIdKey)
						{
							tempStudent = arrStudent[l];
							
							System.out.println("==========================================");
							System.out.println("University   : " + universities[i].getUniversityId() + " " + universities[i].getUniversityName());
							System.out.println("College      : " + arrCollege[j].getCollegeId() + " " + arrCollege[j].getCollegeName());
							System.out.println("Department   : " + arrDepartment[k].getDepartmentId() + " " + arrDepartment[k].getDepartmentName());
							//System.out.println("==========================================");
						}
						
					}
					
				}
				
			}
			
		}
		
		return tempStudent;
	}

	@Override
	public Student[] findStudentByName(University[] universities, String studentNameKey) {
		
		Student[] tempStudents = new Student[universities.length];
		
		int sIndex = 0;
		
		for (int i = 0; i < universities.length; i++) {
			
			College[] arrCollege = universities[i].getColleges();
			
			for (int j = 0; j < arrCollege.length; j++) {
				
				Department[] arrDepartment = arrCollege[j].getDepartments();
				
				for (int k = 0; k < arrDepartment.length; k++) {
					
					Student[] arrStudent = arrDepartment[k].getStudents();
					
					for (int l = 0; l < arrStudent.length; l++) {
						
						if (arrStudent[l].getStudentName().equals(studentNameKey))
						{
							tempStudents[sIndex] = arrStudent[l];
							sIndex += 1;
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return tempStudents;
	}

}
