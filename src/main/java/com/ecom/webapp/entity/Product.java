package com.ecom.webapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private long productId;
	private String name;
	private double weight;
	private String description;
	//thumbnail
	//images
	private double price;
	private long categoryId;
	private boolean stock;
	public Product(long productId, String name, double weight, String description, double price, long categoryId,
			boolean stock) {
		super();
		this.productId = productId;
		this.name = name;
		this.weight = weight;
		this.description = description;
		this.price = price;
		this.categoryId = categoryId;
		this.stock = stock;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	
}
