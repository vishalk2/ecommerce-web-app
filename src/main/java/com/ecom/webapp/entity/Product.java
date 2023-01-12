package com.ecom.webapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Product {
	private long productId;
	private String productName;
	private double weight;
	private String description;
	//thumbnail
	//images
	private double price;
	@ManyToOne(optional=false)
	@JoinColumn(name = "CATEGORY_ID")
	@JsonBackReference
	private Category category;
	private boolean stock;
	@ManyToOne(optional=false)
	@JoinColumn(name = "USER_ID")
	@JsonBackReference
	private Seller seller;
	
	public Product() {
		super();
	}
	public Product(long productId, String productName, double weight, String description, double price,
			Category category, boolean stock, Seller seller) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.weight = weight;
		this.description = description;
		this.price = price;
		this.category = category;
		this.stock = stock;
		this.seller = seller;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
	
}
