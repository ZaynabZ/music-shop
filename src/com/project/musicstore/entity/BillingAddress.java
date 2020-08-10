package com.project.musicstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="billadress")
public class BillingAddress implements Serializable{

	private static final long serialVersionUID = -2541513485942543310L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int billingAddressId;
	
	@Column(name="street_name")
    private String streetName;
	
	@Column(name="apartment_number")
    private String apartmentNumber;
	
	@Column(name="city")
    private String city;
	
	@Column(name="state")
    private String state;
	
	@Column(name="country")
    private String country;
	
	@Column(name="zipcode")
    private String zipCode;
	
	@OneToOne
    private Customer customer;
	
	public BillingAddress() {
		
	}

	public BillingAddress(String streetName, String apartmentNumber, String city, String state, String country,
			String zipCode, Customer customer) {
		this.streetName = streetName;
		this.apartmentNumber = apartmentNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
		this.customer = customer;
	}

	public int getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	

}
