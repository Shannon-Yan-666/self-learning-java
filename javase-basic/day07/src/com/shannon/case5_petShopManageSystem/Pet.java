package com.yanxiao.case5_petShopManageSystem;

/**
 *  目标：掌握抽象类/抽象方法的定义，了解使用场景
 *  1.抽象类：
 *         特殊的父类
 *         内部可以定义抽象方法
 *  2.抽象方法：
 *          没有方法体的方法
 *  3.定义抽象类/方法：
 *          abstract
 *  4.抽象父类和子类的的特点:
 *          子类强制重写父类的所有抽象方法
 *
 */
//宠物类
    //抽象父类
public abstract class Pet {
    private String breed;
    private String name;
    private String color;
    private int age;

    public Pet() {
    }

    public Pet(String breed, String name, String color, int age) {
        this.breed = breed;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    //抽象方法
    public abstract void eat();
}
