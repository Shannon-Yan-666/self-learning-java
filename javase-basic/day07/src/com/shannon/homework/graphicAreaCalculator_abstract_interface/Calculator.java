package com.yanxiao.homework.graphicAreaCalculator_abstract_interface;

/**
 * 计算工具类：Calculator
 * 多态模式
 */
public class Calculator {
    public double size(Shape shape) {
        double size = shape.getArea();
        System.out.println("图形面积为："+size);
        return size;
    }





}
