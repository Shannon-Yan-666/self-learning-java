package com.yanxiao.demo03_array_foreach;
/**
 * 目标：掌握数组遍历的方式
 * 方式：
 *
 * 使用场景：
 *      统计操作：求和/求最值/求平均值....
 */

public class demo03 {
    public static void main(String[] args) {
        String[] dongMans = {"凡人修仙传", "大圣归来", "哪吒", "姜子牙"};

        //遍历数组容器中的所有数据，循环实现获取数组元素的操作（推荐使用for）
        //动态获取（数组名称.length）
        for (int i = 0; i < dongMans.length; i++) {
            //   for循环生成索引位置，获取当前位置的元素
            System.out.println(dongMans[i]);
        }

        //遍历数组快捷方式：数组名称.fori 回车
//        for (int i = 0; i < dongMans.length; i++) {
//
//        }


        //需求：已知数组元素为{11，22,33，44,55}
        //请将数组中偶数元素取出并求和，最后打印求和结果
        int[] numbers = {11, 22, 33, 44, 55};

        int sum = 0; //初始化一个变量，累加数字之和
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);


        //需求：求最大值
        int[] numbers2 = {5, 22, 33, 44, 55};

        int max = 0; //初始化一个变量，存储最大值。
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > max) {
                // 大的数值，赋值给max，更新max
                max = numbers2[i];
            }
        }
        System.out.println(max);


    }
}
