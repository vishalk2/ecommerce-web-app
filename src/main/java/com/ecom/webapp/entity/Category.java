package com.ecom.webapp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	private long categoryId;
	private String categoryName;
	@OneToMany(fetch = FetchType.EAGER, mappedBy="category")
	@JsonManagedReference
	private List<Product> productList;
	public Category(long categoryId, String categoryName, List<Product> productList) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.productList = productList;
	}
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
}
