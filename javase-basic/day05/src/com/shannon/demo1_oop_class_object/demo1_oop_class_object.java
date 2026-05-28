package com.yanxiao.demo1_oop_class_object;

/**
 *  测试类：意义，存放main方法
 *
 */
public class demo1_oop_class_object {

    public static void main(String[] args) {
        //需求：存储学生信息，让学生去学习和吃饭
        //面向对象：自己设计（class图纸）

        //1.创建对象
        Student s1 = new Student();

        //修改成员变量
        s1.name = "Film";
        s1.age = 18;

        //2.访问成员变量
        System.out.println("学生姓名：" + s1.age);
        System.out.println("学生年龄：" + s1.name);

        //3.访问成员方法
        s1.eat();
        s1.study();

    }


}
