package com.tscp.toolkit.client;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tscp.toolkit.domain.user.User;
import com.tscp.toolkit.service.UserService;
import com.tscp.toolkit.service.UserServiceSpring;

public class MyToolBox {
	
	private static final String APPNAME = "TSCPMVNE";
	
	@Autowired
	@Qualifier("sessionFactory")
	protected SessionFactory sessionFactory;
	
	private UserService userService;
	
	public MyToolBox(){
	   init();
	}
	
	public static void main(String[] args){
		
		MyToolBox client = new MyToolBox();
		//client.updatePassword("changlydia212@ymail.com", "Password123");
		client.updateuserNameAndEmail("reserve_a968c82_ddanylchuk@aol.com", "ddanylchuk@aol.com");
		//User user = client.getUserByEmail("m.gonz@cogeco.ca");
		//System.out.println("User retrieved: ");
		
	}
	
	public void updatePassword(String email, String newPassword){
		try{
			userService.updatePassword(email, newPassword);
			userService.confirmPasswordUpdated(newPassword, email);
			System.out.println("Password has been updated");
		}
		catch(Exception e){
		  e.printStackTrace();
	    }
	}
	
	public void updateEmail(String currentEmail, String newEmail){
		try{
		   userService.updateEmail(currentEmail, newEmail);
		   System.out.println("User has been updated");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void updateUserName(String currentUserName, String newUserName){
		userService.updateEmail(currentUserName, newUserName);
	}
	
	public void updateuserNameAndEmail(String currentEmail, String newEmail){
		userService.updateUserNameAndEmail(currentEmail, newEmail);
		System.out.println("updateuserNameAndEmail Done");
	}
	
	public User getUserByEmail(String email){
		return userService.getUserByEmail(email);
	}
	
	private void init(){
		ApplicationContext ctx = null;;
		if (APPNAME.equalsIgnoreCase("TSCPMVNE"))
		    ctx = new ClassPathXmlApplicationContext("tscpmvne_toolkit-context.xml");
		else if (APPNAME.equalsIgnoreCase("TSCPMVNA"))
			ctx = new ClassPathXmlApplicationContext("tscpmvna_toolkit-context.xml");
	
		userService = (UserServiceSpring)ctx.getBean("userServiceSpring");		
	}
}
