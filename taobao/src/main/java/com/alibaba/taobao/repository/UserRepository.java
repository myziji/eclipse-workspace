package com.alibaba.taobao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alibaba.taobao.Dao.User;

 
public interface UserRepository extends JpaRepository<User, String> {
	User findByUsername(String username);
}