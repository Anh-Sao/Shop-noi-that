package com.shopnoithat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    
    @GetMapping(value={"","/admin/home"})
    public String getIndex(){
        return "ad_layout";
    }



}
