package com.shopnoithat.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.shopnoithat.entity.Category;
import com.shopnoithat.entity.OrderDetail;
import com.shopnoithat.entity.Product;
import com.shopnoithat.repository.FileDBRepository;
import com.shopnoithat.service.CartService;
import com.shopnoithat.service.CateoryService;
import com.shopnoithat.service.FileStorageService;

@Controller
public class demoController {
	@Autowired 
	private FileStorageService f;
	
	@Autowired
	private FileDBRepository repo;
	
	@Autowired
	private CateoryService cate;
	
	@Autowired
	private CartService cartService;
	
	public List<OrderDetail> list;
	@GetMapping("/demo/text")
	public String text() {

		return "demo/test-editor";
	}
	
	@GetMapping("/demo")
	public String demo( Model model) {
		model.addAttribute("ten",cate.getAllCategory());
		return "demo/index";
	}
	
	@GetMapping("/demo/danh-muc/{code}")
	public String showAllProductById(@PathVariable("code") Category id, Model model) {
		List<Product> product = f.getProductByCategory(id);
		
		model.addAttribute("list",product);
		return "demo/showSP";
	}
	
	@GetMapping("/demo/detail/{id}")
	public String showProductById(@PathVariable("id") long id, Model model) {
		Product product = f.findById(id);
		
		model.addAttribute("list",product);
		return "demo/detail";
	}
	
	@GetMapping("/demo/checkout/{id}")
	public String checkout(Model model,@PathVariable("id") long id) {
		OrderDetail cart = new OrderDetail();
		Product product = f.findById(id);
		
		model.addAttribute("ten",cate.getAllCategory());
		return "demo/checkout";
	}
	@GetMapping("/demo/cart")
	public String cart(Model model) {
		
		
		
		model.addAttribute("listCart",list);
		return "demo/checkout";
	}
	

}
