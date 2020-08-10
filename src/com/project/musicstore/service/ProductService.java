package com.project.musicstore.service;

import java.util.List;

import com.project.musicstore.entity.Product;

public interface ProductService {
	
	public List<Product> getProducts();
	
	public void saveProduct(Product theProduct);
	
	public Product getProduct(int prodId);
	
	public void deleteProduct(int prodId);
	
	public List<Product> searchProduct(String searchedProduct);
	

}
