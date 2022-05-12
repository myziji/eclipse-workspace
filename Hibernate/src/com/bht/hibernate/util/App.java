package com.bht.hibernate.util;


import java.util.List;

import com.bht.hibernate.bean.User;
import com.bht.hibernate.dao.UsersDaoo;

public class App {
	public static void main(String[] args) {
		UsersDaoo userDao = new UsersDaoo();
		User user = new User(5,"shab");
		userDao.saveUser(user);
		System.out.print("***************");
		//userDao.insertUser();
		
		// update student
//		User user1 = new User(8,"iuhasiu");
//		userDao.updateUser(user1);
//		System.out.print("iiiiiiiiiiiiiiiiiii");
		
		// get students
//		List<User> users = userDao.getAllStudents();
//		users.forEach(s -> System.out.println(s.getUsername()));
//		
		// get single student
//		User user2 = userDao.g(1);
//		System.out.println(user2.getFirstName());
		
		// delete student
		userDao.deleteUser(1);
		System.out.print("//////////////////");
	}
}
