package com.project.musicstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cartitem")
public class CartItem implements Serializable{

	private static final long serialVersionUID = 8024407921258762092L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int cartItemId;
	
	@ManyToOne
    @JoinColumn(name = "cartId")
	private Cart cart;
	
	@ManyToOne
    @JoinColumn(name = "productId")
	private Product product;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="totalPrice")
    private double totalPrice;

    public CartItem() {
    	
    }

	public CartItem(Cart cart, Product product, int quantity, double totalPrice) {
		super();
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}

