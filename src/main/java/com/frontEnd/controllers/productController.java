package com.frontEnd.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frontEnd.models.Product;
import com.frontEnd.services.IterfaceProductService;


@RestController
@RequestMapping("/products")
public class productController{

	@Autowired
	IterfaceProductService service;

	@GetMapping("/all")
	public List<Product> getAll(Model model) {
		// TODO Auto-generated method stub
		model.addAttribute("listeProduct",service.getAllProduct()) ;
		List<Product>lp=service.getAllProduct();
		return  lp;
	}

	@PostMapping("/addProduct")
	public void addClient(@RequestBody Product p) {
		// TODO Auto-generated method stub
		service.addClient(p);
		
		
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody   Product p) {
		// TODO Auto-generated method stub
		return service.updateProduct(p);
	}

	@DeleteMapping("/{id}")
	public void DeleteProduct(@PathVariable("id") long id) {
		// TODO Auto-generated method stub
		service.DeleteProduct(id);
	}

	@GetMapping("/{id}")
	public Product getOneProdut(@PathVariable("id") long id) {
		// TODO Auto-generated method stub
		return service.getOneProdut(id);
	}
	
}
