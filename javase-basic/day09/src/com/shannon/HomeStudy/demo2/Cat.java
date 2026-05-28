package com.yanxiao.HomeStudy.demo2;

public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println(getName()+"，喵喵叫~");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
