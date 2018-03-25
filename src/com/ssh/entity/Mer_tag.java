package com.ssh.entity;
/**
 * 商家和标签联系表
 * @author Administrator
 *
 */
public class Mer_tag {

	private Integer mer_tagId;

	//一个联系对应一个商家
	private Merchant merchant;
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	//一个联系对应一个tag
	private Tag tag;
	public Tag getTag() {
		return tag;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public Integer getMer_tagId() {
		return mer_tagId;
	}
	public void setMer_tagId(Integer mer_tagId) {
		this.mer_tagId = mer_tagId;
	}
	
}
