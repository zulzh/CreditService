package com.ryzlz.microcredit.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * 获取当前系统时间
     *
     * @return：字符串类型
     */
    public static String getCurrentTime(String YMDHMS) {
        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat(YMDHMS);
        String currentTime = df.format(day);
        return currentTime;
    }


    /**
     * 获取当前系统前一天的时间
     *
     * @return
     */
    public static String getYesterdayTime(String YMDHMS) {
        SimpleDateFormat df = new SimpleDateFormat(YMDHMS);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        date = calendar.getTime();
        return df.format(date);
    }

    /**
     * 获取系统一周前的时间
     * @return
     */
    public static String getlastWeakTime(String YMDHMS) {
        SimpleDateFormat df = new SimpleDateFormat(YMDHMS);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.WEEK_OF_YEAR, -1);
        date = calendar.getTime();
        return df.format(date);
    }

    /**
     * 获取系统一月前的时间
     * @return
     */
    public static String getlastMonthTime(String YMDHMS) {
        SimpleDateFormat df = new SimpleDateFormat(YMDHMS);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -1);
        date = calendar.getTime();
        return df.format(date);
    }

    /**
     * 获取当前系统时间前一年的时间
     * @return
     */
    public static String getLastYear(String YMDHMS) {
        SimpleDateFormat format = new SimpleDateFormat(YMDHMS);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -1);
        date = calendar.getTime();
        return format.format(date);
    }
}
