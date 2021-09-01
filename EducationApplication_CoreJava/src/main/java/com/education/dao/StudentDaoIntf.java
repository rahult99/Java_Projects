package com.education.dao;

import com.education.model.Student;
import com.education.model.University;

public interface StudentDaoIntf {
	
	public abstract Student findStudentById(University[] universities, int studentIdKey);
	
	public abstract Student[] findStudentByName(University[] universities, String studentNameKey);

}
