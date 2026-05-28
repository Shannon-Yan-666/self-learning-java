package com.yanxiao.homework;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的成绩：");
        int score = sc.nextInt();

        checkScore(score);
    }


    public static void checkScore(int score) {

        if (score < 0 || score > 100) {
            System.out.println("你输入的成绩有误");
        } else if (score >= 95) {
            System.out.println("奖励自行车一辆");
        } else if (score >= 90) {
            System.out.println("游乐园玩一次");
        } else if (score >= 80) {
            System.out.println("变形金刚玩具一个");
        } else {
            System.out.println("爱的教育");
        }
    }
}