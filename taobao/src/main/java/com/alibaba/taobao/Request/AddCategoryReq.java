package com.alibaba.taobao.Request;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddCategoryReq {

    @Size(min = 2,max = 5)
    @NotNull(message =  "name can not null")
    private String name;

    @NotNull(message =  "type can not null")
    @Max(3)
    private Integer type;

    @NotNull(message =  "parentId can not null")
    private Integer parentId;

    @NotNull(message =  "orderNum can not null")
    private Integer orderNum;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public AddCategoryReq() {
    }

    public AddCategoryReq(String name, Integer type, Integer parentId, Integer orderNum) {
        this.name = name;
        this.type = type;
        this.parentId = parentId;
        this.orderNum = orderNum;
    }
}
