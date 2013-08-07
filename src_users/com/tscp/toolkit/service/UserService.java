package com.tscp.toolkit.service;

import com.tscp.toolkit.domain.user.User;

public interface UserService {

	public void updateUserNameAndEmail(String currentUserName, String newUserName);
	
	
	public void updateUserName(String currentUserName, String newUserName);
		
	public void updateEmail(String currentEmail, String newEmail);
		
	public void updatePassword(String email, String newPassword);
		
	public User getUserByEmail(String email);
	
	public void confirmPasswordUpdated(String inputPassword, String email);
	
}
