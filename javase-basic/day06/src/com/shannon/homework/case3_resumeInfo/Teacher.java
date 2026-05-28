package com.yanxiao.homework.case3_resumeInfo;

public class Teacher extends Person{

    public Teacher() {
    }

    public Teacher(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void write() {
        super.info();
        System.out.println("老师授课经历。");
    }
}
