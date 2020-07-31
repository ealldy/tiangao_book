package com.book.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Book {
    private Integer no;

    private Integer typeNo;

    private String name;

    private BigDecimal price;

    private Date pubTime;

    private String author;

    private String pubCompany;

    public Book(Integer no, Integer typeNo, String name, BigDecimal price, Date pubTime, String author, String pubCompany) {
        this.no = no;
        this.typeNo = typeNo;
        this.name = name;
        this.price = price;
        this.pubTime = pubTime;
        this.author = author;
        this.pubCompany = pubCompany;
    }

    public Book() {
        super();
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getPubTime() {
        return pubTime;
    }

    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getPubCompany() {
        return pubCompany;
    }

    public void setPubCompany(String pubCompany) {
        this.pubCompany = pubCompany == null ? null : pubCompany.trim();
    }
}