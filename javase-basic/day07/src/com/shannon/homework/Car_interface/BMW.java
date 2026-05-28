package com.yanxiao.homework.Car_interface;

/**
 * 宝马汽车：子类/实现
 *
 */
public class BMW extends Car implements IGPS{

    @Override
    public void gps() {
        System.out.println(getBrand()+"GPS启动~");
    }

    public BMW() {
    }

    public BMW(String brand, double price) {
        super(brand, price);
    }
}
