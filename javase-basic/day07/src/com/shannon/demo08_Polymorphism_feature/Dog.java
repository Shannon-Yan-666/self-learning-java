package com.yanxiao.demo08_Polymorphism_feature;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("吃猫粮~");
    }

    public void run() {
        System.out.println("小狗，在村里散步~");
    }
}
