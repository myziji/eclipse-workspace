package com.alibaba.taobao.repository;

import com.alibaba.taobao.Dao.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface orderRepository extends JpaRepository<Order, Long> {
}
