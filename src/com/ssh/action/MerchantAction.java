package com.ssh.action;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ssh.entity.Merchant;
import com.ssh.service.MerchantService;

public class MerchantAction extends ActionSupport implements ModelDriven<Merchant>{
	
	//模型驱动获取前台数据
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
	
	//添加商户
	public String add()
	{
		merchantService.add(merchant);
		return "add";
	}
	
}
