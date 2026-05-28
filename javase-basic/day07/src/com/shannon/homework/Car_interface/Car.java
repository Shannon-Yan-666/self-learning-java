package com.yanxiao.homework.Car_interface;

/**
 * 汽车：父类
 */
public class Car {
    private String brand;//品牌
    private double price;//价格

    public Car() {
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
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

    //定义方法：run
    public void run(){
        System.out.println("价格："+getPrice()+"元的，"+getBrand()+"车，出发了~");
    };
}
