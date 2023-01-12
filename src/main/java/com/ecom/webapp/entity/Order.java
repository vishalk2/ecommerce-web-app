package com.ecom.webapp.entity;

import java.time.LocalDate;
import java.util.List;

import com.ecom.webapp.enums.Status;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_info")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
	@SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq", initialValue = 1, allocationSize = 1)
	private long orderId;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	@JsonBackReference("orderlist")
	private Customer customer;
	
	@OneToMany
	@JoinColumn(name="ORDER_ID")
	private List<Product> productList;
	
	private Address shippingAddress;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate orderDate;
	
	@Enumerated(EnumType.STRING)
	private Status orderStatus;
	
	public Order() {
	}

	public Order(Customer customer, List<Product> productList, Address shippingAddress, LocalDate orderDate,
			Status orderStatus) {
		super();
		this.customer = customer;
		this.productList = productList;
		this.shippingAddress = shippingAddress;
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

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
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
