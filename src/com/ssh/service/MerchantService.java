package com.ssh.service;

import java.util.List;

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

	public List<Merchant> findAll() {
		// TODO Auto-generated method stub
		return merchantDao.findAll();
	}

	public void edit(Merchant merchant) {
		// TODO Auto-generated method stub
		merchantDao.edit(merchant);
	}

	public void delete(Merchant merchant) {
		// TODO Auto-generated method stub
		merchantDao.delete(merchant);
	}

	public Merchant findOne(Integer merchantId) {
		// TODO Auto-generated method stub
		return merchantDao.findOne(merchantId);
	}

}

