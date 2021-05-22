package com.shopnoithat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopnoithat.entity.CartItem;
import com.shopnoithat.entity.Customer;
import com.shopnoithat.repository.CartItemRepository;

@Service
public class ShoppingCartService {

	
	@Autowired
	CartItemRepository cartRepo;
	
	public List<CartItem> listCartItems(Customer customer){
		
		return cartRepo.findByCustomer(customer);
		
	}
}
