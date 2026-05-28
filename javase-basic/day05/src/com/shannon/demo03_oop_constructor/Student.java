package com.yanxiao.demo03_oop_constructor;

public class Student {
    String name;
    int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printlt(){
        System.out.println(name + age);
    }
}


