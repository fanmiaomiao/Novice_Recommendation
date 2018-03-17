package com.ssh.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entity.Manager;
import com.ssh.service.ManagerService;

public class ManagerAction extends ActionSupport implements ModelDriven<Manager>{
	
	//模型驱动获取前台数据
	private Manager manager = new Manager();
	@Override
	public Manager getModel() {
		// TODO Auto-generated method stub
		return manager;
	}

	private ManagerService managerService;
	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	
	//管理员登录
	public String login()
	{
		Manager loginManager = managerService.login(manager);
		if(loginManager!=null)
		{
			//用户存在，使用session保存登录状态
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("manager", loginManager);
			return "loginSuccess";
		}
		else
		{
			//该用户不存在，登录失败
			return "login";
		}
	}
	
}
