package com.distribuidorabr.Service;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuidorabr.DAO.ProductDAO;
import com.distribuidorabr.Model.Product;
import com.distribuidorabr.Service.interfaces.ProductServicetIntf;

@Service
public class ProductService implements ProductServicetIntf{

	@Autowired
	ProductDAO dao;
	
	@Override
	public ArrayList<Product> findAll() {
		return (ArrayList<Product>) dao.findAll();
	}

	@Override
	public Product findById(int idProduct) {
		return dao.findById(idProduct).orElse(null);
	}

	@Override
	public Product save(Product product) {
		return dao.save(product);
	}

	@Override
	public Product update(Product product) {
		if(product.getIdProduct() != 0 && product.getName() != null) {
			return dao.save(product);
		} else {
			return null;
		}
		
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}
	
	//primeiro, é preciso que os produtos estejam criados no banco (gasolina, etanol, etc) 
	//e que todos tenham valor inicial de 5000.0 litros/metros cubicos na variavel stock
	
	//metodo para verificar se pode ser vendida a quantidade solicitada pelo cliente
	//será verificado se a quantidade da variável "stock" menos a quantidade pedida pelo cliente é maior que zero
	//em caso negativo, o retorno será nulo. 
	//em caso positivo, a venda será realizada, atualizando a variável "stock" com o que restar da substração.
	 @Override
	    public Product vender(Product product, Double quantidade) {
	        Double novoStock = (product.getStock() - quantidade);
	        if (novoStock <= 0) {
	        	//se a venda for menor ou igual a zero, será exibida uma caixa de diálogo
	        	JOptionPane.showMessageDialog(null, "Operação negada\nMotivo: excede o total disponível em estoque\nEstoque atual: " + product.getStock());
	                return null;
	            } else if (novoStock < (-5000.0)) {
	                return null;
	            }
	        
	        product.setStock(novoStock);
	        if (novoStock <= 1000.0) {
	        	//logo após a venda e a atualização da variável "stock" será emitido um alerta
	        	//caso a quantidade restante em stock seja menor que 1000.0
	        	//esse valor é referente à 20% do storageCapacity (5000.0)
	        	JOptionPane.showMessageDialog(null, "Abastecimento de Estoque\nReservatório com menos de 20% da capacidade\nEstoque atual: " + novoStock);
	            }
	        return dao.save(product);
	        
	        
	        
	    }

}
