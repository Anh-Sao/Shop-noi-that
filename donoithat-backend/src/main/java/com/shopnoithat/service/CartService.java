package com.shopnoithat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopnoithat.entity.OrderDetail;
import com.shopnoithat.entity.Product;
import com.shopnoithat.repository.CartItemRepository;
import com.shopnoithat.repository.FileDBRepository;

@Service
public class CartService {
	
	@Autowired
	CartItemRepository cartRepo;
	@Autowired
	FileDBRepository productRepo;
	
	public  void addProduct(Long productId) {
//		Integer addedQuantity = quantity;
		
		Product product = productRepo.findById(productId).get();
		
		
		OrderDetail cart = new OrderDetail();
//		cart.setQuanity(quantity);
		cart.setProduct(product);
		List<OrderDetail> list =  new ArrayList<OrderDetail>();
		list.add(cart);
		
		
				
	}


}
