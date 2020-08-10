package com.project.musicstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class CustomerOrder implements Serializable {

	private static final long serialVersionUID = 683828522799508231L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int customerOrderId;
	
	@OneToOne
    @JoinColumn(name = "cartId")
	private Cart cart;
	private Customer customer;
	private BillingAddress billingAddress;
	private ShippingAddress shippingAddress;
	
	public CustomerOrder() {
		
	}

	public CustomerOrder(Cart cart, Customer customer, BillingAddress billingAddress, ShippingAddress shippingAddress) {
		this.cart = cart;
		this.customer = customer;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
	}

	public int getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
	
	
}
