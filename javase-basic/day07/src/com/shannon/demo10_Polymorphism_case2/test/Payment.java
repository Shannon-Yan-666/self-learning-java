package com.yanxiao.demo10_Polymorphism_case2.test;

//定义支付接口:制定支付标准/规则
//使用多态：进行支付（接口也支持多态）
public interface Payment {
    void pay(double money);

}
