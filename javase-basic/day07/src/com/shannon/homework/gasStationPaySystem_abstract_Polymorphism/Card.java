package com.yanxiao.homework.gasStationPaySystem_abstract_Polymorphism;

/**
 * Card：抽象父类
 */
public abstract class Card {
    private String id;//卡号
    private double balance;//余额

    //定义抽象方法：支付
    public abstract void pay(double amount);

    //无参、有参
    public Card() {
    }

    public Card(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
