package com.yanxiao.homework;

/**
 * 练习五
 * 分析以下需求，并用代码实现
 * 训练目标：掌握Java中static的使用，以及理解其在实际开发中的工
 * 具类的应用
 * 需求背景：日常工作中，对于集合的操作较多，例如：元素随机置
 * 换、获取元素最大值、获取元素和、元素排序、元素填充、元素反
 * 转等需求。我们通过今天学习的知识点，自定义一个集合工具类，
 * 用于提高集合操作方法的复用性。
 * 需求描述：请自定义一个集合工具类(类名：ListUtils)。
 * 实现提示：
 * ·方法名称： (定义方法即可，不需要实现具体的功能)
 * 。元素随机置换：void shuffle(int[] list);
 * ■System.out.println("元素随机置换完毕！");
 * o获取元素最大值：void getMax(int[] list);
 * ■System.out.println("获取元素最大值！");
 * ○获取元素和：void getSum(int[] list);
 * ■System.out.println("获取元素和！");
 * ○元素排序【选做】：void sort(int[ list);
 * ■System.out.println("元素排序");
 * 。 元素填充: void fill(int[] list, int value);
 * ■提示：该方法就是将传入的value参数，全部存入list集合
 * 中
 * ○元素反转:void reverse(int[] list);
 * Svstem.out.println("元素反转:"):
 */

public class ListUtils {

    public static void shuffle(int[] list) {
        System.out.println("元素随机置换完毕！");
    }

    public static void getMax(int[] list) {
        System.out.println("获取元素最大值！");
    }

    public static void getSum(int[] list) {
        System.out.println("获取元素和！");
    }

    public static void sort(int[] list) {
        System.out.println("元素排序！");
    }

    public static void fill(int[] list,int value) {
        System.out.println("该方法是将传入的value参数，全部存入list集合中");
    }

    public static void reverse(int[] list) {
        System.out.println("元素反转");
    }
}
