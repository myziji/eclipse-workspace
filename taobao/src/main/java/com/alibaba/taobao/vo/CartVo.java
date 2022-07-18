package com.alibaba.taobao.vo;

public class CartVo {

    private int id;

    private int productId;

    private int userId;

    private int quantity;

    private int selected;

    private int price;

    private int totalPrice;

    private String productName;

    private String productImage;


    public CartVo() {
    }

    public CartVo(int id, int productId, int userId, int quantity, int selected, int price, int totalPrice, String productName, String productImage) {
        this.id = id;
        this.productId = productId;
        this.userId = userId;
        this.quantity = quantity;
        this.selected = selected;
        this.price = price;
        this.totalPrice = totalPrice;
        this.productName = productName;
        this.productImage = productImage;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "CartVo{" +
                "id=" + id +
                ", productId=" + productId +
                ", userId=" + userId +
                ", quantity=" + quantity +
                ", selected=" + selected +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                ", productName='" + productName + '\'' +
                ", productImage='" + productImage + '\'' +
                '}';
    }
}
