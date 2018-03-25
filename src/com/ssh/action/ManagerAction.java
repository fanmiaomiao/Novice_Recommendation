package com.ssh.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entity.Manager;
import com.ssh.service.ManagerService;

public class ManagerAction extends ActionSupport implements ModelDriven<Manager>{
	
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
	
	//和前端交互的值
	private String result;
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult() {
		return result;
	}
	
	public String login()
	{
		Manager loginManager = managerService.login(manager);
		if(loginManager!=null)
		{
			HttpServletRequest request = ServletActionContext.getRequest();
			request.getSession().setAttribute("manager", loginManager);
			result = "success";			
		}
		else
		{
			result = "fail";
		}
		return "login";
	}
	
}
