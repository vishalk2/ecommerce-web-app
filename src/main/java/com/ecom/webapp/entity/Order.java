package com.ecom.webapp.entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Order {
	@Id
	private long orderId;
	@ManyToOne(optional=false)
	@JoinColumn(name = "USER_ID")
	@JsonBackReference
	private Customer customer;
	@OneToMany
	@JoinColumn(name="ORDER_ID")
	private List<Product> productList;
	private double amount;
	private Address shippingAddress;
	private Address orderAddress;
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate orderDate;
	private Status orderStatus;
	
	public Order() {
		super();
	}

	public Order(long orderId, Customer customer, List<Product> productList, double amount, Address shippingAddress,
			Address orderAddress, LocalDate orderDate, Status orderStatus) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.productList = productList;
		this.amount = amount;
		this.shippingAddress = shippingAddress;
		this.orderAddress = orderAddress;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Address getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(Address orderAddress) {
		this.orderAddress = orderAddress;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Status getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
	
}
