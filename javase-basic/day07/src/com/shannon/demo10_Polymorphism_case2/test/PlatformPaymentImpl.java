package com.yanxiao.demo10_Polymorphism_case2.test;

public class PlatformPaymentImpl  implements Payment{

    @Override
    public void pay(double money) {
        System.out.println("支付宝~"+money);
    }
}
