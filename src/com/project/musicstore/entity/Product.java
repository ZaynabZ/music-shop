package com.project.musicstore.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int productId;
	
	@Column(name="name")
	private String productName;
	
	@Column(name="prodCategory")
	private String productCategory;
	
	@Column(name="description")
	private String productDescription;
	
	@Column(name="price")
	private double productPrice;
	
	@Column(name="prodCondition")
	private String productCondition;
	
	@Column(name="status")
	private String productStatus;
	
	@Column(name="unitInStock")
	private int unitInStock;
	
	@Column(name="productManufacturer")
	private String productManufacturer;
	
	//@Column(name="image")
	//private byte[] productImage;
	
	public Product() {
		
	}

	public Product(String productName, String productCategory, String productDescription, double productPrice,
			String productCondition, String productStatus, int unitInStock, String productManufacturer) {
		this.productName = productName;
		this.productCategory = productCategory;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productCondition = productCondition;
		this.productStatus = productStatus;
		this.unitInStock = unitInStock;
		this.productManufacturer = productManufacturer;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCondition() {
		return productCondition;
	}

	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	public String getProductManufacturer() {
		return productManufacturer;
	}

	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	/*
	 * public byte[] getProductImage() { return productImage; }
	 * 
	 * public void setProductImage(byte[] productImage) { this.productImage =
	 * productImage; }
	 */

	
	
}
