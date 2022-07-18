package com.alibaba.taobao.repository;

import com.alibaba.taobao.Dao.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roleRepository extends JpaRepository<Cart, Long> {
}
