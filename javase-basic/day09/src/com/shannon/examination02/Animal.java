package com.yanxiao.examination02;

public abstract class Animal {
    private String name;//姓名
    private int age;//年龄

    abstract void eat();//定义抽象eat方法

    //无参构造器
    public Animal() {
    }

    //有参构造器
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
