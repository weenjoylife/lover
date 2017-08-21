package com.ct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ct.entity.User;

@Controller
public class LoginOrRigister {
	
	@RequestMapping(value="/loginOrRigister")
	public String validateUserLogin(User user, ModelAndView modelAndView) {
		
		System.out.println("User名字:" + user.getUserName() + " User密码: " + user.getPassword());
		
		if("zyx".equals(user.getUserName()) && "123".equals(user.getPassword())) {
			modelAndView.addObject("user", user);
			return "welcome";
		}
		
		return "index";
	}

}
