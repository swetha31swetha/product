package com.products.products.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "details")
public class ProductsDetails {
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	@Type(type = "uuid-char")
	@Column(name = "products_id", updatable = false, nullable = false)
	private UUID id;
	
	@Column(name = "initial_qty")
	private String productInitialqty;
	
	@Column(name = "product_discount")
	private String productDiscount;
	
	@Column(name = "purchase_rate")
	private double purcharceRate;
	
	@Column(name = "sales_rate")
	private double salesRate;
	
	@Column(name = "total_amount")
	private double totalAmount;

}
