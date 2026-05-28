package com.yanxiao.demo01_String_API;

import java.util.Scanner;

/**
 * 目标:掌握字符串遍历方法
 * 方法：
 *      一套：
 *          char[] toCharArray()
 *      二套：
 *          char  charAt(int i)
 *          int   length()
 */
public class demo03_api_string_foreach {
    public static void main(String[] args) {
        //需求：遍历字符串中所有字符数据
        String name = "zhangsan";

        //方式一：char[] toCharArray()
        char[] charArray = name.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        System.out.println("===============");
        //方式二：char  charAt(int i ) + int length()
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        //需求：键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字，数字字符出现的次数
        // (不考虑其他字符)
        // 例如：aA63&c2B*4CD1
        // 小写字母：2个
        // 大写字母：4个
        // 数字字母：5个

        //1.定义多个变量count 计数（smallCount/bigCount/numCount)
        int smallCount = 0;  //小写
        int bigCount = 0;  //大写
        int numCount = 0;  //数字
        //2.创建键盘扫描器工具对象
        Scanner sc = new Scanner(System.in);

        //3.提醒用户输入文本数据
        System.out.println("请输入您要处理的文本数据：");

        //4.使用键盘扫描器工具对象，接收用户输入的文本数据
        String userString = sc.next();

        //5.遍历文本字符串，进行统计
        //char c ;
        for (int i = 0; i < userString.length(); i++) {
            char c = userString.charAt(i);
            //6.判断当前字符类型，并计数
            //c >= '0'    c <= '9'
            //c >= 'A'    c <= 'Z'
            //c >= 'a'    c <= 'z'
            if (c >='0' && c<='9') {
                numCount++;
            } else if (c >='A' && c<='Z') {
                bigCount++;
            } else if (c >='a' && c<='z') {
                smallCount++;
            }
        }
        //7.打印统计结果
        System.out.println("大写："+bigCount);
        System.out.println("小写："+smallCount);
        System.out.println("数字："+numCount);
    }
}
