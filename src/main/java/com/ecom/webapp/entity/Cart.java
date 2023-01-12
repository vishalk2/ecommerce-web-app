package com.ecom.webapp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cart_id_seq")
	@SequenceGenerator(name = "cart_id_seq", sequenceName = "cart_id_seq", initialValue = 1, allocationSize = 1)
	private long cartId;
	
	@OneToMany
	@JoinColumn(name = "PRODUCT_LIST")
	private List<Product> productList;
	
	public Cart() {
	}

	public Cart(List<Product> productList) {
		super();
		this.productList = productList;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
