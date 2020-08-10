package com.project.musicstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.musicstore.dao.ProductDAO;
import com.project.musicstore.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDAO productDAO;

	@Override
	@Transactional
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

	@Override
	@Transactional
	public void saveProduct(Product theProduct) {
		productDAO.saveProduct(theProduct);
		
	}

	@Override
	@Transactional
	public Product getProduct(int prodId) {
		return productDAO.getProduct(prodId);
	}

	@Override
	@Transactional
	public void deleteProduct(int prodId) {
		productDAO.deleteProduct(prodId);
		
	}

	@Override
	@Transactional
	public List<Product> searchProduct(String searchedProduct) {
		return productDAO.searchProduct(searchedProduct);
	}

}
