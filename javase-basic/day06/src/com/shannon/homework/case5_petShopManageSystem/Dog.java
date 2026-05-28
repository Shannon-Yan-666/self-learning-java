package com.yanxiao.homework.case5_petShopManageSystem;

//小狗
public class Dog extends Pet{
    public Dog() {
    }

    public Dog(String breed, String name, String color, int age) {
        super(breed, name, color, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void lookHome() {
        System.out.println(getColor()+"色的，"+getName()+"小狗...它的技能是看家护院。");
    }

    @Override
    public void eat() {
        System.out.println("...它正在吃骨头");
    }
}
