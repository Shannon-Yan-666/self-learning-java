package com.yanxiao.demo3_method_base;

/**
 *
 * 目标：掌握最基础方法的定义和调用
 * 语法：
 *      位置：
 *          在类中定义，类中的任意位置
 *      定义：
 *      public static void 方法名称(){
 *        //方法体，实现相同功能的代码
 *      }
 *      调用：
 *          方法名称();
 */


public class demo9 {
    public static void main(String[] args) {
        // 不能在方法内定义
        // 2.调用方法
        max();

    }
    // 1.定义一个方法：max
    public static void max(){
        int a = 10;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println("最大值："+ max);

    }
}
