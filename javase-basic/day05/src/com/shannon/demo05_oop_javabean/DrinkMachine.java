package com.yanxiao.demo05_oop_javabean;

/**
 * java bean 实体类：饮水机类
 *      1.私有化的成员属性
 *      2.构造方法：无参/有参
 *      3.提供公共的操作私有化属性的：get/set 方法
 *
 */
public class DrinkMachine {
    private String brand;
    private String color;
    private int size;
    private String model;
    private String image;

    public DrinkMachine() {
    }

    public DrinkMachine(String brand, String color, int size, String model, String image) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.model = model;
        this.image = image;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
