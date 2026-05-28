package com.yanxiao.demo10_Polymorphism_case2.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择支付方式:  1. 支付平台支付   2. 银行卡网银支付  3. 信用卡快捷支付");

        int type = sc.nextInt();
        //接收支付金额
        System.out.println("请输入支付金额：");
        double money = sc.nextDouble();

        //实现接口：初始化一个空值null，作为空容器，避免报错（必须赋值）
        Payment payment = null;

        //选择支付方案
        switch (type) {
            // 对象多态
            case 1-> payment = new PlatformPaymentImpl();
//            case 1-> new PlatformPaymentImpl().pay(money);//自己瞎写的
            case 2-> payment = new BankcardPaymentImpl();
            case 3-> payment = new CreditCardPaymentImpl();
        }


        //进行支付操作
        //行为多态
        payment.pay(money);
    }
}
