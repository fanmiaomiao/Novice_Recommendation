package com.ssh.entity;

public class Coupons {

	private Integer couponsId;
	private String couponsName;
	private Float couponsPrice;
	private Float couponsDiscount;
	private String couponsDate;
	private String couponsCondition;
	
	//³ÖÓÐmerchantÍâ¼ü
	private Merchant merchant;
	
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public Integer getCouponsId() {
		return couponsId;
	}
	public void setCouponsId(Integer couponsId) {
		this.couponsId = couponsId;
	}
	public String getCouponsName() {
		return couponsName;
	}
	public void setCouponsName(String couponsName) {
		this.couponsName = couponsName;
	}
	public Float getCouponsPrice() {
		return couponsPrice;
	}
	public void setCouponsPrice(Float couponsPrice) {
		this.couponsPrice = couponsPrice;
	}
	public Float getCouponsDiscount() {
		return couponsDiscount;
	}
	public void setCouponsDiscount(Float couponsDiscount) {
		this.couponsDiscount = couponsDiscount;
	}
	public String getCouponsDate() {
		return couponsDate;
	}
	public void setCouponsDate(String couponsDate) {
		this.couponsDate = couponsDate;
	}
	public String getCouponsCondition() {
		return couponsCondition;
	}
	public void setCouponsCondition(String couponsCondition) {
		this.couponsCondition = couponsCondition;
	}
	
}
