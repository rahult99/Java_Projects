package com.login.service;

import com.login.exception.CustomException;
import com.login.model.User;

//	Service Layer : Used to write business logic.

public interface LoginServiceIntf {

	// CRUD Operations:

	public abstract User validateUser(User user) throws CustomException; 	// 		Read() Operation : To fetch User data.

	public abstract User createUser(User user); 	// 		Create() Operation : To create new User Data.

	public abstract User updateUser(User user); 	// 		Update() Operation : To fetch User data.

	// The return type of the "deleteUser()" method is "Boolean" and not "User", because it doesn't return User Object.
	// Avoid the return type "void" for any method. It is not a good practice while "Testing" the code.

	public abstract boolean deleteUser(int userId); // 		Delete() Operation : To fetch User data.

}
