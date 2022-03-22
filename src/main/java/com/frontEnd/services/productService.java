package com.frontEnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.frontEnd.dao.productRepository;
import com.frontEnd.models.Product;


@Service
public class productService implements IterfaceProductService {
	
	
	@Autowired
	productRepository dao;

	@Transactional
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product>lp =(List<Product>) dao.findAll();
		return lp;
	}

	@Transactional
	public void addClient(Product p) {
		// TODO Auto-generated method stub
		dao.save(p);
	}

	@Transactional
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		p.setLibellee(p.getLibellee());
		p.setPrice(p.getPrice());
		p.setQte(p.getQte());
		dao.save(p);
		return p;
	}

	@Transactional
	public void DeleteProduct(long id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Transactional
	public Product getOneProdut(long id) {
		// TODO Auto-generated method stub
		Product p=dao.findById(id).get();
		return p;
	}
	
	
	

}
