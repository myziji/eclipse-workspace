package com.alibaba.taobao.Request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


public class updateProductReq {

    @NotNull(message = "id can not be null")
    private int Id;

    private String name;

    private String image;

    private String detail;


    private Integer categoryId;

    @Min(value = 1, message =  "price can not be lower than 1")
    private int price;

    @Max(value = 10000, message =  "stock can not be higher than 10000")
    private int stock;

    private int status;

    public updateProductReq() {
    }


    public updateProductReq(int id, String name, String image, String detail, Integer categoryId, int price, int stock, int status) {
        Id = id;
        this.name = name;
        this.image = image;
        this.detail = detail;
        this.categoryId = categoryId;
        this.price = price;
        this.stock = stock;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
