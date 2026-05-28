package com.yanxiao.homework.graphicAreaCalculator_abstract_interface;

/**
 * 子类：Rectangle（矩形）
 */
public class Rectangle extends Shape{
    private double width; // 宽
    private double length; // 长

    public Rectangle() {
    }

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //实现：`getArea()` 返回 `length * width`
    @Override
    double getArea() {
        double size = 3.14 * width * length;
        return size;

    }
}
