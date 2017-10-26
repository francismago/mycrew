package com.arbalest.mycrew.util;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by francis on 10/26/17.
 */
public class DateUtil extends DateUtils {


    public static Integer getYear(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.get(Calendar.YEAR);
    }

    public static void main(String[] args) {
        System.out.println(DateUtil.getYear());
    }
}
