package com.yanxiao.demo1_operator;

/**
 *
 * 目标：掌握算数运算符的基本使用
 * 符号：
 *      + - * / %
 * 作用：
 *      实现数据进行四则运算
 * 注意：
 *      整数相除会丢失小数
 *      方案1：修改数据类型为浮点数，让小数类型的数据参与运算
 *      方案2：可以乘以1.0
 *
 */

public class demo1 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 4;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(1.0 * num1 / num2);  //2个整数相除会丢失小数：乘以1.0/修改数据类型为浮点型
        System.out.println(num1 % num2);


        //需求：将数字123拆分出个位、十位、百位后，打印在控制台
        //公式：
                //个位 = num / 1     % 10;
                //十位 = num / 10    % 10;
                //百位 = num / 100   % 10;
                //千位 = num / 1000  % 10;


        //1.定义变量num3，存储待处理的数据123
        int num3 = 123;

        //2.使用算数运算符，计算出当前数据的每一个数据值
        int ge = num3 / 1 % 10;
        int shi = num3 / 10 % 10;
        int bai = num3 / 100 % 10;

        //3.打印计算结果: 快捷方式 变狼名.sout 快速输入打印
        System.out.println("整数"+ num3 +"的个位是：" + ge);
        System.out.println("整数"+ num3 +"的十位是：" + shi);
        System.out.println("整数"+ num3 +"的百位是：" + bai);
    }

}
