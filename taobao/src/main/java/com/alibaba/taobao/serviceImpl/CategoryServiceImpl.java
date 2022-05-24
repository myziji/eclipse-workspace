package com.alibaba.taobao.serviceImpl;

import com.alibaba.taobao.Dao.Category;
import com.alibaba.taobao.Request.AddCategoryReq;
import com.alibaba.taobao.exception.ImoocMallException;
import com.alibaba.taobao.exception.ImoocMallExceptionEnum;
import com.alibaba.taobao.repository.CategoryRepository;
import com.alibaba.taobao.service.CategoryService;
import com.alibaba.taobao.vo.CategoryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    CategoryRepository categoryRepository;


    @Override
    public  void add(AddCategoryReq addCategoryReq) throws ImoocMallException {
        Category category = new Category();
        BeanUtils.copyProperties(addCategoryReq,category);
        System.out.println(category.toString());
        Category categoryOld = categoryRepository.findByName(addCategoryReq.getName());
        if (categoryOld != null){
            throw new ImoocMallException(ImoocMallExceptionEnum.NAME_IS_EXIST);
        }

//        if (category.getName() != null){
//            throw new ImoocMallException(ImoocMallExceptionEnum.NAME_IS_EXIST);
//        }

        categoryRepository.save(category);
    }

    @Override
    public  void  updateCategory(Category updateCategoryReq){
        if (updateCategoryReq.getName() !=null){
            Category categoryOld = categoryRepository.findByName(updateCategoryReq.getName());
            int x = categoryOld.getId();
            int y = updateCategoryReq.getId();
            if (categoryOld !=null  && x != y){
                throw new ImoocMallException(ImoocMallExceptionEnum.NAME_IS_EXIST);
            }
        }
        categoryRepository.save(updateCategoryReq);
    }

    @Override
    public void delete(int id){
        Category category = categoryRepository.getById(id);
        if(category ==null){
            throw new ImoocMallException(ImoocMallExceptionEnum.DELETE_FAILED);
        }
        categoryRepository.delete(category);
    }

    @Override
    public List<Category>  listForAdmin(){
        return categoryRepository.findAll();
    }

    @Override
    public List<CategoryVo>  listCategory(){
        List<CategoryVo> categoryList = new ArrayList<>();
        recursivelyFindCategories(categoryList,0);

        return categoryList;
    }

    private  void recursivelyFindCategories(List<CategoryVo> categoryVoList, int parentId){
        List<Category> categoryList = categoryRepository.getByParentId(parentId);
        if(!CollectionUtils.isEmpty(categoryList)){
            for (int i =0; i<categoryList.size(); i++){
                    Category category = categoryList.get(i);
                    CategoryVo saveCategory =  new CategoryVo();
                    BeanUtils.copyProperties(category,saveCategory);
                categoryVoList.add(saveCategory);
                recursivelyFindCategories(saveCategory.getChildCategory(),saveCategory.getParentId());
            }
        }
    }

}
