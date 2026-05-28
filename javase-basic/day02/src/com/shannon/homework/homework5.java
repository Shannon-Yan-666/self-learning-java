package com.yanxiao.homework;

import java.util.Scanner;

/**
 * 关系运算符、逻辑运算符
 */
public class homework5 {
    public static void main(String[] args) {
    /*
    练习一
    目标：掌握关系运算符的作用，以及能够使用逻辑运算符连接多个关系表达式
    1. 需求 :模拟用户在某东上搜索手机信息：用户想搜索一台价格是在4000到
        6000之间的手机，现在有一台手机，价格是5000块，使用程序输出当
        前手机是否符合用户的要求
     */
       double price = 5000;
       System.out.println (price >=4000 && price <=6000);

    /*
    练习二
    目标：掌握关系运算符的作用，以及能够使用逻辑运算符连接多个关系表达式
    1. 需求 :已知闰年的规则是：能被4整除同时不能被100整除的是闰年，或者能被
            400整除的也是闰年。键盘录入年份判断是否为闰年，使用程序说明
     */
        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println ((year % 4 == 0 && year % 100 !=0) || year % 400 ==0);
    }
}
