package com.noithat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController {
	
	
	@GetMapping(value = "/index")
	public String index() {
		return "admin.index";
	}
	
	@GetMapping(value = "/customer")
	public String customer() {
		return "admin.customer";
	}
	
	@GetMapping(value = "/supplier")
	public String supplier() {
		return "admin.supplier";
	}

}
