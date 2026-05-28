package com.yanxiao.demo10_Polymorphism_case2.test;

public class BankcardPaymentImpl implements Payment{

    @Override
    public void pay(double money) {
        System.out.println("银行卡"+money);
    }
}
