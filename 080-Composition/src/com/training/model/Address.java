package com.training.model;

public class Address {
	
	private String houseName;
	private String cityName;
	private String pinCode;
	
	
	
	public Address() {
		super();
	}



	public Address(String houseName, String cityName, String pinCode) {
		super();
		this.houseName = houseName;
		this.cityName = cityName;
		this.pinCode = pinCode;
	}



	public String getHouseName() {
		return houseName;
	}



	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public String getPinCode() {
		return pinCode;
	}



	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}



	@Override
	public String toString() {
		return "Address [houseName=" + houseName + ", cityName=" + cityName + ", pinCode=" + pinCode + "]";
	}
	
	
	
	

}
