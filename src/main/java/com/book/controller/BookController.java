package com.book.controller;

import com.book.common.ServerResponse;
import com.book.pojo.Book;
import com.book.pojo.Booktype;
import com.book.service.IBook;
import com.book.service.IBooktype;
import com.book.vo.Bookvo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ealldy on 2020/7/28.
 */
@Controller("BookController")
@RequestMapping("/book/")
public class BookController {

    @Autowired
    private IBook iBook;

    @RequestMapping(value = "addbook.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse addbook(Book book){
        return iBook.addbook(book);
    }

    @RequestMapping("delbook.do")
    @ResponseBody
    public ServerResponse delbook(Integer no){
        return iBook.delbook(no);
    }

    @RequestMapping(value = "upbook.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse upbook(Book book){
        return iBook.upbook(book);
    }

    @RequestMapping("showbook.do")
    @ResponseBody
    public ServerResponse<List<Book>> showbook(){
        return iBook.showbook();
    }
}