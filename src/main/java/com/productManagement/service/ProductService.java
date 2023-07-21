package com.productManagement.service;

import java.util.List;

import com.productManagement.model.Product;

public interface ProductService {
	//write all the method here.
	//save the product.
	public Product saveProduct(Product product);
	
	//To get all the product
	public List<Product> getAllProduct();
	
	//get the product by Id
	
	public Product getProductById(Integer id);
	
	//Delete product by Id
	public String deleteProduct(Integer id);
	
	public Product editProduct(Product product,Integer id);
	

}
