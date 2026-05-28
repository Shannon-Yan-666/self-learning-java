package com.yanxiao.demo1_oop_class_object;

/**
 *  学生类：
 *          学生的图纸，描述学生的特征[属性]和功能[方法]
 *  类的组成：
 *          属性：成员变量，位置在类中方法外
 *                 描述当前对象的特征
 *
 *          行为：成员方法，不需要static修饰
 *                  描述当前对象的功能
 *  创建对象：
 *          类名称 对象变量/名称 = new 类名();
 *  操作对象：
 *          对象名称.成员变量
 *          对象名称.成员方法
 *
 */
public  class Student {
    // 成员变量
    String name;
    int age;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 成员方法
    public void study(){

    }

    public void eat(){

    }
}
