package com.ssh.entity;
/**
 * �̼Һͱ�ǩ��ϵ��
 * @author Administrator
 *
 */
public class Mer_tag {

	private Integer mer_tagId;

	//һ����ϵ��Ӧһ���̼�
	private Merchant merchant;
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	//һ����ϵ��Ӧһ��tag
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
