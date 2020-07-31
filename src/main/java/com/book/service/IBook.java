package com.book.service;

import com.book.common.ServerResponse;
import com.book.pojo.Book;

import java.util.List;

/**
 * Created by ealldy on 2020/7/28.
 */
public interface IBook {
    ServerResponse addbook(Book book);

    ServerResponse delbook(Integer no);

    ServerResponse upbook(Book book);

    ServerResponse<List<Book>> showbook();
}
