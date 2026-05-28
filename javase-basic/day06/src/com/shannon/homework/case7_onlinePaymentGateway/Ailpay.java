package com.yanxiao.homework.case7_onlinePaymentGateway;
//支付宝支付
public class Ailpay extends Payment{
    private String account;//账号

    public Ailpay() {
    }

    public Ailpay(int order_id, double amount, String account) {
        super(order_id, amount);
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return super.toString()+getAccount();
    }

    @Override
    public void pay() {
        super.validate();
        System.out.println("用支付宝账号:"+getAccount()+",支付"+getAmount()+"元，扫码成功");
    }
}
