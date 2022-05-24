package com.alibaba.taobao.service;




import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.alibaba.taobao.Dao.User;
import com.alibaba.taobao.exception.ImoocMallException;

public interface UserService {

	User login(String userName, String password) throws ImoocMallException, NoSuchAlgorithmException;

    void updateInformation(User user);


	boolean checkAdminRole(User user);

	List<User> getAllUser();

	void register(String name,String password) throws ImoocMallException;


}
