package com.maudeinterface.model;

public class Result {

	private String manufacturer;
	private String brandName;
	private String dateRcvd;

	
	
	public Result(String manufacturer, String brandName, String dateRcvd) {
		
		this.manufacturer = manufacturer;
		this.brandName = brandName;
		this.dateRcvd = dateRcvd;
	}

	public Result() {
		// TODO Auto-generated constructor stub
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDateRcvd() {
		return dateRcvd;
	}

	public void setDateRcvd(String dateRcvd) {
		this.dateRcvd = dateRcvd;
	}

}
