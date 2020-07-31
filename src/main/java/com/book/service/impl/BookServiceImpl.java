package com.book.service.impl;

import com.book.common.ResponseCode;
import com.book.common.ServerResponse;
import com.book.dao.BookMapper;
import com.book.dao.BooktypeMapper;
import com.book.pojo.Book;
import com.book.pojo.Booktype;
import com.book.service.IBook;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ealldy on 2020/7/28.
 */
@Service("iBook")
public class BookServiceImpl implements IBook {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BooktypeMapper booktypeMapper;

    @Override
    public ServerResponse addbook(Book book) {
        if (book.getName()==null){
            return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书名称不能为空");
        }
        if (book.getTypeNo()==null){
            return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书分类不能为空");
        }
        Booktype booktype = booktypeMapper.selectByPrimaryKey(book.getTypeNo());
        if (booktype == null){
            return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书分类不存在");
        }
        int relustCount = bookMapper.insertSelective(book);
        if (relustCount>0){
            return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"图书新增成功！");
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书新增失败");
    }

    @Override
    public ServerResponse delbook(Integer no) {
        if (no == null){
            return ServerResponse.create(ResponseCode.ERROR.getStatus(),"请传入正确的图书编号");
        }
        int ruseltCount = bookMapper.deleteByPrimaryKey(no);
        if (ruseltCount>0){
            return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"图书删除成功！");
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书删除失败");
    }

    @Override
    public ServerResponse upbook(Book book) {
        int relustCount = bookMapper.updateByPrimaryKeySelective(book);
        if (relustCount>0){
            return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"图书更新成功！");
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"图书更新失败");
    }

    @Override
    public ServerResponse<List<Book>> showbook() {
        List<Book> bookList = (List<Book>) bookMapper.selectAll();
        if (!CollectionUtils.isEmpty(bookList)){
            return ServerResponse.create(ResponseCode.SUCCESS.getStatus(),"查询图书成功",bookList);
        }
        return ServerResponse.create(ResponseCode.ERROR.getStatus(),"查询图书失败");
    }
}
