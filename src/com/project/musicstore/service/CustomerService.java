package com.project.musicstore.service;

import java.util.List;

import com.project.musicstore.entity.Customer;

public interface CustomerService {
	
	void addCustomer (Customer customer);

    Customer getCustomerById (int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername (String username);

}
