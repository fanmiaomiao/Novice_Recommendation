package com.ssh.entity;

public class RealUser {

	private Integer realUserId;
	private String userMac;
	private String userTag;
	private String userConsumption;
	
	public Integer getRealUserId() {
		return realUserId;
	}
	public void setRealUserId(Integer realUserId) {
		this.realUserId = realUserId;
	}
	public String getUserMac() {
		return userMac;
	}
	public void setUserMac(String userMac) {
		this.userMac = userMac;
	}
	public String getUserTag() {
		return userTag;
	}
	public void setUserTag(String userTag) {
		this.userTag = userTag;
	}
	public String getUserConsumption() {
		return userConsumption;
	}
	public void setUserConsumption(String userConsumption) {
		this.userConsumption = userConsumption;
	}
	
}
