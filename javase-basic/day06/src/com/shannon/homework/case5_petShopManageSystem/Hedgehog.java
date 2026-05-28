package com.yanxiao.homework.case5_petShopManageSystem;

//小刺猬类
public class Hedgehog extends Pet{
    public Hedgehog() {
    }

    public Hedgehog(String breed, String name, String color, int age) {
        super(breed, name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("...它正在吃小虫子。");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void actingCute() {
        System.out.println(getColor()+"色的，"+getName()+"小刺猬...它的技能是卷起身体卖萌。");
    }
}
