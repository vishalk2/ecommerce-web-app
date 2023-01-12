package com.ecom.webapp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
	@SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", initialValue = 1, allocationSize = 1)
	private long productId;
	
	@NotBlank(message = "Product Name cannot be empty!")
	private String productName;
	
	private double weight;
	
	@NotBlank(message = "Product Description cannot be empty!")
	private String description;
	
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORY_ID")
	@JsonBackReference("productlist")
	private Category category;
	
	private boolean stock;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	@JsonBackReference("products")
	private Seller seller;
	
	public Product() {
	}
	
	public Product(@NotBlank(message = "Product Name cannot be empty!") String productName, double weight,
			@NotBlank(message = "Product Description cannot be empty!") String description, double price,
			Category category, boolean stock, Seller seller) {
		super();
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

	public boolean isStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}
}
