package com.bht.hibernate.dao;

import java.util.List;

import com.bht.hibernate.bean.User;

public interface UsersDao {
	
	void saveUser(User user);
	void updateUser(User user);
	User getUserById(int id);
	List<User> getAllStudents();
	void deleteUser(int id);
}
