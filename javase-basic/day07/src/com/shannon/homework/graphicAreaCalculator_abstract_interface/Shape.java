package com.yanxiao.homework.graphicAreaCalculator_abstract_interface;

/**
 * 抽象父类：Shape（图形）
 */
public abstract class Shape {
    private String color;

    //抽象方法：计算面积
    abstract double getArea();

    //方法：输出颜色
    public void showColor(){
        System.out.println(color);
    }

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
