package com.ssh.dao;

import java.util.List;

import com.ssh.entity.Merchant;

public interface MerchantDao {

	void add(Merchant merchant);

	List<Merchant> findAll();

	void edit(Merchant merchant);

	void delete(Merchant merchant);

	Merchant findOne(Integer merchantId);

}
