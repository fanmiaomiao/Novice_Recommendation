package com.ssh.entity;

public class Chart {

	private Integer chartId;
	private String chartType;
	private String chartDate;
	private String chartLocate;
	
	//Î¬»¤merchantÍâ¼ü
	private Merchant merchant;
	
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public Integer getChartId() {
		return chartId;
	}
	public void setChartId(Integer chartId) {
		this.chartId = chartId;
	}
	public String getChartType() {
		return chartType;
	}
	public void setChartType(String chartType) {
		this.chartType = chartType;
	}
	public String getChartDate() {
		return chartDate;
	}
	public void setChartDate(String chartDate) {
		this.chartDate = chartDate;
	}
	public String getChartLocate() {
		return chartLocate;
	}
	public void setChartLocate(String chartLocate) {
		this.chartLocate = chartLocate;
	}
	
}
