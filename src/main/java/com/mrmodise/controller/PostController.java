package com.mrmodise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	@RequestMapping("/list")
	public String list(){
		return "list posts...";
	}
	
	@RequestMapping("/view")
	public String viewDrafts(){
		return "view drafts";
	}

}
