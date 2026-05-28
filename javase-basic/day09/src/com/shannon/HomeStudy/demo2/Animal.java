package com.yanxiao.HomeStudy.demo2;

/**
 *  抽象父类：动物类
 */
public abstract class Animal {
    protected String name;//姓名
    protected int age;//年龄

    abstract void makeSound();//动物叫声

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

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

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
