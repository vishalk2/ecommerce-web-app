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
}
