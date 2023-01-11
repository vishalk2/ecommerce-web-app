package com.ecom.webapp.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;

@Embeddable
public class Address {
	
	@NotBlank(message = "Door Number cannot be empty!")
	private String doorNo;
	
	@NotBlank(message = "Area cannot be empty!")
	private String area;
	
	@NotBlank(message = "City cannot be empty!")
	private String city;
	
	@NotBlank(message = "State cannot be empty!")
	private String state;
	
	@NotBlank(message = "Pincode cannot be empty")
	private String pinCode;
	
	public Address() {
	}
	
	public Address(@NotBlank(message = "Door Number cannot be empty!") String doorNo,
			@NotBlank(message = "Area cannot be empty!") String area,
			@NotBlank(message = "City cannot be empty!") String city,
			@NotBlank(message = "State cannot be empty!") String state,
			@NotBlank(message = "Pincode cannot be empty") String pinCode) {
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
