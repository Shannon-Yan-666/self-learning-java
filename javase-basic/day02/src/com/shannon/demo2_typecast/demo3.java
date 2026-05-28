package com.yanxiao.demo2_typecast;

/**
 * 目标：了解java中的隐式类型转换机制
 * 前提：java语言是强类型语言
 *      不同类型数据不能进行赋值和运算操作
 * 自动类型转换：
 *      类型1 = 类型2  （java进行自动类型转换）
 *      注意： 将小的类型的数据，赋值给大的类型变量
 *          byte--->short--->int--->long--->float---->double
 *                  char--->int--->long--->float---->double
 *
 *      类型1 = 类型1 + 类型2  （java进行自动类型转换）
 *      注意： 将小的赋值给大的
 *             byte/short/char自动转换为int参与运算
 */

public class demo3 {

    public static void main(String[] args) {

        //场景1：赋值场景下的类型转换
        int a = 10;
        double b = a; //发生了自动类型转换：java将int转换为了double后进行了赋值操作
        System.out.println(b);

        //场景2：运算场景下的类型转换
        int c = 10;
        double d = 88.88;
        double e = c + d; //发生了自动类型转换：java将int转换为了double后进行了运算操作
        System.out.println(e);

        //经典笔试题：
        byte b1 = 10;
        char c1 = 'a';
//        char r = b1 + c1 ;

    }
}
