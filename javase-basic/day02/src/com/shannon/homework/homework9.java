package com.yanxiao.homework;

import java.util.Scanner;

/**
 *拓展部分
 */
public class homework9 {
    public static void main(String[] args) {
    /*
    练习二
    目标：掌握键盘录入的使用，掌握获取数字每个位置上的值
    需求：商场推出幸运抽奖活动，抽奖规则如下：
         (1)键盘录入四位数字(1000-9999的数字),作为顾客的会员卡号
         (2)该会员卡号(键盘录入的四位数字)各位数字之和大于20，则为幸运客户

     思路：
        1.创建键盘录入对象
        2.定义int类型的变量（保存会员卡号），并通过键盘录入给变量赋值
        3.使用/和%求出个位、十位、百位、千位上的数字
        4.定义int类型的变量sum
        5.计算各位数字之和并复制给sum
        6.按照格式打印
         (1)打印各位数字之和
         (2)打印是或者不是幸运客户(是或者不是，可以通过三元运算符判断sum的值获取是或者不是)
     */

        System.out.println("请录入四位数字（1000-9999）：");
        Scanner sc = new Scanner(System.in);
        int card = sc.nextInt();

        int ge = card / 1 % 10;
        int shi = card / 10 % 10;
        int bai = card / 100 % 10;
        int qian = card / 1000 % 10;

        int sum = ge + shi +bai +qian;
        System.out.println("数字之和为：" + sum);
        System.out.println(sum > 20 ? "幸运客户" : "一般客户");
    }
}
