package com.book.dao;

import com.book.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer no);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer no);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    int selectBytypeno(@Param("typeno") Integer no);

    List<Book> selectAll();
}