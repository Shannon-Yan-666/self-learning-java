package com.yanxiao.demo03_oop_constructor;

public class StudentTest {
    public static void main(String[] args) {

        // 无参构造器初始化赋值 对象名.属性
        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 24;

        // 有参构造器初始化 给形参赋值
        Student s1 = new Student("张三",23);

        s2.printlt();
        s1.printlt();
    }
}
