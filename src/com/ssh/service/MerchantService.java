package com.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.ssh.dao.MerchantDao;
import com.ssh.entity.Merchant;


@Transactional
public class MerchantService {
	private MerchantDao merchantDao;
	
	public void setMerchantDao(MerchantDao merchantDao) {
		this.merchantDao = merchantDao;
	}

	public void add(Merchant merchant) {
		// TODO Auto-generated method stub
		merchantDao.add(merchant);
	}

}

