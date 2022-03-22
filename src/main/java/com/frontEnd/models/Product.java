package com.frontEnd.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "product_seq",allocationSize = 1)
	private long id ;
	private String libellee;
	
	private int price;
	private int qte;
	
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String libellee,int price,int qte) {
		// TODO Auto-generated constructor stub
		this.setLibellee(libellee);
		this.setPrice(price);
		this.setQte(qte);
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibellee() {
		return libellee;
	}
	public void setLibellee(String libellee) {
		this.libellee = libellee;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
