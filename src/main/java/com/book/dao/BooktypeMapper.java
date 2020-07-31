package com.book.dao;

import com.book.pojo.Booktype;

import java.util.List;

public interface BooktypeMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(Booktype record);

    int insertSelective(Booktype record);

    Booktype selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(Booktype record);

    int updateByPrimaryKey(Booktype record);

    List<Booktype> selectAll();
}