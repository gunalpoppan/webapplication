package com.oasys.productslists.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.productslists.dao.ProductDao;
import com.oasys.productslists.entity.Product;

@Service
public class ProductService {
@Autowired ProductDao prodao;
//insertdata
public String insertData(Product p) {
	return prodao.insertData(p);
}
//getall
	public List<Product> getAll(){
		return prodao.getAll();
	}
}
