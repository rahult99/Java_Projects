package com.login.model;

/**
 * 
 * @author Rahul
 *
 */


public class User {

	private int userId;
	private String userName;
	private String userPassword;
	
	//	Default Constructor
	
	public User() {
		super();
	}
	
	// Getter() and Setter() Methods
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
