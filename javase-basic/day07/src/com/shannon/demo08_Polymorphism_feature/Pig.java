package com.yanxiao.demo08_Polymorphism_feature;

//猪类-子类：继承父类，重写父类抽象方法
//
public class Pig extends  Animal{

    @Override
    public void eat() {
        System.out.println("猪饲料~");
    }

    //子类独有的方法，不能被父类调用。
    public void sleep() {
        System.out.println("小猪，在睡觉。");
    }
}
