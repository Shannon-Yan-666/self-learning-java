package com.yanxiao.homework.Animal_Polymorphism;
/**
 * 小狗：子类
 */
public class Dog extends Animal{
    //重写父类eat方法
    @Override
    public void eat() {
        System.out.println("小狗吃骨头~");
    }

    //定义子类独有方法：看家
    public void lookHome(){
        System.out.println("老老实实看家...");
    }

    //调用父类无参、有参构造
    public Dog() {
    }

    public Dog(double weight, String name) {
        super(weight, name);
    }

    //重写toString
    @Override
    public String toString() {
        return super.toString();
    }
}
