package com.yanxiao.homework.graphicAreaCalculator_abstract_interface;

/**
 * 子类：Circle（圆形）
 */
public class Circle extends Shape{
    private double radius; //半径

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //实现：`getArea()` 返回 `3.14 * radius * radius`
    @Override
    double getArea() {
        double size = 3.14 * radius * radius;
        return size;
    }
}
