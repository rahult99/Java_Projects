package com.education.model;

/**
 * 
 * @author Rahul
 *
 */

public class Department {
	
	private int departmentId;
	private String departmentName;
	private Student[] students;
	
	// Non-Parameterized Constructor
	public Department() {
		super();
	}
	
	// Parameterized Constructor
	public Department(int departmentId, String departmentName, Student[] students) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.students = students;
	}
	
	// Getters and Setters
	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}
	
	

}
