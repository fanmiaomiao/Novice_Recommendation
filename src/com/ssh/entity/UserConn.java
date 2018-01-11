package com.ssh.entity;
/**
 * 用户连接情况
 * @author Administrator
 *
 */
public class UserConn {

	private Integer UserConnId;
	private String UserName;
	private Integer ConnTime;
	private String IPAddr;
	private String MACAddr;
	//维护一个AP的外键
	private AP ap;
	
	public AP getAp() {
		return ap;
	}
	public void setAp(AP ap) {
		this.ap = ap;
	}
	public Integer getUserConnId() {
		return UserConnId;
	}
	public void setUserConnId(Integer userConnId) {
		UserConnId = userConnId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public Integer getConnTime() {
		return ConnTime;
	}
	public void setConnTime(Integer connTime) {
		ConnTime = connTime;
	}
	public String getIPAddr() {
		return IPAddr;
	}
	public void setIPAddr(String iPAddr) {
		IPAddr = iPAddr;
	}
	public String getMACAddr() {
		return MACAddr;
	}
	public void setMACAddr(String mACAddr) {
		MACAddr = mACAddr;
	}
	
}
