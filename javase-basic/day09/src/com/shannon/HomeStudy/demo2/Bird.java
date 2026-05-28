package com.yanxiao.HomeStudy.demo2;

public class Bird extends Animal{
    @Override
    void makeSound() {
        System.out.println(getName()+"，叽叽喳喳叫~");
    }

    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
