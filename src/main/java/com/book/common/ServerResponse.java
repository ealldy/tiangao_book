package com.book.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * Created by ealldy on 2020/7/28.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable {
    private int status;
    private String msg;
    private T data;

    private ServerResponse(int status) {
        this.status = status;
    }

    private ServerResponse(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(int status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ServerResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    public void removeData() {
        this.data = null;
    }

    @JsonIgnore
    public boolean isSuccess(){return this.status == ResponseCode.SUCCESS.getStatus(); }
    @JsonIgnore
    public boolean isError(){return this.status == ResponseCode.ERROR.getStatus(); }
    @JsonIgnore
    public boolean isFail(){return this.status == ResponseCode.FAIL.getStatus(); }

    public static <T> ServerResponse<T> create(int status){
        return new ServerResponse<T>(status);
    }
    public static <T> ServerResponse<T> create(int status, String msg){
        return new ServerResponse<T>(status,msg);
    }
    public static <T> ServerResponse<T> create(int status,String msg,T data){
        return new ServerResponse<T>(status,msg,data);
    }

}