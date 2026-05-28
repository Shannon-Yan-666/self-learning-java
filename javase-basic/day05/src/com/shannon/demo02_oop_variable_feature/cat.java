package com.yanxiao.demo02_oop_variable_feature;
/**
    目标：了解成员变量/局部变量区别
    区别：             成员变量               局部变量
    位置：             类中方法外              方法内
    初始值：             有                    无
    存储位置/存活时间：堆内存，和对象同生共死   栈内存，和方法同生共死
    作用范围：           类中{ }               方法内{ }
 */

public class cat {
    String name;//成员变量

    public void catchMouse(String name){
        int age = 2;//局部变量

        System.out.println("小猫的名字（成员变量）："+this.name);//有初始值：nul
        // 当局部变量与成员变量重名：使用this关键字，访问成员变量
        System.out.println("小麦的年龄：（局部变量）" + age +" 岁。");//没有初始值：要先赋值才能使用
    }
}

