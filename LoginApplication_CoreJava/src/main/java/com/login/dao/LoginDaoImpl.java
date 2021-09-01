package com.login.dao;

import com.login.exception.CustomException;
import com.login.model.User;

public class LoginDaoImpl implements LoginDaoIntf{

	@Override
	public User validateUser(User user) throws CustomException{

		User tempUser = null;
		
		// 		First Logic

		/*if (user.getUserId() == 112233 && user.getUserPassword().equals("Bravo123")) 
		{
			user.setUserName("Bravo");
		}

		else if (user.getUserId() == 445566 && user.getUserPassword().equals("Mike456")) 
		{
			user.setUserName("Mike");
		}
		
		else if (user.getUserId() == 778899 && user.getUserPassword().equals("November789")) 
		{
			user.setUserName("November");
		}*/
		
		// ********************************************************************************
		
		//		Second Logic : Implementing Using Array
		
		// 		Hard Coded Data.
		int[] id = {112233, 445566, 778899};
		String[] password = {"Bravo123", "Mike456", "November789"};
		String[] userName = {"Bravo", "Mike", "November"};
		
		for (int i = 0; i < id.length; i++) {
			
			if (user.getUserId() == id[i] && user.getUserPassword().equals(password[i])) 
			{
				user.setUserName(userName[i]);
				tempUser = user;
			}
			
		}
		
		// Returning object of type "User" back to Service Layer of the Application.
		
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
