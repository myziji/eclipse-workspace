package com.alibaba.taobao.controller;


import com.alibaba.taobao.Dao.Category;
import com.alibaba.taobao.Dao.User;
import com.alibaba.taobao.Request.AddCategoryReq;
import com.alibaba.taobao.Request.UpdateCategoryReq;
import com.alibaba.taobao.common.ApiRestResponse;
import com.alibaba.taobao.common.Constant;
import com.alibaba.taobao.exception.ImoocMallExceptionEnum;
import com.alibaba.taobao.service.CategoryService;
import com.alibaba.taobao.service.UserService;
import com.alibaba.taobao.vo.CategoryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;


@RestController
public class CategoryController {

    @Autowired
    UserService userService;

    @Autowired
    CategoryService categoryService;

    @PostMapping("/admin/category/add")
    @ResponseBody
    public ApiRestResponse addCategory(HttpSession session, @Valid @RequestBody  AddCategoryReq req){
        User currentUser = (User) session.getAttribute(Constant.IMOOC_MALL_USER);
        if (currentUser == null){
            return ApiRestResponse.error(ImoocMallExceptionEnum.LOGIN_FIRST);
        }
        boolean adminRole = userService.checkAdminRole(currentUser);
        if (adminRole){
//            if(req.getName()==null ||req.getOrderNum()==null || req.getParentId()==null || req.getType()==null){
//                return ApiRestResponse.error(ImoocMallExceptionEnum.INPUT_NOT_NULL);
//            }
            categoryService.add(req);
            return ApiRestResponse.success();
        }else {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_ADMIN);
        }
    }
    @PostMapping("/admin/category/update")
    @ResponseBody
    public ApiRestResponse updateCategory(HttpSession session, @Valid @RequestBody UpdateCategoryReq req){
        User currentUser = (User) session.getAttribute(Constant.IMOOC_MALL_USER);
        if (currentUser == null){
            return ApiRestResponse.error(ImoocMallExceptionEnum.LOGIN_FIRST);
        }
        boolean adminRole = userService.checkAdminRole(currentUser);
        if (adminRole){
//            if(req.getName()==null ||req.getOrderNum()==null || req.getParentId()==null || req.getType()==null){
//                return ApiRestResponse.error(ImoocMallExceptionEnum.INPUT_NOT_NULL);
//            }

            Category category = new Category();
            BeanUtils.copyProperties(req,category);
            categoryService.updateCategory(category);
            return ApiRestResponse.success();
        }else {
            return ApiRestResponse.error(ImoocMallExceptionEnum.NEED_ADMIN);
        }
    }


    @PostMapping("/admin/category/delete")
    @ResponseBody
    public ApiRestResponse deleteCategory(@RequestParam int id){
        categoryService.delete(id);
        return ApiRestResponse.success();
    }

    @GetMapping("/admin/category/list")
    @ResponseBody
    public ApiRestResponse listCategoryForAdmin(){
      return ApiRestResponse.success( categoryService.listForAdmin());
    }


    @GetMapping("/category/list")
    @ResponseBody
    public ApiRestResponse listCategory(){
        List<CategoryVo> categoryVos = categoryService.listCategory(0);
        return ApiRestResponse.success(categoryVos);
    }

}
