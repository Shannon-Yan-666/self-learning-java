package com.yanxiao.homework;

/**
 * 类型转换
 */

public class homework2 {

    public static void main(String[] args) {
    /*
    练习一
    目标：掌握自动类型转换和强制类型转换
        1. 需求 :练习基本数据类型之间的相互转换
            定义int类型变量,为其赋值为10，将其赋值给double类型，查看结
            果。
            定义byte类型变量，为其赋值100，将其赋值给short类型，查看结
            果。
            定义byte类型变量，为其赋值80，将其赋值给int类型，查看结果。
            定义double类型变量，为其赋值3.66，将其赋值给int类型，查看结
            果。

     */
        int a = 10;
        double b = a;
        System.out.println(b);

        byte c = 100;
        short d = c ;
        System.out.println(d);

        byte e = 80;
        int f = e;
        System.out.println(f);

        double g = 3.66;
        int h = (int)g; //大的类型赋值给小的，需要强转
        System.out.println(h);

    /*
    练习二
    目标：表达式的类型提升，能够说出转化的规则以及注意事项
        1. 需求 :创建一个Java程序，
            1.定义两个byte类型的变量，分别赋值为10和20。使用程序计算
            这两个变量相加的结果，并且使用变量接收运算结果。
            2.定义一个byte类型的变量赋值为10，一个char类型的变量赋
            值为'a',一个float类型的变量赋值为5.2，一个double类型的变量
            赋值为10，使用程序计算这些变量相加的结果，并且使用变量接收运算
            结果。
     */

        byte a1 = 10;
        byte b1 = 20;
        char c1 = 'a';
        float d1 = 5.2f;
        double e1 = 10;

        int sum = a1 + b1;
        System.out.println(sum);

        double result = a1 + c1 + d1 + e1;
        System.out.println(result);
    }
}
