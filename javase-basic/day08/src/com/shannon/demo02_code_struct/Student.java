package com.yanxiao.demo2_code_struct;
//学生类
public class Student {

    //类的组成部分：成员变量
    private String name;

    //无参
    public Student() {
        System.out.println("Student 无参，执行了");
    }

    //有参
    public Student(String name) {
        this.name = name;
        System.out.println("Student 有参，执行了");
    }

    //类的组成部分：成员方法
    public void show() {
        System.out.println("show");

        {
            int age = 10;
            //可以在方法内，提前释放变量的空间/资源
        //局部代码块
        }
    }

    //重点掌握
    static {
        //类的组成部分：静态代码块
        System.out.println("静态代码块，执行了");
    }

    {
        //类的组成部分：构造代码块
        System.out.println("构造代码块，执行了");
    }

}
