package com.shopnoithat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopnoithat.repository.FileDBRepository;
import com.shopnoithat.service.CartService;
import com.shopnoithat.service.CateoryService;
import com.shopnoithat.service.FileStorageService;

@Controller

public class HomeController {
	@Autowired 
	private FileStorageService f;
	
	@Autowired
	private FileDBRepository repo;
	
	@Autowired
	private CateoryService cate;
	
	@Autowired
	private CartService cartService;
	   @GetMapping(value={"/admin-shop/","/admin-shop/home"})
	    public String getAdminHome(){
	        return "ad_layout";
	    }
	    @GetMapping(value={"/","/home"})
	    public String getShopHome(Model model){
	    	model.addAttribute("ten",cate.getAllCategory());
	        return "shop_layout";
	    }

	    @GetMapping(value = "/admin-shop/contact")
	    public String getContact(){;
	        return "admin/contact";
	    }
	    
	    @GetMapping(value = "/403")
	    public String get403() {
	        return "403";
	    }



}
