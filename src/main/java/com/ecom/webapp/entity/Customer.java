package com.ecom.webapp.entity;

import java.util.List;

import com.ecom.webapp.secure.User;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Customer extends User {
	
	@NotBlank(message = "Name cannot be empty!")
	private String name;
	
	@NotBlank(message = "Email Id cannot be empty!")
	@Email(message = "Not a proper Email ID format! Enter again.")
	private String mailId;
	
	@NotBlank(message = "Phone Number cannot be empty!")
	@Size(min = 10, max = 10, message = "Invalid Phone Number. Please enter a vaild phone number.")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only.")
	@Column(unique = true)
	private String phoneNo;
	
	@Embedded
	private Address address;
	
	@OneToMany(mappedBy="customer")
	@JsonManagedReference
	private List<Order> orderList;
	
	@OneToOne
	private Cart cart;
	
	public Customer() {
	}
	
	public Customer(@NotBlank(message = "Name cannot be empty!") String name,
			@NotBlank(message = "Email Id cannot be empty!") @Email(message = "Not a proper Email ID format! Enter again.") String mailId,
			@NotBlank(message = "Phone Number cannot be empty!") @Size(min = 10, max = 10, message = "Invalid Phone Number. Please enter a vaild phone number.") @Pattern(regexp = "^\\d{10}$", message = "Invalid input:Enter numbers only.") String phoneNo,
			Address address, List<Order> orderList, Cart cart) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.address = address;
		this.orderList = orderList;
		this.cart = cart;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public List<Order> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
