package com.ssh.action;


import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entity.Merchant;
import com.ssh.service.MerchantService;

public class MerchantAction extends ActionSupport implements ModelDriven<Merchant>{
	
	private Merchant merchant = new Merchant();
	@Override
	public Merchant getModel() {
		// TODO Auto-generated method stub
		return merchant;
	}

	private MerchantService merchantService;
	public void setMerchantService(MerchantService merchantService) {
		this.merchantService = merchantService;
	}
	
	public String toAddPage()
	{
		return "toAddPage";
	}
	
	//1.添加商户
	public String add()
	{
		merchantService.add(merchant);
		return "add";
	}
	//2.查看商户列表
	public String list()
	{
		List<Merchant> list = merchantService.findAll();
		ServletActionContext.getRequest().setAttribute("list", list);
		return "list";
	}
	public String toEditPage()
	{
		Merchant m = merchantService.findOne(merchant.getMerchantId());
		//put m into context object
		ServletActionContext.getRequest().setAttribute("merchant", m);
		return "toEditPage";
	}
	//3.编辑商户信息
	public String edit()
	{
		merchantService.edit(merchant);
		return "edit";
	}
	//4.删除商户信息
	public String delete()
	{
		merchantService.delete(merchant);
		return "delete";
	}
	
}
