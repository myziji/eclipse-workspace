package com.alibaba.taobao.controller;


import com.alibaba.taobao.common.ApiRestResponse;
import com.alibaba.taobao.filiter.UserFilter;
import com.alibaba.taobao.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

        @Autowired
        CartService cartService;

        @PostMapping("/add")
        public ApiRestResponse add(@RequestParam int productId,@RequestParam int count){

                cartService.add(UserFilter.currentUser.getId(),productId,count);

                return ApiRestResponse.success();

        }


}
