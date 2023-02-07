package com.products.products.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.products.entity.ProductsDetails;

public interface ProductsDetailsRepository extends JpaRepository<ProductsDetails, UUID>
{

}
