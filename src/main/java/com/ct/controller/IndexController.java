package com.ct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
//	@RequestMapping("/")
//	public @ResponseBody String showIndex() {
//		return "index";
//	}
	
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}

}
