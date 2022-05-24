package com.alibaba.taobao.Dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id")
    private Long id;
    @Column(name = "order_no")
    private Long orderNo;

    @Column(name = "user_id")
    private int userId;
    @Column(name = "total_price")
    private int totalPrice;
    @Column(name = "receiver_name")
    private String receiverName;

    @Column(name = "receiver_moblie")
    private String receiverMoblie;
    @Column(name = "receiver_address")
    private String receiverAddress;
    @Column(name = "order_status")
    private int orderStatus;
    @Column(name = "postage")
    private String postage;
    @Column(name = "payment_type")
    private int paymentType;
    @Column(name = "delivery_time")
    private Date deliveryTime;
    @Column(name = "pay_time")
    private Date payTime;
    @Column(name = "end_time")
    private Date endTime;
    @Column(name = "create_time")
    private Date createTime;
    @Column(name = "update_time")
    private Date updateTime;

    public Order() {
    }

    public Order(Long id, Long orderNo, int userId, int totalPrice, String receiverName, String receiverMoblie, String receiverAddress, int orderStatus, String postage, int paymentType, Date deliveryTime, Date payTime, Date endTime, Date createTime, Date updateTime) {
        this.id = id;
        this.orderNo = orderNo;
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.receiverName = receiverName;
        this.receiverMoblie = receiverMoblie;
        this.receiverAddress = receiverAddress;
        this.orderStatus = orderStatus;
        this.postage = postage;
        this.paymentType = paymentType;
        this.deliveryTime = deliveryTime;
        this.payTime = payTime;
        this.endTime = endTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMoblie() {
        return receiverMoblie;
    }

    public void setReceiverMoblie(String receiverMoblie) {
        this.receiverMoblie = receiverMoblie;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPostage() {
        return postage;
    }

    public void setPostage(String postage) {
        this.postage = postage;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo=" + orderNo +
                ", userId=" + userId +
                ", totalPrice=" + totalPrice +
                ", receiverName='" + receiverName + '\'' +
                ", receiverMoblie='" + receiverMoblie + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", orderStatus=" + orderStatus +
                ", postage='" + postage + '\'' +
                ", paymentType=" + paymentType +
                ", deliveryTime=" + deliveryTime +
                ", payTime=" + payTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
