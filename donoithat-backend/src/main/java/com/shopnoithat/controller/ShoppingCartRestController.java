package com.shopnoithat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shopnoithat.entity.OrderDetail;
import com.shopnoithat.service.CartService;

@RestController
public class ShoppingCartRestController {
	public List<OrderDetail> list;
	
	@Autowired
	private CartService cartService;
	
	@GetMapping("/demo/addToCart/{id}")
	public  void addToCart(@PathVariable("id") long id) {
	
		list = new ArrayList<OrderDetail>();
		
		
	}
}
