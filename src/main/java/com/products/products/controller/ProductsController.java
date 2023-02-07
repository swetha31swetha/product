package com.products.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.products.entity.Products;
import com.products.products.service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	private ProductsService service;
	@PostMapping("/post")
	private String save(@RequestBody Products products) {
		service.save(products);
		return "product";
	}

}
