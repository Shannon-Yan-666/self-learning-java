package com.yanxiao.homework;

/**
 * 自增自减运算符
 */

public class homework4 {
    public static void main(String[] args) {
    /*
    练习一
    目标：掌握自增运算符的书写格式，能够说出他们分别对于变量的作用

        1. 需求 :定义一个整数变量代表点赞的数量。默认值是0，现在有三个用户分别
                对一个作品点赞，使用自增的知识点模拟点赞数量增长的过程，输出当
                前点赞的数量。隔了一段时间，有一个用户取消了点赞，使用自减的知
                识点模拟点赞减少的过程，输出当前点赞的数量。
     */
        int count = 0;

        count ++;
        count ++;
        count ++;
        System.out.println("当前点赞人数为："+ count);

        count --;
        System.out.println("当前点赞人数为："+ count);
    }
}
