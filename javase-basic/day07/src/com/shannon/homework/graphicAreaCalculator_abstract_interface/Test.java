package com.yanxiao.homework.graphicAreaCalculator_abstract_interface;
// 计算工具类，形参不对，写错了。需要写数组
/**
 * ### 作业五：图形面积计算器（选做：  抽象父类   +  多态）
 * **训练目标**：掌握抽象方法与多态计算
 * **需求背景**：开发一个简单的图形计算工具，计算不同图形的面积。
 * **具体要求**：
 *
 * - 父类：Shape（图形）
 *   - 属性：颜色(color)
 *   - 方法：`getArea()`（计算面积，设计为抽象方法）
 *   - 方法：`showColor()`（输出颜色）
 * - 子类：Rectangle（矩形）
 *   - 属性：长(length)、宽(width)
 *   - 实现：`getArea()` 返回 `length * width`
 * - 子类：Circle（圆形）
 *   - 属性：半径(radius)
 *   - 实现：`getArea()` 返回 `3.14 * radius * radius`
 * - 计算工具类：Calculator
 *   - 方法：`double calculateTotalArea(Shape[] shape)`，利用多态，计算任意多个图形的总面积。
 * - **测试**：创建矩形和圆形的对象并设置好属性，分别调用计算工具类的方法计算面积。
 */
public class Test {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.size(new Rectangle("粉色",1.1,2.2));
        c1.size(new Circle("白色",3.3));

        Shape s1 =new Rectangle("粉色",1.1,2.2);
        s1.showColor();
        Shape s2 = new Circle("白色",3.3);
        s2.showColor();
    }
}
