package com.yanxiao.demo01_String_API;

/**
 *  目标：掌握字符串String常用方法
 *  方法：字符串比较
 *       equals     内容比较
 *       equalsIgnoreCase   忽略大小写的内容比较
 *
 *  用户登录案例
 */
public class demo01_api_string_equals {
    public static void main(String[] args) {
        //需求：比较字符串中数据是否相同
        String s1 = "zhangsan";
        String s2 = "李四";
        String s3 = "ZhAnGSaN";

        //比较s1和s2数据是否相同
        System.out.println(s1.equals(s2));

        // 快捷键 .if 进行判断
        if (s1.equals(s3)) {
            System.out.println("内容相同");
        }else {
            System.out.println("内容不同");
        }

        //忽略大小写比较
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}
