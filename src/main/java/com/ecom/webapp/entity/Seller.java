package com.ecom.webapp.entity;

import java.util.List;

import com.ecom.webapp.secure.User;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy="seller")
	@JsonManagedReference
	private List<Product> products;
	
	public Seller() {
	}
	
	public Seller(@NotBlank(message = "Name cannot be empty!") String name,
			@NotBlank(message = "PAN Number cannot be empty!") String pan,
			@NotBlank(message = "Email Id cannot be empty!") @Email(message = "Not a proper Email ID format! Enter again.") String mailId,
			@NotBlank(message = "Phone Number cannot be empty!") @Size(min = 10, max = 10, message = "Invalid Phone Number please enter a vaild phone number minimum of 10 digits") @Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only") String phoneNo,
			Address address, List<Product> products) {
		super();
		this.name = name;
		this.pan = pan;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.address = address;
		this.products = products;
	}

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
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
