package com.alibaba.taobao.service;

import com.alibaba.taobao.Dao.Category;
import com.alibaba.taobao.Request.AddCategoryReq;
import com.alibaba.taobao.exception.ImoocMallException;
import com.alibaba.taobao.vo.CategoryVo;

import java.util.List;


public interface CategoryService {
    void add(AddCategoryReq addCategoryReq) throws ImoocMallException;

    void  updateCategory(Category updateCategoryReq);

    void delete(int id);

    List<Category> listForAdmin();

    List<CategoryVo>  listCategory();
}
