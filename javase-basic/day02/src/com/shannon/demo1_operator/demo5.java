package com.yanxiao.demo1_operator;

/**
 *
 * 目标：掌握赋值运算符的基本使用
 * 符号：
 *      基本赋值： 直接进行赋值。将右侧数据存储到左侧变量中
 *              =
 *      复合赋值： 先运算，再赋值，先将左右进行运算，再赋值给左侧变量中
 *              =+  -+  *=  /=  %=
 * 注意：
 *      复合赋值运算符中，包含了强制类型转换
 */

public class demo5 {
    public static void main(String[] args) {
        //需求：发红包案例（余额：10000元，发出：5200元，接收：520元）
        //1.定义变量，存储账户余额
        int money = 10000;

        //2.发送红包，更新账户金额（发出-5200元）
        money -= 5200;
        System.out.println("发出5200元，当前余额："+money + "元");

        //3.接收红包，更新账户余额（收到+520元）
        money += 520;
        System.out.println("收到520元，当前余额："+money + "元");

        //笔试题
        /*
            byte b1 = 10;
            byte b2 = 20;
            b2 += b1;  //b2 = (byte)(b2 + b1);
         */
    }
}
