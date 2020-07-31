package com.book.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ealldy on 2020/7/28.
 */
public class Bookvo {

    private Integer typeNo;

    private String typename;

    private Integer bookno;

    private String bookname;

    private BigDecimal price;

    private Date pubTime;

    private String author;

    private String pubCompany;

    public Bookvo(Integer typeNo, String typename, Integer bookno, String bookname, BigDecimal price, Date pubTime, String author, String pubCompany) {
        this.typeNo = typeNo;
        this.typename = typename;
        this.bookno = bookno;
        this.bookname = bookname;
        this.price = price;
        this.pubTime = pubTime;
        this.author = author;
        this.pubCompany = pubCompany;
    }

    public Integer getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Integer typeNo) {
        this.typeNo = typeNo;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Integer getBookno() {
        return bookno;
    }

    public void setBookno(Integer bookno) {
        this.bookno = bookno;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
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
        this.author = author;
    }

    public String getPubCompany() {
        return pubCompany;
    }

    public void setPubCompany(String pubCompany) {
        this.pubCompany = pubCompany;
    }
}
