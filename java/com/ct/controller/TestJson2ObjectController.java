package com.ct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ct.entity.User;

@Controller
public class TestJson2ObjectController {

	@RequestMapping(value="/love/json2Obj",method=RequestMethod.POST)
	public void getUser(@RequestBody User user) {
		System.out.println(user.getPassword());
	}
}
