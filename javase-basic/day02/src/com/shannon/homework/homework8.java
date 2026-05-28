package com.yanxiao.homework;

import java.util.Scanner;

/**
 * 拓展部分
 */
public class homework8 {
    public static void main(String[] args) {
    /*
    练习一
    目标：掌握键盘录入的知识点。掌握数据交换的流程
    需求：小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8
        可通过键盘录入），要求编写代码交换小明手中的牌
    思路分析：1.创建Scanner对象
            2.录入第一个数据赋值给变量left
            3.录入第二个数据赋值给变量right
            4.定义一个临时变量temp,保存left的值
            5.将right的值赋值给left
            6.将临时变量temp的值赋值给right
            7.按格式打印left和rigth中的值
     */
        System.out.println("请输入左手的点数：");
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        System.out.println("左手初始点数"+ left);

        System.out.println("请输入右手的点数：");
        Scanner sc2 = new Scanner(System.in);
        int right = sc2.nextInt();
        System.out.println("右手初始点数：" + right);

        int temp = 0;
        temp = left;
        left = right;
        right = temp;

        System.out.println("右手交换后，点数为:"+ right);
        System.out.println("左手交换后，点数为：:"+ left);
    }
}
