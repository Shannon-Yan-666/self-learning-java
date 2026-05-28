package com.yanxiao.homework.case5_petShopManageSystem;

//小猫类
public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String breed, String name, String color, int age) {
        super(breed, name, color, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void catchMouse() {
        System.out.println(getColor()+"色的，"+getName()+"小猫...它的技能是抓老鼠。");
    }

    @Override
    public void eat() {
        System.out.println("...它正在吃小黄鱼");
    }
}
