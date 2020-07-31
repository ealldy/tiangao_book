package com.book.service;

import com.book.common.ServerResponse;
import com.book.pojo.Booktype;

import java.util.List;

/**
 * Created by ealldy on 2020/7/28.
 */
public interface IBooktype {
    ServerResponse addtype(String name);

    ServerResponse deltype(Integer no);

    ServerResponse uptype(Integer no ,String name);

    ServerResponse<List<Booktype>> showtype();


}
