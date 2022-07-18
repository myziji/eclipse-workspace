package com.alibaba.taobao.Request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class ProductListReq {
    private String keyWord;
    private Integer categoryId;

    private String orderBy;

    public ProductListReq() {
    }

    public ProductListReq(String keyWord, Integer categoryId, String orderBy) {
        this.keyWord = keyWord;
        this.categoryId = categoryId;
        this.orderBy = orderBy;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String toString() {
        return "ProductListReq{" +
                "keyWord='" + keyWord + '\'' +
                ", categoryId=" + categoryId +
                ", orderBy='" + orderBy + '\'' +
                '}';
    }
}
