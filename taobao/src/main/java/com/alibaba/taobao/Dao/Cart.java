package com.alibaba.taobao.Dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "maill_cart")
public class Cart {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;


    @Column(name = "product_id")
    private int productId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "selected")
    private int selected;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date update_time;


    public Cart() {
    }

    public Cart(int productId, Long userId, int quantity, int selected, Date createTime, Date update_time) {
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
        this.selected = selected;
        this.createTime = createTime;
        this.update_time = update_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
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

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", productId=" + productId +
                ", userId=" + userId +
                ", quantity=" + quantity +
                ", selected=" + selected +
                ", createTime=" + createTime +
                ", update_time=" + update_time +
                '}';
    }
}
