package com.yanxiao.homework;

/**
 * 练习四
 * 目标：能够使用无参+set方法去创建对象，给属性赋值。能够
 * 掌握有参构造去创建对象
 * 1.需求
 * 定义手机类，手机有品牌（brand）,价格（price)和颜色（color)三个
 * 属性，有打电话call（)和sendMessage（）两个功能。
 * 定义测试类，在测试中请定义出手机类，类中要有空参构造创建对象，
 * 通过set方法去赋值。或者通过有参构造去创建个对象。使用对象分别
 * 调用call（)方法和sendMessage（）方法
 * 程序执行，在控制台输出效果
 * 正在使用价格为3998元黑色的小米手机打电话，
 * 正在使用价格为3998元黑色的小米手机发短信.
 */
public class Phone {
    private String brand;
    private double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(){
        System.out.println("正在使用价格为："+price + "元，" + color + "的" + brand + "手机:打电话");
    }

    public void sendMessage(){
        System.out.println("正在使用价格为："+price + "元，" + color + "的" + brand + "手机:发短信");
    }
}
