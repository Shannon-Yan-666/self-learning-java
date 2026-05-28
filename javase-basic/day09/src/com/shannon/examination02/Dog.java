package com.yanxiao.examination02;

public class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog，吃骨头");
    }

    //Dog特有方法
    public void lookHome(){
        System.out.println("Dog， look home");
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
