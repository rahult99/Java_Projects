package com.education.model;

/**
 * 
 * @author Rahul
 *
 */

public class College {
	
	private int collegeId;
	private String collegeName;
	private Department[] departments;
	
	// Non-Parameterized Constructor
	public College() {
		super();
	}
	
	// Parameterized Constructor
	public College(int collegeId, String collegeName, Department[] departments) {
		
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.departments = departments;
		
	}
	
	// Getters and Setters
	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Department[] getDepartments() {
		return departments;
	}

	public void setDepartments(Department[] departments) {
		this.departments = departments;
	}
	
	

}
