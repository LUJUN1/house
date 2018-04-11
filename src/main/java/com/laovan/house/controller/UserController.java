package com.laovan.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=0;
		return "hahhah"+a;
	}
	
	@RequestMapping("/test2")
	public String test2() {
		int a=0;
		return "/index";
	}

}
