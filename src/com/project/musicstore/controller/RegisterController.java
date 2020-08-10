package com.project.musicstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.musicstore.entity.BillingAddress;
import com.project.musicstore.entity.Customer;
import com.project.musicstore.entity.ShippingAddress;
import com.project.musicstore.service.CustomerService;

@Controller
public class RegisterController {
	
	@Autowired
    private CustomerService customerService;
	
	@GetMapping("/register")
	public String registerCustomer(Model theModel) {
		Customer customer = new Customer();
		BillingAddress billingAddress = new BillingAddress();
        ShippingAddress shippingAddress = new ShippingAddress();
        
        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);
        
        theModel.addAttribute("customer", customer);
        
		return "registerCustomer";
	}

}
