package com.alibaba.taobao.controller;



import java.security.NoSuchAlgorithmException;
import java.util.List;

import com.alibaba.taobao.common.ApiRestResponse;
import com.alibaba.taobao.common.Constant;
import com.alibaba.taobao.exception.ImoocMallException;
import com.alibaba.taobao.exception.ImoocMallExceptionEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import com.alibaba.taobao.Dao.User;
import com.alibaba.taobao.service.UserService;

import javax.servlet.http.HttpSession;


@RestController
public class UserController {
	

	@Autowired
	private  UserService userService;
	@Autowired
	public UserController( UserService userService) {
		this.userService = userService;
	}
	

	@PostMapping( "/register")
	@ResponseBody
	public ApiRestResponse register(@RequestParam("userName") String userName,@RequestParam("password")String password) throws ImoocMallException {

		if(StringUtils.isEmpty(userName)){
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_NAME);
		}
		if(StringUtils.isEmpty(password)){
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_PASSWORD);
		}
		if(password.length()<8){
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_TOO_SHORT);
		}

		userService.register(userName,password);
		return ApiRestResponse.success();

	}

	@PostMapping( "/login")
	@ResponseBody
	public  ApiRestResponse login(@RequestParam("userName") String userName, @RequestParam("password")String password,HttpSession session) throws ImoocMallException, NoSuchAlgorithmException {
		if(StringUtils.isEmpty(userName)){
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_NAME);
		}
		if(StringUtils.isEmpty(password)){
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_PASSWORD);
		}

		User user =userService.login(userName,password);
		session.setAttribute(Constant.IMOOC_MALL_USER,user);
		user.setPassword(null);
		return ApiRestResponse.success(user);

	}
	@PostMapping( "/user/update")
	@ResponseBody
	public ApiRestResponse updateUserInfo(HttpSession session, @RequestParam String signature){
		User currentUser = (User) session.getAttribute(Constant.IMOOC_MALL_USER);
		//System.out.println(session.getAttribute(Constant.IMOOC_MALL_USER).toString());
		if(currentUser == null){
			return ApiRestResponse.error(ImoocMallExceptionEnum.LOGIN_FIRST);
		}
		User user = new User();
		user.setUsername(currentUser.getUsername());
		user.setPersonalizedSignature(signature);
		//System.out.println(user);
		userService.updateInformation(user);
		return ApiRestResponse.success();
	}

	@PostMapping("/user/logout")
	public ApiRestResponse logout(HttpSession session){
		session.removeAttribute(Constant.IMOOC_MALL_USER);
		return ApiRestResponse.success();
	}
	@PostMapping( "/admin/login")
	@ResponseBody
	public  ApiRestResponse adminLogin(@RequestParam("userName") String userName, @RequestParam("password")String password,HttpSession session) throws ImoocMallException, NoSuchAlgorithmException {
		if(StringUtils.isEmpty(userName)){
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_USER_NAME);
		}
		if(StringUtils.isEmpty(password)){
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_PASSWORD);
		}

		User user =userService.login(userName,password);
		if (userService.checkAdminRole(user)) {
			session.setAttribute(Constant.IMOOC_MALL_USER,user);
			user.setPassword(null);

		}else {
			return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_ADMIN);
		}
		return ApiRestResponse.success(user);

	}



	@RequestMapping(value = "/getallusers", method = RequestMethod.GET)
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public void login(User user) {
//		System.out.println("username"+ user.getUsername());
//		System.out.println("password"+ user.getPassword());
//	}
}
