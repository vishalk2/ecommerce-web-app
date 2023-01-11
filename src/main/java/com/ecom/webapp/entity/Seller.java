package com.ecom.webapp.entity;

import com.ecom.webapp.secure.User;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Seller extends User {
	
	@NotBlank(message = "Name cannot be empty!")
	private String name;
	
	@NotBlank(message = "PAN Number cannot be empty!")
	private String pan;
	
	@NotBlank(message = "Email Id cannot be empty!")
	@Email(message = "Not a proper Email ID format! Enter again.")
	private String mailId;
	
	@NotBlank(message = "Phone Number cannot be empty!")
	@Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number minimum of 10 digits")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only")
	@Column(unique = true)
	private String phoneNo;
	
	@Embedded
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
