package com.yanxiao.demo05_oop_static_field;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher.company = "北音";

        Teacher t1 = new Teacher("张三",40);
        t1.company = "南音";//不推荐使用对象访问
    }
}
