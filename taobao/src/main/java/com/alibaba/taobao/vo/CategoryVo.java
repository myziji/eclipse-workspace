package com.alibaba.taobao.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CategoryVo implements Serializable {



    private  int id;


    private  String name;

    private  int type;

    private  int parentId;

    private  int orderNum;

    private Date createTime;

    private Date updateTime;

    private List<CategoryVo> childCategory = new ArrayList<>();

    public List<CategoryVo> getChildCategory() {
        return childCategory;
    }

    public void setChildCategory(List<CategoryVo> childCategory) {
        this.childCategory = childCategory;
    }

    public CategoryVo() {
    }

    public CategoryVo(int id, String name, int type, int parentId, int orderNum, Date createTime, Date updateTime, List<CategoryVo> childCategory) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.parentId = parentId;
        this.orderNum = orderNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.childCategory = childCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
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
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", parentId=" + parentId +
                ", orderNum=" + orderNum +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
