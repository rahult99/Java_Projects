package com.education.service;

import com.education.dao.StudentDaoImpl;
import com.education.dao.StudentDaoIntf;
import com.education.model.Student;
import com.education.model.University;

public class StudentServiceImpl implements StudentServiceIntf {

	@Override
	public Student findStudentById(University[] universities, int studentIdKey) {
		
		Student tempStudent = null;
		
		if (universities != null)
		{
			StudentDaoIntf studentDaoIntf = new StudentDaoImpl();
			
			tempStudent = studentDaoIntf.findStudentById(universities, studentIdKey);
		}
		
		return tempStudent;
	}

	@Override
	public Student[] findStudentByName(University[] universities, String studentNameKey) {
		
		Student[] tempColleges = null;
		
		if (universities != null)
		{
			StudentDaoIntf studentDaoIntf = new StudentDaoImpl();
			
			tempColleges = studentDaoIntf.findStudentByName(universities, studentNameKey);
		}
		
		return tempColleges;
	}

}
