package com.yanxiao.demo05_array_exception;

/**
 *  目标：了解数组常见异常
 *  异常1：数组索引越界异常
 *          通过不存在得索引去访问数据
 *
 */
public class demo05 {
    public static void main(String[] args) {
        // 场景1：数组索引越界异常
        // 存储多部电影的数组
        String [] names = {"漫威","上海堡垒","749局","星际穿越","盗梦空间"};
//                           0        1        2       3         4

//        异常：索引越界 ArrayIndexOutofBoundsException:Index 5 out of bounds for length 5
//        System.out.println(names[5]);
//        for (int i = 0; i < 5; i++) {
//
//        }

        // 场景2：空指针异常 NullPointerException: Cannot load from object array because "names" is null
//        names = null;   切断了变量和堆内存的连接，变量不存储任何数据的地址
//        System.out.println(names[0]);  NullPointerException
    }
}
