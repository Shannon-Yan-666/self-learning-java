package com.yanxiao.demo01_array_define;
/**
 *  目标：掌握数组定义的语法格式
 *  语法：
 *          方式一：推荐使用，更直观
 *                数据类型[] 数组名称;
 *          方式二：
 *                数据类型  数组名称[]；
 *
 *  静态创建语法：
 *          简化版（推荐使用，简洁）：
 *              数据类型[]  数组名称 = {数据1,数据2,数据3, ....};
 *          完整版：
 *              数据类型[]  数组名称 = new 数据类型[] {数据1,数据2,数据3, ....};
 */
public class demo01 {
    public static void main(String[] args) {
        //需求1：定义一个存储多个用户姓名的数组
        String [] names = {"宝强", "乃亮", "羽凡"};
        //需求2：定义一个容器，存储多个用户学生年纪的数组
        int [] ages = {18,19,20};
        //需求3：定义一个容器，存储多个用户考生分数的数组
        double [] scores = {88.5 ,99 ,59.5};
        //需求4：定义一个容器，存储多个员工性别的数组
        char genders [] = new char[]{'女','女','女'};
        //需求5：定义一个容器，存储员工是否单身的数组
        boolean isSingleDog [] = new boolean[]{true,false,true};

        //注意：目前知识定义了数组，并没有创建数据容器，无法操作数据变量名称
//        System.out.println(names);

        //注意：初始化后数据，数组名称中存储的是啥呢？
        //存储的是数据容器在内存空间中的地址 @ （十六进制内存地址）
        System.out.println(names);
        System.out.println(ages);
        System.out.println(scores);
        System.out.println(genders);
        System.out.println(isSingleDog);


    }
}
