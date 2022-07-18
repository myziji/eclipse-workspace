package com.alibaba.taobao.Request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;


public class AddProductReq {

    @NotNull(message =  "name can not be null")
    private String name;
    @NotNull(message =  "image can not be null")
    private String image;

    private String detail;

    @NotNull(message =  "categoryId can not be null")
    private Integer categoryId;

    @NotNull(message =  "price can not be null")
    @Min(value = 1, message =  "price can not be lower than 1")
    private int price;

    @Max(value = 10000, message =  "stock can not be higher than 10000")
    @NotNull(message =  "stock can not be null")
    private int stock;

    @NotNull(message =  "status can not be null")
    private int status;

    public AddProductReq() {
    }

    public AddProductReq(String name, String image, String detail, Integer categoryId, int price, int stock, int status) {
        this.name = name;
        this.image = image;
        this.detail = detail;
        this.categoryId = categoryId;
        this.price = price;
        this.stock = stock;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
