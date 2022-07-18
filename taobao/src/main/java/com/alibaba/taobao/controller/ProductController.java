package com.alibaba.taobao.controller;


import com.alibaba.taobao.Request.ProductListReq;
import com.alibaba.taobao.common.ApiRestResponse;
import com.alibaba.taobao.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    @Autowired
    ProductService productService;

    @GetMapping("/product/detail")
    public ApiRestResponse detail (@RequestParam int id){
        return ApiRestResponse.success(productService.ProductDetail(id));
    }


    @PostMapping ("/product/list")
    public ApiRestResponse list (@RequestBody ProductListReq productListReq){
        return ApiRestResponse.success(productService.list(productListReq));
    }



}
