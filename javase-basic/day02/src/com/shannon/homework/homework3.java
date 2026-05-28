package com.yanxiao.homework;

/**
 * 赋值运算符
 */

public class homework3 {
    public static void main(String[] args) {
     /*
    练习一
    目标：掌握拓展的赋值运算的书写格式和执行特点
        1. 需求 :定义一个byte类型的变量，为其赋值为10，输出结果。为其增加
                13.14，再输出结果。再次为其减去5.2，输出结果
     */
        byte a = 10;
        System.out.println(a);
        a += 13.14;
        System.out.println(a);
        a -= 5.2;
        System.out.println(a);


    }
}
