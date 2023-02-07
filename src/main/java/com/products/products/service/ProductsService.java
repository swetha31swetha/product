package com.products.products.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.products.entity.Products;
import com.products.products.repository.ProductsDetailsRepository;
import com.products.products.repository.ProductsRepository;

@Service
public class ProductsService {
	@Autowired
	private ProductsRepository productsrepository;
	@Autowired
	private ProductsDetailsRepository  productsredetailspository;
	public String save (Products products) {
		productsrepository.saveAndFlush(products);
		return "okk";
		
	}
}

