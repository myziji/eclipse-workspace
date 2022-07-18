package com.alibaba.taobao.service;


import com.alibaba.taobao.vo.CartVo;

import java.util.List;

public interface CartService {


    List<CartVo> add(Long userId, int productId, int count);
}
