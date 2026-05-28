package com.yanxiao.homework;

/**
 * 数据类型
 */

public class homework1 {
    public static void main(String[] args) {
    /*
    练习一
    目标：掌握八种基本数据类型的基本定义
        1. 需求 :在IDEA中写一个Java程序，能够分别:
                定义一个整数变量，为其赋值为10
                一个float类型的变量，为其赋值13.14
                定义一个long类型的的数据，为其赋值123456789123456
                一个布尔类型变量，为其赋值为false
                一个字符变量，为其赋值'我'
                最后把这些变量的结果输出来。
     */

        int a = 10;
        float b = 13.14f;
        long c = 123456789123456L;
        boolean d = false;
        char e = '我';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    /*
    练习二
    目标：掌握八种基本数据类型的基本定义
        1. 需求 :要存储一个学员的姓名(杨密)、性别(女)、年龄(22)、分数(88.5)，
           请选择对应的类型去定义变量，把这些信息定义为变量
             tips: 可以使用下面的名称
             姓名: name
             性别: gender
             年龄: age
             分数: score
     */

        String name = "杨密";
        char gender = '女';
        int age = 22;
        double score = 88.5;

        System.out.println("----学生信息----");
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(score);
    }


}
