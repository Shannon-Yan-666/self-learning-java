package com.yanxiao.HomeStudy.demo2;

public class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println(getName()+"，旺旺叫~");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
