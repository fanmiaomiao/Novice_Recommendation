package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entity.RealUser;
import com.ssh.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<RealUser>{
	
	//模型驱动获取前台数据
	private RealUser user = new RealUser();
	@Override
	public RealUser getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	
}
