package com.alibaba.taobao.repository;

import com.alibaba.taobao.Dao.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Integer> {


    Cart findByUserIdAndProductId (Long userId, int productId);

}
