package com.alibaba.taobao.serviceImpl;

import com.alibaba.taobao.Dao.Product;
import com.alibaba.taobao.Request.AddProductReq;
import com.alibaba.taobao.Request.ProductListReq;
import com.alibaba.taobao.exception.ImoocMallException;
import com.alibaba.taobao.exception.ImoocMallExceptionEnum;
import com.alibaba.taobao.repository.productRepository;
import com.alibaba.taobao.service.CategoryService;
import com.alibaba.taobao.service.ProductService;
import com.alibaba.taobao.vo.CategoryVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    productRepository  productRepository;

    @Autowired
    CategoryService categoryService;


    @Override
    public void add(AddProductReq addProductReq){
        Product product = new Product();
        BeanUtils.copyProperties(addProductReq,product);
        Product productOld = productRepository.findByName(addProductReq.getName());
        if (productOld !=null){
            throw new ImoocMallException(ImoocMallExceptionEnum.NAME_IS_EXIST);
        }
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Product updateProduct){
        Product productOld = productRepository.getById(updateProduct.getId());
        if (productOld != null && ! productOld.getId().equals(updateProduct.getId())){
            throw new ImoocMallException(ImoocMallExceptionEnum.NAME_IS_EXIST);
        }
        productRepository.save(updateProduct);

    }



    @Override
    public void deleteProduct(int id){
        Product product = productRepository.getById(id);
        if (product == null) {
            throw new ImoocMallException(ImoocMallExceptionEnum.DELETE_FAILED);
        }
        productRepository.deleteById(id);
    }
    @Override
    public void updateProductStatus(int[] ids, int sellStatus){
        for (int i = 0;i<ids.length;i++){
            int j =ids[i];
            Product product = productRepository.getById(j);
            if (product ==null){
                throw new ImoocMallException(ImoocMallExceptionEnum.ITEM_NOT_EXIST);
            }
            product.setStatus(sellStatus);
            productRepository.save(product);
        }
    }

    @Override
    public List<Product> adminList() {
        return productRepository.findAll();
    }

    @Override
    public Product ProductDetail(int id) {
        return productRepository.getById(id);
    }


    @Override
    public  List<Product> list(ProductListReq productListReq){
        List<Product> products = new ArrayList<>();
        if (productListReq.getKeyWord() != null){
            products.add(productRepository.findByName(productListReq.getKeyWord()));
        }
        if (productListReq.getCategoryId() != null){
            List<CategoryVo> categoryVoList = categoryService.listCategory(productListReq.getCategoryId());
            ArrayList<Integer> categoryIds = new ArrayList<>();
            getCategoryIds(categoryVoList,categoryIds);
            for (int i = 0; i < categoryIds.size(); i++) {
                Product product = productRepository.findByCategoryId(categoryIds.get(i));
                products.add(product);
            }

        }
        return products;
    }

    private void getCategoryIds(List<CategoryVo> categoryVoList,ArrayList<Integer> categoryIds){

        for (int i = 0; i <categoryVoList.size() ; i++) {
            CategoryVo categoryVo = categoryVoList.get(i);
            if (categoryVo !=null){
                categoryIds.add(categoryVo.getId());
                getCategoryIds(categoryVo.getChildCategory(),categoryIds);
            }
        }
    }




}
