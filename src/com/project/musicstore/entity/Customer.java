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
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="customer")
public class Customer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3632079487183282264L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int customerId;
	
	@NotEmpty (message = "The customer's name field must be filles!")
	@Column(name="customer_name")
    private String customerName;
	
	@NotEmpty (message = "The customer's email must not be null.")
    private String customerEmail;
	
	@Column(name="customer_phone")
	 private String customerPhone;
	 
	    @NotEmpty (message = "The customer's username field can't be empty")
	    @Column(name="customer_username")
	    private String username;

	    @NotEmpty (message = "The customer password must not be null.")
	    @Column(name="customer_password")
	    private String password;

	    @OneToOne
	    @JoinColumn(name="billingAddressId")
	    private BillingAddress billingAddress;

	    @OneToOne
	    @JoinColumn(name="shippingAddressId")
	    private ShippingAddress shippingAddress;

	    @OneToOne
	    @JoinColumn(name = "cartId")
	    @JsonIgnore
	    private Cart cart;
	    
	    private boolean enabled;
	    
	    public Customer() {
	    	
	    }

		public Customer(int customerId,
				@NotEmpty(message = "The customer's name field must be filles!") String customerName,
				@NotEmpty(message = "The customer's email must not be null.") String customerEmail,
				String customerPhone,
				@NotEmpty(message = "The customer's username field can't be empty") String username,
				@NotEmpty(message = "The customer password must not be null.") String password,
				BillingAddress billingAddress, ShippingAddress shippingAddress, Cart cart) {
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerEmail = customerEmail;
			this.customerPhone = customerPhone;
			this.username = username;
			this.password = password;
			this.billingAddress = billingAddress;
			this.shippingAddress = shippingAddress;
			this.cart = cart;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		public String getCustomerPhone() {
			return customerPhone;
		}

		public void setCustomerPhone(String customerPhone) {
			this.customerPhone = customerPhone;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
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

		public Cart getCart() {
			return cart;
		}

		public void setCart(Cart cart) {
			this.cart = cart;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		
		
	    
	    
	    
	    


}
