package com.tscp.toolkit.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import com.tscp.toolkit.domain.user.User;
import com.tscp.toolkit.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/password", method=RequestMethod.GET)
	public String showUpdatePassword(Model model) {
		model.addAttribute("User", new User());
		return "users/password";
	}
	
	@RequestMapping(value="/password", method=RequestMethod.POST)
	public String PostUpdatePassword(@ModelAttribute("User") User user, BindingResult result){
		userService.updatePassword(user.getEmail(), user.getPassword());
		return "users/password";		
	}
	
	/*@RequestMapping(value="/updateEmail", method=RequestMethod.GET)
	public String showUpdateEmail(@ModelAttribute("User") User user, BindingResult result){
	   //boolean updateUserName = ;
	   if(updateUserName)
		   userService.updateUserNameAndEmail(currentUserName, newUserName);
	   else
		   userService.updateEmail(currentEmail, newEmail);
	   return "/user/email";
	}
	}
	*/
	
}
