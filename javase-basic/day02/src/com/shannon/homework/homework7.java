package com.yanxiao.homework;

import java.util.Scanner;

/**
 * 方法
 */

public class homework7 {
    public static void main(String[] args) {
        printWelcome();
        System.out.println(calculateArea(10,5));
        greetUser("韩梅梅");

    }
    /*
    练习一
    设计一个名为 printWelcome 的方法。
    功能：该方法不需要接收任何外部数据，执行时只需在控制台
    打印一行固定的欢迎语：“欢迎来到 Java 编程世界！”。
    要求：方法修饰符为 public static，返回类型为 void。
    */

    public static void printWelcome(){
        System.out.println("欢迎来到 Java 编程世界！");
    }

    /*
    练习二
    设计一个名为 calculateArea 的方法。
    功能：该方法接收两个 int 类型的参数，分别代表矩形的
    length（长）和 width（宽）。方法需要计算矩形的面积（长
    × 宽），并将计算结果作为 int 类型返回。
    要求：方法修饰符为 public static，返回类型为 int。
    */
    public static int calculateArea(int length, int width){
        int size = length * width;
        return size;
    }

    /*
    练习三
    设计一个名为 greetUser 的方法。
    功能：该方法接收一个字符串类型的参数 name（代表用户姓
    名）。执行时，在控制台打印：“你好，[name]！祝你今天愉
    快。”（其中 [name] 替换为传入的实际姓名）。
    要求：方法修饰符为 public static，返回类型为 void。
    */
    public static void greetUser(String name){
        System.out.println("你好,"+ name +"!祝你今天愉快。");
    }

}
