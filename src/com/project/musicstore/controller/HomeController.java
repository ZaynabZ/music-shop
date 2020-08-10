package com.project.musicstore.controller;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.project.musicstore.entity.Product;
import com.project.musicstore.service.ProductService;

@Controller
public class HomeController {
	
	private Path path;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/products-list")
	public String productsList(Model theModel) {
		List<Product> products = productService.getProducts();
		theModel.addAttribute("products", products);
		return "products-list";
	}
	
	//Get details of a certain product
	@GetMapping("/products-list/product-details")
	public String productDetails(@RequestParam("productId")int prodId,
								Model theModel) {
		Product product = productService.getProduct(prodId);
		theModel.addAttribute("product", product);
		return "product-details";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "admin";
	}
	
	@GetMapping("/admin/product-inventory")
	public String productInventory(Model theModel) {
			List<Product> products = productService.getProducts();
			theModel.addAttribute("products", products);
			return "product-inventory";
	}
	
	@GetMapping("/admin/product-inventory/add-product")
	public String addProductForm(Model theModel) {
		Product product = new Product();
		theModel.addAttribute("product", product);
		return "product-form";
	}
	
	@PostMapping("/admin/product-inventory/save-product")
	public String saveProduct(@ModelAttribute("product") Product product, 
			HttpServletRequest request) {
		
		productService.saveProduct(product);
		/*
		 * MultipartFile productImage = product.getProductImage(); String rootDirectory
		 * = request.getSession().getServletContext().getRealPath("/"); path =
		 * Paths.get(rootDirectory +
		 * "\\WEB-INF\\resources\\images\\" + product.getProductId() + ".png"); if
		 * (productImage != null && !productImage.isEmpty()) {
		 * System.out.println("File is not empty"); try { productImage.transferTo(new
		 * File(path.toString())); } catch (Exception e) { e.printStackTrace(); throw
		 * new RuntimeException("Product image saving failed", e); } }
		 */
		return "redirect:/admin/product-inventory";
	}
	
	@GetMapping("/admin/product-inventory/edit-product")
	public String editProduct(@RequestParam("productId") int theId,
								Model theModel) {
		
		Product theProduct = productService.getProduct(theId);
		theModel.addAttribute("product", theProduct);
		return "product-form";
	}
	
	@GetMapping("/admin/product-inventory/delete-product")
	public String deleteProduct(@RequestParam("productId")int prodId,
								Model theModel) {
		productService.deleteProduct(prodId);
		return "redirect:/admin/product-inventory";
		
	}
}
