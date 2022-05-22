package com.alibaba.taobao.service;




import java.util.List;

import com.alibaba.taobao.Dao.User;

public interface UserService {

	User save(User user);
	List<User> getAllUser();
	


}
