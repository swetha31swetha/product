package com.products.products.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.products.entity.Products;
@Repository
public interface ProductsRepository extends JpaRepository<Products, UUID>
{

}
