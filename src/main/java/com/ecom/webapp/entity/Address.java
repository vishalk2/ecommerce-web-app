package com.ecom.webapp.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String doorNo;
	private String area;
	private String city;
	private String state;
	private String pinCode;
	public Address(String doorNo, String area, String city, String state, String pinCode) {
		super();
		this.doorNo = doorNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}
