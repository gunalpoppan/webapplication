package com.oasys.productslists.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.productslists.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
