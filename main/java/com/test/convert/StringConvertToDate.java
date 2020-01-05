package com.test.convert;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lg
 * @version 1.0
 * @since 1.8
 */
public class StringConvertToDate implements Converter<String, Date>{

    @Override
    public Date convert(String s) {

        try {
            return  new SimpleDateFormat("yyyy-MM-dd").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
