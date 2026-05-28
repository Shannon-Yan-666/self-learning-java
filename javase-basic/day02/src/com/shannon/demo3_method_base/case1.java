package com.yanxiao.demo3_method_base;

public class case1 {
    public static void main(String[] args) {
        // 快捷键：变量接收 ctrl + alt + V
        double sum = sum(1.5,2.3);
        System.out.println("两数之和为：" + sum);

        int min = min(3,4,2);
        System.out.println("最小值为：" + min);

        println("film",25,165.5,'女');
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int min(int a, int b, int c) {
        int min = a;
        if (a > b) {
            min = b;
        }
        if (b > c) {
            min = c;
        }
        return min;
    }

    public static void println(String name,int age,double height,char gender) {
        System.out.println("姓名：" + name + ",年龄：" + age + ",身高：" + height + ",性别：" + gender);
    }
}

