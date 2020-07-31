package com.book.pojo;

public class Booktype {
    private Integer no;

    private String name;

    public Booktype(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

    public Booktype() {
        super();
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}