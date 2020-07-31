package com.book.common;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalDate;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ealldy on 2020/7/28.
 */
public class DateConverter implements Converter<String, Date> {
    private static final SimpleDateFormat dateF=new SimpleDateFormat("yyyy-MM-dd hh:mm");
    /**
     * Converter为一个接口。该接口有很多实现类
     * 比如 StringToBooleanConverter   string自动转化为Boolean
     * */
    @Override
    public Date convert(String s) {
        Date date=null;
        if(StringUtils.isNotEmpty(s)){
            try {
                date=dateF.parse(s);
            } catch (ParseException e) {
                new Throwable("字符串转换时间异常");
            }
        }
        return date;
    }
}
