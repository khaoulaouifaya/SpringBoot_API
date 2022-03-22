package com.frontEnd.services;

import java.util.List;

import com.frontEnd.models.Product;

public interface IterfaceProductService {
	
	
	List<Product> getAllProduct();
	void addClient(Product p);
	Product updateProduct(Product p);
	void DeleteProduct(long id);
	Product getOneProdut(long id);
	
	

}
