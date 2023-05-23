package com.distribuidorabr.Service.interfaces;

import java.util.ArrayList;

import com.distribuidorabr.Model.Product;

public interface ProductServicetIntf {

	public ArrayList<Product> findAll();
	public Product findById(int id);
	public Product save(Product product);
	public Product update(Product product);
	public void delete(int id);
	public Product vender(Product product, Double quantidade);
	public Product comprar(Product product, Double quantidade);
}
