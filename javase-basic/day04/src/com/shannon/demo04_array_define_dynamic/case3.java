package com.yanxiao.demo04_array_define_dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class case3 {
    public static void main(String[] args) {
        // 需求：
        // 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
        // 选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值
        Scanner sc = new Scanner(System.in);
        int[] score = new int[6];// 动态数组，初始数据为{0,0,0,0,0,0}，最小值为0

        int max =Integer.MIN_VALUE; //老师给修改的，新的知识点
        int min =Integer.MAX_VALUE; //老师给修改的，新的知识点
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("请录入您的第"+ (i+1) +"个打分：");
            score[i] = sc.nextInt();
            sum += score[i];
//            System.out.println(Arrays.toString(score));
            System.out.println("总计："+sum);
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("去掉一个最高分"+max+",去掉一个最低分："+min);
        System.out.println("平均分："+((sum-max-min)/score.length-2));
    }
}
