package com.book.controller;

import com.book.common.ServerResponse;
import com.book.pojo.Booktype;
import com.book.service.IBooktype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ealldy on 2020/7/28.
 */
@Controller("BooktypeController")
@RequestMapping("/booktype/")
public class BooktypeController {

    @Autowired
    private IBooktype iBooktype;

    @RequestMapping("addtype.do")
    @ResponseBody
    public ServerResponse addtype(String typename){
        return iBooktype.addtype(typename);
    }

    @RequestMapping("deltype.do")
    @ResponseBody
    public ServerResponse deltype(Integer typeno){
        return iBooktype.deltype(typeno);
    }

    @RequestMapping("uptype.do")
    @ResponseBody
    public ServerResponse uptype(Integer typeno,String typename){
        return iBooktype.uptype(typeno,typename);
    }

    @RequestMapping("showtype.do")
    @ResponseBody
    public ServerResponse<List<Booktype>> showtype(Integer typeno){
        return iBooktype.showtype();
    }
}
