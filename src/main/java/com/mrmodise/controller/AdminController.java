package com.mrmodise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/")
	public String home(){
		return "Admin home only";
	}
	
	@RequestMapping("/add")
	public String add(){
		return "admin is able to add stuff";
	}

}
