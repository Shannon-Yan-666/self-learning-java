package com.yanxiao.homework.restaurantOrderManagementSystem_Polymorphism_abstract;

/**
 * 汉堡类：子类
 */
public class Burger extends Dish{
    @Override
    void cook() {
        System.out.println("🍔 正在制作美味的汉堡...");
    }

    public Burger() {
    }

    public Burger(String name) {
        super(name);
    }
}
