package com.alibaba.taobao.Dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="image")
    private String image;

    @Column(name="detail")
    private String detail;

    @Column(name="category_id")
    private Integer categoryId;

    @Column(name="price")
    private int price;

    @Column(name="stock")
    private int stock;

    @Column(name="status")
    private int status;

    @Column(name="create_time")
    private Date createTime;

    @Column(name="update_time")
    private Date update_time;
    public Product() {
    }

    public Product(String name, String image, String detail, Integer categoryId, int price, int stock, int status, Date createTime, Date update_time) {

        this.name = name;
        this.image = image;
        this.detail = detail;
        this.categoryId = categoryId;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.createTime = createTime;
        this.update_time = update_time;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }


}
