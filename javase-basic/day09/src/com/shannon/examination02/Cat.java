package com.yanxiao.examination02;

public class Cat extends Animal{
    @Override
    void eat() {
        System.out.println("Cat 吃鱼");
    }

    //Cat特有方法
    public  void catchMouse(){
        System.out.println("Cat，catch mouse");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
