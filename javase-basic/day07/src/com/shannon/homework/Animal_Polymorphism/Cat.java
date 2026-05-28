package com.yanxiao.homework.Animal_Polymorphism;
/**
 * 小猫：子类
 */
public class Cat extends Animal{

    //重写父类的eat方法
    @Override
    public void eat() {
        System.out.println("小猫吃鱼~");
    }

    //定义子类独有方法：抓老鼠
    public void catchMouse(){
        System.out.println("努力抓老鼠...");
    }

    //调用父类无参、有参构造器
    public Cat() {
    }

    public Cat(double weight, String name) {
        super(weight, name);
    }

    //重写toString
    @Override
    public String toString() {
        return super.toString();
    }
}
