package com.yanxiao.homework;

/**
 * 练习二
 * 目标：能够使用无参+set方法去创建对象，给属性赋值。能够
 * 掌握有参构造去创建对象
 * 1.需求
 * 定义学生类，属性包括姓名和年龄，定义一个成员方法，show（)用于
 * 展示当前学生对象的信息。
 * 在测试类中,要求分别使用空参和有参构造方法创建对象，空参创建的
 * 对象通过setxx赋值，有参创建的对象直接赋值，并通过show方法展示
 * 数据。
 * 程序执行，在控制台输出效果
 * 姓名：张三，年龄：23
 * 姓名：李四，年龄：24
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("姓名：" + name + ", 年龄：" + age );
    }
}
