package com.mrmodise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mrmodise.domain.User;
import com.mrmodise.service.UserService;

@Controller
@Secured( {"ROLE_ADMIN"} )
@RequestMapping("/admin")
public class AdminController {
	
	private UserService userService;
	
	
	@Autowired
	public AdminController(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/")
	public String home(){
		return "index";
	}
	
	@RequestMapping("/user/create")
	public String createUser(Model model){
		model.addAttribute("user", new User());
		return "admin";
	}
	
	@RequestMapping("/user/save")
	public String saveUser(User user, Model model){
		//for simplicity we will assume the saving process is successful
		userService.saveUser(user);
		model.addAttribute("message", "User successfully saved");
		return "admin";
	}
	
	
}
