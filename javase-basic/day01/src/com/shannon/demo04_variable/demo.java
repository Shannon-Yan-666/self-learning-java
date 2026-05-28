package com.yanxiao.demo04_variable;


/**
 *
 * 目标：掌握变量的定义和使用
 * 语法：
 *      数据类型  变量名称 = 值;
 * 底层原理：
 *      在内存中开辟一块存储空间，存储变化的数据
 *
 */
public class demo {

    public static void main(String[] args) {

        //场景1：实现存储微信余额
        int money = 100;

        // 午饭：三蛋灌饼 + 烤肠 = 8
        money = 92;
        System.out.println(money);

        //接收对象的520元红包
        money = money + 520;
        System.out.println(money);

        //场景2：实现统计一辆公交车一天对的营业数据
        //总营业额：amount
        //总载客量：count
        int amount = 0;
        int count = 0;

        //第一站：10个小孩（1块/人），5个大人（3块/人）
        count = count + 10 + 5;
        amount = amount + 10 + 5 * 3;
        System.out.println(count);
        System.out.println(amount);

        //第二站：5个小孩（1块/人），10个大人（3块/人）
        count = count + 5 + 10;
        amount = amount + 5 +10 * 3 ;
        System.out.println(count);
        System.out.println(amount);
    }
}





