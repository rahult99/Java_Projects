package com.login.main;

import java.util.Scanner;

import com.login.exception.CustomException;
import com.login.model.User;
import com.login.service.LoginServiceImpl;
import com.login.service.LoginServiceIntf;

public class LoginApplication {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	// 	To take input from the user.
		
		System.out.println("Enter the User ID : ");
		int uId = input.nextInt();		// 	Scan Integer Value
		
		System.out.println("Enter the Password : ");
		String uPassword = input.next();	// 	Scan String Value
		
		
		LoginServiceIntf loginServiceIntf = new LoginServiceImpl();
		
		User user = new User();
		user.setUserId(uId);
		user.setUserPassword(uPassword);
		
		try {
			User data = loginServiceIntf.validateUser(user);
			
			if(data != null)
			{
				System.out.println("------------------------------------");
				System.out.println("Login Successfull ....");
				System.out.println("Welcome " + data.getUserName() + " (" + data.getUserId() + ")" + " !!!!");
				System.out.println("------------------------------------");
			}
			else 
			{
				throw new CustomException("No Such User Exists !! , Try Different Login Credentials.");
			}
		} 
		catch (CustomException exception) 
		{
			System.err.println(exception.getMessage());
		}
		
		loginServiceIntf = null;
		input.close();
		
	}

}
