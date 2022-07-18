package com.alibaba.taobao.service;

import com.alibaba.taobao.Dao.Category;
import com.alibaba.taobao.Dao.Product;
import com.alibaba.taobao.Request.AddCategoryReq;
import com.alibaba.taobao.Request.AddProductReq;
import com.alibaba.taobao.Request.ProductListReq;
import com.alibaba.taobao.exception.ImoocMallException;
import com.alibaba.taobao.vo.CategoryVo;

import java.util.List;


public interface ProductService {

    void add(AddProductReq addProductReq);

    void updateProduct(Product updateProduct);

    void deleteProduct(int id);

    void updateProductStatus(int[] ids, int sellStatus);

    List<Product> adminList();

    Product ProductDetail(int id);

    List<Product> list(ProductListReq productListReq);
}
