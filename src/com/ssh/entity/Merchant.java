package com.ssh.entity;

import java.util.HashSet;
import java.util.Set;

public class Merchant {

	private Integer merchantId;
	private String merchantName;
	private String merchantAccount;
	private String merchantPwd;
	private String merchantPhone;
	private String merchantEmail;
	//维护AP的一个外键
	private AP ap;
	
	public AP getAp() {
		return ap;
	}
	public void setAp(AP ap) {
		this.ap = ap;
	}
	//一个商家有多个商家标签联系
	private Set<Mer_tag> setMerTag = new HashSet<Mer_tag>();
	
	public Set<Mer_tag> getSetMerTag() {
		return setMerTag;
	}
	public void setSetMerTag(Set<Mer_tag> setMerTag) {
		this.setMerTag = setMerTag;
	}

	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantAccount() {
		return merchantAccount;
	}
	public void setMerchantAccount(String merchantAccount) {
		this.merchantAccount = merchantAccount;
	}
	public String getMerchantPwd() {
		return merchantPwd;
	}
	public void setMerchantPwd(String merchantPwd) {
		this.merchantPwd = merchantPwd;
	}
	public String getMerchantPhone() {
		return merchantPhone;
	}
	public void setMerchantPhone(String merchantPhone) {
		this.merchantPhone = merchantPhone;
	}
	public String getMerchantEmail() {
		return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}
	
}
