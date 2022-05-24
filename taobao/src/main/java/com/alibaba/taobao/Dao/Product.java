package com.alibaba.taobao.Dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="products")
public class Product {

    @Id
    @Column(name="product_id")
    private Long id;

    @Column(name="product_name")
    private String name;

    @Column(name="product_color")
    private String color;

    @Column(name="product_price")
    private Double price;

    @Column(name="product_number")
    private Long number;

    @Column(name="product_info")
    private String info;

    public Product() {
    }

    public Product(Long id, String name, String color, Double price, Long number, String info) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.number = number;
        this.info = info;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", info='" + info + '\'' +
                '}';
    }
}
