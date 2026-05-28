package com.yanxiao.homework.Car_interface;

/**
 * 宝马摩托车：子类/实现
 */
public class BMWMotor extends Car implements IGPS{

    @Override
    public void gps() {
        System.out.println(getBrand()+"GPS启动~");
    }

    public BMWMotor() {
    }

    public BMWMotor(String brand, double price) {
        super(brand, price);
    }
}
