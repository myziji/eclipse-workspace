package com.alibaba.taobao.serviceImpl;

import com.alibaba.taobao.Dao.Cart;
import com.alibaba.taobao.Dao.Product;
import com.alibaba.taobao.common.Constant;
import com.alibaba.taobao.exception.ImoocMallException;
import com.alibaba.taobao.exception.ImoocMallExceptionEnum;
import com.alibaba.taobao.repository.CartRepository;
import com.alibaba.taobao.service.CartService;
import com.alibaba.taobao.service.ProductService;
import com.alibaba.taobao.vo.CartVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {


    @Autowired
    ProductService productService;

    @Autowired
    CartRepository cartRepository;

    @Override
    public List<CartVo> add(Long userId, int productId, int count){


        validProduct(productId,count);

        Cart cart = cartRepository.findByUserIdAndProductId(userId,productId);
        if (cart == null){
           Cart shoppingCart = new Cart();
            shoppingCart.setProductId(productId);
            shoppingCart.setUserId(userId);
            shoppingCart.setQuantity(count);
            shoppingCart.setSelected(Constant.CAR_CHECKED);
            cartRepository.save(shoppingCart);
        }else {
            int updateCount =cart.getQuantity();
            Cart shoppingCart = new Cart();
            shoppingCart.setId(cart.getId());
            shoppingCart.setProductId(productId);
            shoppingCart.setUserId(userId);
            shoppingCart.setQuantity(updateCount);
            shoppingCart.setSelected(Constant.CAR_CHECKED);
            cartRepository.save(shoppingCart);

        }

        return null;

    }

    private void validProduct(int productId, int count) {
        Product product = productService.ProductDetail(productId);

        if (product ==null || product.getStatus() == Constant.PRODUCT_NOT_SALE){

            throw new ImoocMallException(ImoocMallExceptionEnum.NOT_SELL);

        }

        if (count>product.getStock()){
            throw new ImoocMallException(ImoocMallExceptionEnum.ITEM_NOT_EMPTY);
        }



    }

}
