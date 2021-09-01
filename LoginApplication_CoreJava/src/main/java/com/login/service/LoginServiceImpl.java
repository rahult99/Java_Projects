package com.login.service;

import com.login.dao.LoginDaoImpl;
import com.login.dao.LoginDaoIntf;
import com.login.exception.CustomException;
import com.login.model.User;

public class LoginServiceImpl implements LoginServiceIntf {

	@Override
	public User validateUser(User user) throws CustomException {
		
		User tempUser = null;
		
		// To get length of an Integer, Convert it to string and use .length() method.
		
		int userIdDigit = String.valueOf(user.getUserId()).length();
		int userPasswordDigit  = user.getUserPassword().length();
		
		// To Validate if User Id contains more than 4 digits
		
		if(user != null) 
		{
			if (userIdDigit > 4)
			{
				if (userPasswordDigit > 4) 
				{
					LoginDaoIntf loginDaoIntf = new LoginDaoImpl();
					
					tempUser = loginDaoIntf.validateUser(user);
				} 
				else
				{
					throw new CustomException("Password must be Greater than 4 Digits.");
				}
			}
			else
			{
				throw new CustomException("UserID must be Greater than 4 Digits.");
			}
			
			
		}
		else {
			throw new CustomException("No Data Found, Please Enter Login Credentilas.");
		}
		
		// Saving the Object of type "User" in "tempUser" and returning it back to Service Layer of the Application.
		
		return tempUser;	
	}

	// ----------------------------------------------------------------------------------------------
	
	@Override
	public User createUser(User user) {
		// Logic Pending
		return null;
	}

	
	@Override
	public User updateUser(User user) {
		// Logic Pending
		return null;
	}

	
	@Override
	public boolean deleteUser(int userId) {
		// Logic Pending
		return false;
	}

}
