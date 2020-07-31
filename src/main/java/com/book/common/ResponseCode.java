package com.book.common;

/**
 * Created by ealldy on 2020/7/28.
 */
public enum ResponseCode {

    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    FAIL(-1,"FAIL");

    private final int status;
    private final String msg;

    ResponseCode(int status,String msg){
        this.status = status;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }
}
