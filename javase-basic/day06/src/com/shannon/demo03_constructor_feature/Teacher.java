package com.yanxiao.demo03_constructor_feature;

public class Teacher extends Person{

//    private String name;
//    private int age;
//    private char gender;

    private double salary;

    //子类自己的无参构造器（默认继承父类的无参，省略了super.）
    public Teacher() {
    }

    //子类自己的有参
    public Teacher(double salary) {
        this.salary = salary;
    }

    // 继承父类的有参：参数包含父类和子类
    public Teacher(String name, int age, char gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    //子类的get方法
    public double getSalary() {
        return salary;
    }

    //子类的set方法
    public void setSalary(double salary) {
        this.salary = salary;
    }


}

