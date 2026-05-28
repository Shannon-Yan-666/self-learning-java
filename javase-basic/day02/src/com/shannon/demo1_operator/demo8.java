package com.yanxiao.demo1_operator;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

/**
 * 目标：了解三元运算符的基本使用    Scanner基本使用
 * 符号：
 * 结果 = 条件  ?  值1  :  值2;
 * 结果返回的数据类型，与参数值类型保持一致
 * 执行流程和使用场景：
 * 判断条件是否成立，从两个结果中选择一份（2选1）
 */

public class demo8 {
    public static void main(String[] args) {
        //场景1：判断两个整数中的最大值
        int a = 120;
        int b = 20;

        //返回结果=判断条件？根据判断结果中两个值中选择一个返回
        int max = a > b ? a : b;
        System.out.println("最大值是：" + max);

        //场景2：判断学生考试是否及格
        System.out.println("请录入您本次考试的分数：");
        // Sc + tab键 = 快捷创建键盘扫描工具
        Scanner sc = new Scanner(System.in);
        // 调用方法：ctrl + alt + V =快速生成变量接收当前方法返回的结果
        double score = sc.nextDouble();  //接收小数
//        int i = sc.nextInt();  //接收整数
//        String s = sc.next();  //接收文本

        String result = score >= 60 ? "及格" : "不及格";
        System.out.println("考试结果：" + result);


        //Scanner 基本使用：接收用户键盘录入数据的工具
        // nextDouble(); 小数
        // nextInt();  整数
        // next();  文本

        //1.创建扫描工具
        Scanner sc2 = new Scanner(System.in);
        //2.提示用户从键盘录入
        System.out.println("请录入您的姓名：");
        //3.使用键盘扫描工具接收用户从键盘录入的姓名
        String name = sc2.next();

        System.out.println("请录入您的年龄：");
        int age = sc2.nextInt();

        System.out.println("请录入您的考试分数：");
        double score1 = sc2.nextDouble();

        System.out.println("姓名：" + name);
        System.out.println("年龄:" + age);
        System.out.println("分数:" + score1);
    }
}
