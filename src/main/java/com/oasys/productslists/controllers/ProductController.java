package com.oasys.productslists.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.productslists.entity.Product;
import com.oasys.productslists.services.ProductService;

@RequestMapping("/products")
@RestController
public class ProductController {
	@Autowired
	ProductService proser;

	// get msg
	@GetMapping(value = "/getmsg")
	public String getmsg() {
		return "god is love";
	}

	// insert data
	@PostMapping(value = "/insertdata")
	public String insertData(@RequestBody Product p) {
		return proser.insertData(p);
	}

//getall
	@GetMapping(value = "/getall")
	public List<Product> getAll() {
		return proser.getAll();
	}
	

}
