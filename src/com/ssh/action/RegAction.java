package com.ssh.action;

import java.util.ArrayList;






import java.util.List;

import com.ssh.entity.User;
import com.ssh.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class RegAction extends ActionSupport implements ModelDriven<User>{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private User user = new User();
	private UserService userService; 
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		System.out.println(user);
		return user;
		
	}	
	
	public String execute(){	
		userService.add(user);
		System.out.println("2++"+user);
		return "success";
	}
	
}
