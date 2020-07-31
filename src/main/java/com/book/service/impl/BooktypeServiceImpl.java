package com.book.service.impl;

import com.book.common.ResponseCode;
import com.book.common.ServerResponse;
import com.book.dao.BookMapper;
import com.book.dao.BooktypeMapper;
import com.book.pojo.Booktype;
import com.book.service.IBooktype;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ealldy on 2020/7/28.
 */

@Service("iBooktype")
public class BooktypeServiceImpl implements IBooktype{
    @Autowired
    private BooktypeMapper booktypeMapper;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public ServerResponse addtype(String name){
        if (StringUtils.isNotBlank(name)){
            Booktype booktype = new Booktype();
            booktype.setName(name);
            int resultCount = booktypeMapper.insertSelective(booktype);
            if (resultCount>0){
                return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"新增图书类型成功");
            }
            return ServerResponse.create(ResponseCode.ERROR.getStatus(),"新增图书类型失败");
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书分类名称为空");
    }

    @Override
    public ServerResponse deltype(Integer no) {
        if (no !=null){
            int resultCount = bookMapper.selectBytypeno(no);
            if (resultCount>0){
                return ServerResponse.create(ResponseCode.ERROR.getStatus(),"该分类下有图书,请先删除分类下的图书");
            }
            resultCount = booktypeMapper.deleteByPrimaryKey(no);
            if (resultCount>0){
                return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"删除图书分类成功");
            }
            return ServerResponse.create(ResponseCode.ERROR.getStatus(),"删除图书类型失败");
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书分类名称为空");
    }

    @Override
    public ServerResponse uptype(Integer no, String name) {
        if (no !=null){
            Booktype booktype = booktypeMapper.selectByPrimaryKey(no);
            if (booktype==null){
                return ServerResponse.create(ResponseCode.ERROR.getStatus(),"没有该图书分类");
            }
            booktype.setName(name);
            int resultCount = booktypeMapper.updateByPrimaryKey(booktype);
            if (resultCount>0){
                return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"更新图书分类成功");
            }
            return ServerResponse.create(ResponseCode.ERROR.getStatus(),"更新图书类型失败");
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"请传入图书分类编号");
    }

    @Override
    public ServerResponse<List<Booktype>> showtype() {
        List<Booktype> booktypeList = (List<Booktype>) booktypeMapper.selectAll();
        if (!CollectionUtils.isEmpty(booktypeList)){
            return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"查询图书分类成功",booktypeList);
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"查询图书分类失败");
    }


}
