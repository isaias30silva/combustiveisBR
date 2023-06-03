package com.distribuidorabr.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuidorabr.DAO.OrderDAO;
import com.distribuidorabr.Exceptions.InvalidUpdateQueryException;
import com.distribuidorabr.Exceptions.NoQueryResultsException;
import com.distribuidorabr.Model.Item;
import com.distribuidorabr.Model.Order;
import com.distribuidorabr.Model.Product;
import com.distribuidorabr.Service.interfaces.OrderServiceIntf;
import com.distribuidorabr.enums.OrderType;

@Service
public class OrderService implements OrderServiceIntf{

	@Autowired
	OrderDAO dao;
	
	@Autowired
	ProductService productService;
	
	@Override
	public ArrayList<Order> findAll() {
		ArrayList<Order> list = (ArrayList<Order>)dao.findAll();
		if(!list.isEmpty()) {
			return list;
		}
		throw new NoQueryResultsException("Não foram encontrados registros para a busca selecionada");
	}

	@Override
	public Order findById(UUID id) {
		Optional<Order> res = dao.findById(id);
		if (res.isPresent()) {
			Order order = res.get();
			return order;
		}
		throw new InvalidUpdateQueryException("Não foram encontrados registros para o ID " + id);
	}

	@Override
	public Order save(Order order) {
		
		//matching all items to order
		for (Item item : order.getItems()) {
			item.setOrder(order);
			
			Product product = productService.findById(item.getProduct().getId());
			/* unitValue is the result of multiplying 
			 * the item quantity by the price of the product
			 */
			item.setUnitValue(item.getQuantity() * product.getPrice());
			/* if the order is a purchase, the product stock will 
			 * increase according to quantity of the item
			 */
			if(order.getType() == OrderType.PURCHASE) { 
				productService.purchase(product, item.getQuantity());
				/* if the order is a sale, the product stock will 
				 * decrease according to quantity of the item
				 */
			} else if(order.getType() == OrderType.SALE){
				productService.sale(product, item.getQuantity());
			} 
		}
		/*
		 * totalValue is the sum of the unit values ​​of all items in the order
		 * this attribute is calculated automatically by the method setTotalValue()
		 */
		order.setTotalValue();
		order.setDate();
		return dao.save(order);
	}

}
