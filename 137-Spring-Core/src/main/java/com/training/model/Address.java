package com.training.model;

public class Address {
	
	private String doorNo;
	private String city,pincode;
	
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", city=" + city + ", pincode=" + pincode + "]";
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	

}
