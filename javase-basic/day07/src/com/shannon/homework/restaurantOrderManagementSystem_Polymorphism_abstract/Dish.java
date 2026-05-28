package com.yanxiao.homework.restaurantOrderManagementSystem_Polymorphism_abstract;

/**
 * 菜肴：抽象父类
 */
public abstract class Dish {
    private String name;//菜名

    //抽象方法，烹饪
    abstract void cook();

    public Dish() {
    }

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
