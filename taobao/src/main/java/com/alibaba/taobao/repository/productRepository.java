package com.alibaba.taobao.repository;

import com.alibaba.taobao.Dao.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product, Integer> {

    Product findByName (String name);
    Product findByCategoryId(int categoryId);

}
