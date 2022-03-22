package com.frontEnd.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frontEnd.models.Product;

@Repository
public interface productRepository extends CrudRepository<Product, Long>{
	
	

}
