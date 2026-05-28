package com.yanxiao.demo3_Outer_Inner;

/**
 * 目标：了解内部类的定义和使用
 * 成员内部定义语法：
 *      class Outer{
 *           class Inner{
 *
 *           }
 *      }
 * 成员内部类的使用语法：
 *      1.创建外部类对象
 *      Outer o = new Outer();
 *      2.操作内部类
 *      Outer.Inner i = o. new Inner();
 *      //整合
 *      Outer.Inner i = new Outer() . new Inner();
 *
 *  成员内部类访问特点：
 *      内部可以访问外部的所有成员
 *      外部如果想访问内部的成员，需要创建内部类对象进行访问
 *
 *  静态内部定义语法：
 *           class Outer{
 *          static  class Inner{
 *
 *             }
 *       }
 * 静态内部类的使用语法：
 *      Outer.Inner i = new Outer.Inner();
 *
 *  静态内部类访问特点：
 *      内部只能访问外部的静态成员
 *      外部需要访问内部，需要创建对象访问
 *
 *  局部内部类（鸡肋语法）
 *
 *
 * 封装性更好，了解即可
 */
public class demo03 {
    public static void main(String[] args) {

        //访问类成员：
        //1.创建外部类对象
        Outer outer = new Outer();

        //2.操作内部类：类创建对象， new +内部类
        Outer.Inner i1 = outer.new Inner();

        //整合
        Outer.Inner i2 = new Outer().new Inner();

        i2.test();
    }
}
