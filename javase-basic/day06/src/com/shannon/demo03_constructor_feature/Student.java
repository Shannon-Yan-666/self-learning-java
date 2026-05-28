package com.yanxiao.demo03_constructor_feature;

public class Student extends Person{

//    private String name;
//    private int age;
//    private char gender;

    private double score;

    //子类自己的无参构造器（默认继承父类的无参，省略了super.）
    public Student() {
        super();
    }

    //子类自己的有参
    public Student(double score) {
        this.score = score;
    }

    // 继承父类的有参：参数包含父类和子类
    public Student(String name, int age, char gender, double score) {
        super(name, age, gender);
        this.score = score;
    }

    //子类的get方法
    public double getScore() {
        return score;
    }

    //子类的set方法
    public void setScore(double score) {
        this.score = score;
    }
}
