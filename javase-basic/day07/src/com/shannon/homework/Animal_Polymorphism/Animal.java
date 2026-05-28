package com.yanxiao.homework.Animal_Polymorphism;
/**
动物类：抽象父类
 */
public abstract class Animal {
    private String name;//名字
    private double weight;//体重

    //定义抽象方法：eat吃饭
    public abstract void eat();

    //无参构造器：供子类使用
    public Animal() {
    }

    //有参构造器：供子类使用
    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    // get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //重写toString
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

