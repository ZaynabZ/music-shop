package com.project.musicstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.musicstore.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO{	
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Product> theQuery = currentSession.createQuery("from Product order by productName", Product.class);
		List<Product> products = theQuery.getResultList();
		return products;
	}

	@Override
	public void saveProduct(Product theProduct) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theProduct);
	}

	@Override
	public Product getProduct(int prodId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Product product = currentSession.get(Product.class, prodId);
		return product;
	}

	@Override
	public void deleteProduct(int prodId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Product where productId=:prodId");
		theQuery.setParameter("prodId", prodId);
		theQuery.executeUpdate();
		
	}

	@Override
	public List<Product> searchProduct(String searchedProduct) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = null;
		if(searchedProduct != null && searchedProduct.trim().length() > 0) {
			theQuery = currentSession.createQuery("from Product where lower(productName) like :keyWord"
					+ "or lower(productCategory) like :keyWord"
					+ "or lower(productManufacturer) like :keyWord");
			theQuery.setParameter("keyWord", "%" + searchedProduct.toLowerCase() + "%");
			
		}
		else {
			theQuery = currentSession.createQuery("from Product order by productName", Product.class);
		}
		
		List<Product> products = theQuery.getResultList();
		return products;
	}
	


}
