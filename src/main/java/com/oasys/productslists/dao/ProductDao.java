package com.oasys.productslists.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.productslists.entity.Product;
import com.oasys.productslists.repository.ProductRepository;

@Repository
public class ProductDao {
@Autowired ProductRepository prorep;
//insertdata
public String insertData(Product p) {
	prorep.save(p);
	return "successfully inserted data";
}
//getall
public List<Product> getAll(){
	return prorep.findAll();
}
}
