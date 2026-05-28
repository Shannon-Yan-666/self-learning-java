package com.yanxiao.demo03_constructor_feature;

public class Test {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("张三",18,'女',8888.8);
        System.out.println(t1.getName()+t1.getAge()+t1.getGender()+t1.getSalary());

        Student s1 = new Student("李四",18,'女',88.8);
        System.out.println(s1.getName()+s1.getAge()+s1.getGender()+s1.getScore());

    }
}
