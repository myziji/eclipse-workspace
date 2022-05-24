package com.alibaba.taobao.repository;

import com.alibaba.taobao.Dao.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {



    Category findByName(String name);

    List<Category> getByParentId (int parentId);

}
