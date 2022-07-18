package com.alibaba.taobao.controller;


import com.alibaba.taobao.Dao.Product;
import com.alibaba.taobao.Request.AddProductReq;
import com.alibaba.taobao.Request.updateProductReq;
import com.alibaba.taobao.common.ApiRestResponse;
import com.alibaba.taobao.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProductAdminController {

    @Autowired
    ProductService productService;

    @PostMapping("/admin/product/add")
    public ApiRestResponse addProduct(@Valid @RequestBody AddProductReq addProductReq){
        productService.add(addProductReq);
        return  ApiRestResponse.success();

    }

    @PostMapping("/admin/product/update")
    public  ApiRestResponse updateProduct(@Valid @RequestBody updateProductReq updateProductReq){
        Product product = new Product();
        BeanUtils.copyProperties(updateProductReq,product);
        productService.updateProduct(product);
        return ApiRestResponse.success();

    }

    @PostMapping("/admin/product/delete")
    public ApiRestResponse deleteProduct(@RequestParam int id){
        productService.deleteProduct(id);
        return ApiRestResponse.success();
    }

    @PostMapping("/admin/product/batchUpdateSellStatus")
    public  ApiRestResponse updateProductStatus(@RequestParam int[] ids,@RequestParam int sellStatus){
        productService.updateProductStatus(ids,sellStatus);
        return ApiRestResponse.success();

    }
    @GetMapping("/admin/product/list")
    public  ApiRestResponse adminList(){
        return ApiRestResponse.success(productService.adminList());

    }








}
