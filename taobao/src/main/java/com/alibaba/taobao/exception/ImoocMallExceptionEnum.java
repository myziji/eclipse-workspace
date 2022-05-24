package com.alibaba.taobao.exception;

public enum ImoocMallExceptionEnum {

    NEED_USER_NAME(10001,"USERNAME CAN NOT BE EMPTY"),
    NEED_PASSWORD(10002,"NEED PASSWORD"),
    NEED_TOO_SHORT(10003,"PASSWORD TO SHORT"),
    USERNAME_IS_EXIST(10004,"USERNAME IS EXIST"),
    WRONG_PASSWORD(10004,"USERNAME OR PASSWORD IS WRONG"),
    LOGIN_FIRST(10005,"LOGIN FIRST"),
    NEED_ADMIN(10006,"YOU ARE NOT ADMIN"),
    INPUT_NOT_NULL(10007,"INPUT CAN NOT EMPTY"),
    NAME_IS_EXIST(10008,"NAME IS EXIST"),
    REQUEST_PARAM_ERROR(10008,"PARAM ERROR"),

    DELETE_FAILED(10008,"DELETE FAILED"),
    SYSTEM_ERROR(20000,"SYSTEM_ERROR");



    Integer code;

    String msg;

    ImoocMallExceptionEnum() {
    }

    ImoocMallExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ImoocMallExceptionEnum{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
