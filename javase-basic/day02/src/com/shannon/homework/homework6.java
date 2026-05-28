package com.yanxiao.homework;

import java.util.Scanner;

/**
 * 三元运算符、键盘录入
 */

public class homework6 {
    public static void main(String[] args) {
    /*
    练习一
    目标：能够使用三元运算进行数据的判断。能够使用键盘录入的知识点，实现输入数据到程序中
    1. 需求 :键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
     */
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        String s = n % 2 == 0 ? "偶数" : "奇数";
        System.out.println(s);

    /*
        需求 :键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,
        如果成绩小于60输出”不及格”
     */
        System.out.println("请输入学生的分数：");
        int score = sc.nextInt();
        String s1 = score >= 60 ? "及格" : "不及格";
        System.out.println(s1);

    }
}
