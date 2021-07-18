package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @auther: ${黄}
 * @date: 2021/7/16 23:22
 */
public class Maaa {
    private String str;

    public static void main(String[] args){  //  都能判断存在与否

        //从 String 到 Date
        String ss = "2048-08-09 11:11:11";
        //ParseException
        SimpleDateFormat sdf200 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date dd = null;
        try {
            dd = sdf200.parse(ss);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(dd);
        System.out.println("ffffffffffffffffffddddddd");
    }

}
