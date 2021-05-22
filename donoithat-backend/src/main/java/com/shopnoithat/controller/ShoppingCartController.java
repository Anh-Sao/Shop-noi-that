package com.shopnoithat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.shopnoithat.service.ShoppingCartService;

@Controller
public class ShoppingCartController {
	
	
	@Autowired
	ShoppingCartService cartService;
	
	@GetMapping("/cart")
	public String showShoppingCart(Model model) {
		return "demo/checkout";
	}
}
