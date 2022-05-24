package com.alibaba.taobao.serviceImpl;



import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.transaction.Transactional;


import com.alibaba.taobao.Utils.MD5Utils;
import com.alibaba.taobao.exception.ImoocMallExceptionEnum;
import com.alibaba.taobao.exception.ImoocMallException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.taobao.Dao.User;
import com.alibaba.taobao.repository.UserRepository;
import com.alibaba.taobao.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private  UserRepository repository;


	@Override
	public void register(String userName, String password) throws ImoocMallException {
		User result = repository.findByUsername(userName);
		if (result != null){
			throw new ImoocMallException(ImoocMallExceptionEnum.USERNAME_IS_EXIST);
		}

		User user = new User();
		user.setUsername(userName);
		user.setPassword(MD5Utils.getMD5Str(password));
		repository.save(user);


	}

	@Override
	public User login(String userName, String password) throws ImoocMallException, NoSuchAlgorithmException {
		User user = repository.findByUsername(userName);
		//String passwordCheck = MD5Utils.getMD5Str(password);

		if(user == null){
			throw new ImoocMallException( ImoocMallExceptionEnum.WRONG_PASSWORD);
		}
		if(! password.equals(user.getPassword())){
			throw new ImoocMallException( ImoocMallExceptionEnum.WRONG_PASSWORD);
		}
		return user;
	}

	@Override
	@Transactional
	public void updateInformation(User user){
		System.out.println(user.toString());
		User updateUser =  repository.findByUsername(user.getUsername());
		updateUser.setPersonalizedSignature(user.getPersonalizedSignature());
		repository.save(updateUser);
	}

	@Override
	public boolean checkAdminRole(User user){
		boolean check = true;
		Long x = Long.valueOf(2);
		return user.getRole().equals(x);
	}




//	@Override
//	@Transactional
//	public User save(User user) {
////		User user1 = new User();
////		System.out.println(user.getPassword());
////		user1.setAddress(user.getAddress());
////		user1.setCity(user.getCity());
////		user1.setEmail(user.getEmail());
////		user1.setFirstname(user.getFirstname());
////		user1.setId(user.getId());
////		user1.setLastname(user.getLastname());
////		user1.setPassword(passwordEncoder.encode(user.getPassword()));
////		user1.setState(user.getState());
////		user1.setUsername(user.getUsername());
////		user1.setRole(user.getRole());
////		user1.setZipcode(user.getZipcode());
////		System.out.println(user);
////		System.out.println(user1);
//		return repository.save(user);
//	}
	public List<User> getAllUser() {
		return repository.findAll();
	}

}
