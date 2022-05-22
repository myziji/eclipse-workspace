package com.alibaba.taobao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class Test {
	
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String myIndex() {
		return  "index";
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String myIndex1() {
		return  "index2";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm(){
		return "login";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(){
		return "register";
	}
	@RequestMapping(value = "/forgot-password", method = RequestMethod.GET)
	public String forgotPassword(){
		return "forgot-password";
	}
	
	
}
