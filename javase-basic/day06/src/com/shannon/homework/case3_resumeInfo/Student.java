package com.yanxiao.homework.case3_resumeInfo;

public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void write() {
        super.info();
        System.out.println("学生上学经历。");
    }
}
