package com.ecom.webapp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_id_seq")
	@SequenceGenerator(name = "category_id_seq", sequenceName = "category_id_seq", initialValue = 1, allocationSize = 1)
	private long categoryId;
	
	@NotBlank(message = "Category Name cannot be empty!")
	private String categoryName;
	
	@OneToMany(mappedBy="category")
	@JsonManagedReference("productlist")
	private List<Product> productList;
	
	public Category() {
	}

	public Category(@NotBlank(message = "Category Name cannot be empty!") String categoryName,
			List<Product> productList) {
		super();
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
