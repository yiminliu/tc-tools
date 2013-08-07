package com.tscp.toolkit.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tscp.toolkit.dao.UserDao;
import com.tscp.toolkit.domain.user.User;
import com.tscp.toolkit.util.encryption.MD5Encoder;

@Service
public class UserServiceSpring implements UserService{
	
	
	@Autowired
	private UserDao userDao;
	
	public UserServiceSpring() {
		super();		
	}

	public void updateUserNameAndEmail(String currentUserName, String newUserName){
		User user = userDao.getUserByUserName(currentUserName);
		user.setUserName(newUserName);
		user.setEmail(newUserName);
		userDao.updateUser(user);		
	}
	
	public void updateUserName(String currentUserName, String newUserName){
		User user = userDao.getUserByUserName(currentUserName);
		user.setUserName(newUserName);
		userDao.updateUser(user);		
	}
	
	public void updateEmail(String currentEmail, String newEmail){
		User user = userDao.getUserByEmail(currentEmail);
		user.setEmail(newEmail);
		userDao.updateUser(user);		
	}
		
	public void updatePassword(String email, String newPassword){
		User user = userDao.getUserByEmail(email);
		user.setPassword(MD5Encoder.md5Encryption(newPassword));
		userDao.updateUser(user);	
	}
	
	public User getUserByEmail(String email){
		return userDao.getUserByEmail(email);
	}	
	
	public void confirmPasswordUpdated(String inputPassword, String email){
		
		User user = getUserByEmail(email);
		String newPassword = user.getPassword();
		System.out.println("New Password in hex = " + newPassword);
		if(MD5Encoder.md5Encryption(inputPassword).equals(newPassword))
			System.out.println("Password has been sucessfully updated");	
			
	}
}
