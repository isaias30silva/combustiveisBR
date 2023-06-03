package com.distribuidorabr.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuidorabr.DAO.ProductDAO;
import com.distribuidorabr.Exceptions.CpfAlreadyRegisteredException;
import com.distribuidorabr.Exceptions.InvalidUpdateQueryException;
import com.distribuidorabr.Exceptions.NoQueryResultsException;
import com.distribuidorabr.Model.Company;
import com.distribuidorabr.Model.Employee;
import com.distribuidorabr.Model.Product;
import com.distribuidorabr.Service.interfaces.ProductServicetIntf;

@Service
public class ProductService implements ProductServicetIntf{

	@Autowired
	ProductDAO dao;
	
	@Override
	public ArrayList<Product> findAll() {
		ArrayList<Product> list = (ArrayList<Product>)dao.findAll();
		if(!list.isEmpty()) {
			return list;
		}
		throw new NoQueryResultsException("Não foram encontrados registros para a busca selecionada");
	}

	@Override
	public Product findById(UUID id) {
		Optional<Product> res = dao.findById(id);
		if(res.isPresent()) {
			Product product = res.get();
			return product;
		}
		throw new InvalidUpdateQueryException("Não foram encontrados registros para o ID " + id);
	}

	@Override
	public Product save(Product product) {
		return dao.save(product);
	}

	@Override
	public Product update(Product product) {
		Optional<Product> res = dao.findById(product.getId());
		if (res.isEmpty()) {
			throw new InvalidUpdateQueryException("Produto inválido!");
		} else if (res.get().getCategory() != product.getCategory()) {
			throw new InvalidUpdateQueryException("Produto já cadastrado!");
		}
		return dao.save(product);
		
	}

	@Override
	public void delete(UUID id) {
		dao.deleteById(id);
		
	}

	public Product sale(Product product, double quantity) {
		product.decreaseStock(quantity);
		return update(product);
	}
	
	public Product purchase(Product product, double quantity) {
		product.increaseStock(quantity);
		return update(product);
	}
	
}
