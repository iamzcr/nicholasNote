package com.zcr.date_;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        //显示当前时间 第一代日期
        Date d = new Date();
        System.out.println(new Date(956454));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E");
        System.out.println(sdf.format(d));
        //第二代日期，calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.MONTH) + 1);//月份从0开始计算，所以要加1

        //第三代日期类
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getYear());
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化后的日期
        System.out.println(f.format(ldt));

        //当前时间戳
        Instant ins = Instant.now();

        System.out.println(Date.from(ins));

        System.out.println(d.toInstant());

    }
}
