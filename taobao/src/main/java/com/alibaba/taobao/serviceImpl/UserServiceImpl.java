package com.alibaba.taobao.serviceImpl;



import java.awt.*;
import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.alibaba.taobao.Dao.User;
import com.alibaba.taobao.repository.UserRepository;
import com.alibaba.taobao.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	private final UserRepository repository;


	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	public UserServiceImpl(final UserRepository repository) {
		this.repository= repository;
	}

	@Override
	@Transactional
	public User save(User user) {
		User user1 = new User();
		System.out.println(user.getPassword());
		user1.setAddress(user.getAddress());
		user1.setCity(user.getCity());
		user1.setEmail(user.getEmail());
		user1.setFirstname(user.getFirstname());
		user1.setId(user.getId());
		user1.setLastname(user.getLastname());
		user1.setPassword(passwordEncoder.encode(user.getPassword()));
		user1.setState(user.getState());
		user1.setUsername(user.getUsername());
		user1.setRole(user.getRole());
		user1.setZipcode(user.getZipcode());
		System.out.println(user1.getPassword());
		return repository.save(user1);
	}
	public List<User> getAllUser() {
		return repository.findAll();
	}
	
}
