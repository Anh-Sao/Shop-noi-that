package com.shopnoithat.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.shopnoithat.entity.Category;
import com.shopnoithat.entity.Product;
import com.shopnoithat.entity.Supplier;
import com.shopnoithat.service.CateoryService;
import com.shopnoithat.service.FileStorageService;
import com.shopnoithat.service.SupplierService;


@Controller
public class ProductController {
	@Autowired 
	private FileStorageService f;
	
	
	@Autowired
	private CateoryService cate;
	
	@Autowired
	private SupplierService suli;
	
	@GetMapping("/admin/products/save_products")
	public String show(Model model) {
		
		List<Product> p = f.findAll();
		model.addAttribute("ten",cate.getAllCategory());
		model.addAttribute("supp",suli.getAllSupplier());
		model.addAttribute("list",p);
		return "admin/products/save_products";
	}
	
	@PostMapping("/admin/products/save")
	public String save(@RequestParam("thumbnail") MultipartFile thumbnail,
    		@RequestParam("title") String title,
    		@RequestParam("count") int count,
    		@RequestParam("price") double price,
    		@RequestParam("content") String content,
    		@RequestParam("category") Category category,
    		@RequestParam("supplier") Supplier supplier
			) {
		
		try {
			f.save(title,count,price,thumbnail,content,category,supplier);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "admin/products/save_products";
	}
}
