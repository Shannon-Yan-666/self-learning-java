package com.yanxiao.homework.restaurantOrderManagementSystem_Polymorphism_abstract;

/**
 * 意大利面类：子类
 */
public class Pasta extends Dish{
    @Override
    void cook() {
        System.out.println("🍜 正在煮意面...");
    }

    public Pasta() {
    }

    public Pasta(String name) {
        super(name);
    }
}
