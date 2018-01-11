package com.ssh.entity;

public class Map {

	private Integer mapId;
	private String mapName;
	private Character isCover;
	//维护一个商家的外键
	private Merchant merchant;
	
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public Integer getMapId() {
		return mapId;
	}
	public void setMapId(Integer mapId) {
		this.mapId = mapId;
	}
	public String getMapName() {
		return mapName;
	}
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	public Character getIsCover() {
		return isCover;
	}
	public void setIsCover(Character isCover) {
		this.isCover = isCover;
	}
	
}
