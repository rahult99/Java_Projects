package com.education.model;

/**
 * 
 * @author Rahul
 *
 */

public class Student {

	private int studentId;
	private String studentName;

	// Non-Parameterized Constructor
	public Student() {
		super();
	}

	// Parameterized Constructor
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	
	// Getters and Setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
