package com.exceptionHandling.EH.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.exceptionHandling.EH.entity.Product;
import com.exceptionHandling.EH.exception.ProductIdNotFoundException;
import com.exceptionHandling.EH.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product findProduct(int id){
		if(productRepository.findById(id).isEmpty()) {
			throw new ProductIdNotFoundException();
		}
		return productRepository.findById(id).get();
	}
	


}
