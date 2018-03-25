package com.ssh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.MerchantDao;
import com.ssh.entity.Merchant;

public class MerchantDaoImpl extends HibernateDaoSupport implements MerchantDao {

	public void add(Merchant merchant) {
		this.getHibernateTemplate().save(merchant);
	}

	@Override
	public List<Merchant> findAll() {
		return (List<Merchant>) this.getHibernateTemplate().find("from Merchant");
	}

	@Override
	public void edit(Merchant merchant) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(merchant);
	}

	@Override
	public void delete(Merchant merchant) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(merchant);
	}

	@Override
	public Merchant findOne(Integer merchantId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Merchant.class, merchantId);
	}

}
