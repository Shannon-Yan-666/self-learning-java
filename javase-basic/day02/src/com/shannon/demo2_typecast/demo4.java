package com.yanxiao.demo2_typecast;

import java.util.Scanner;

/**
 *   目标：了解java中的强制类型转换机制
 *  前提：java语言是强类型语言
 *      不同类型数据不能进行赋值和运算操作
 *  现象：
 *      小的类型1 = 大的类型2  （可能发生小数丢失的风险）
 *  强制类型转换：
 *      小的类型1 = （小的类型）大的变量2 （强制类型转换，能发生小数丢失的风险）
 *
 *  注意：
 *       强制了类型转换，可能发生数据丢失风险
 *       强制了类型转换，可能发生小数丢失风险
 *      【复合赋值运算符，自带强制类型转换】
 */

public class demo4 {

    public static void main(String[] args) {
        //场景1：数据没有丢失场景
        double a = 10;
        int b = (int) a;//发生了强制类型转换
        System.out.println(b);

        //场景2：数据丢失场景
        int c = 8888;
        byte d = (byte) c;//强制类型转换：数据丢失
        System.out.println(d);

        //场景3：小数数据丢失场景
        double s = 8888.88;
        int f = (int) s;
        System.out.println(f);

    }
}
