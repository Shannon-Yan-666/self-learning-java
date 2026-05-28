package com.yanxiao.demo3_method_base;
/**
 *
 *  目标：掌握带参数方法定义的语法格式和调用方式
 *  语法：
 *      public static void 方法名称(数据类型1 变量名称1, 数据类型2 变量名称2...){
 *          // 方法体：多行实现相同功能的代码
 *       }
 *  调用：
 *      方法名称(数据1, 数据2, ...)
 *
 */

public class demo10 {

    public static void main(String[] args) {
    getMax(1,2);
    showInfo("Film",25,100);
    }

    //需求1：定义方法，统计两个数中的最大值
    public static void getMax(int a, int b) {
        int max = a > b ? a : b;
        System.out.println("max is " + max);
    }

    //需求2：定义方法，打印个人信息(name, age, score)
    public static void showInfo(String name, double age, double score){
        System.out.println("name is " + name + " age is " + age + " score is " + score);

    }

}
