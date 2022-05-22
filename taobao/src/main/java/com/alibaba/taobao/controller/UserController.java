package com.alibaba.taobao.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.taobao.Dao.User;
import com.alibaba.taobao.service.UserService;

@RestController
public class UserController {
	

	@Autowired
	private  UserService userService;
	@Autowired
	public UserController( UserService userService) {
		this.userService = userService;
	}
	

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public User creatUser(User user) {
		return userService.save(user);
	}
	@RequestMapping(value = "/getallusers", method = RequestMethod.GET)
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(User user) {
		System.out.println("username"+ user.getUsername());
		System.out.println("password"+ user.getPassword());
	}
}
