package com.ssh.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ssh.dao.MerchantDao;
import com.ssh.entity.Merchant;

public class MerchantDaoImpl extends HibernateDaoSupport implements MerchantDao {

	//ÃÌº”…Ãº“
	public void add(Merchant merchant) {
		this.getHibernateTemplate().save(merchant);
	}

}
