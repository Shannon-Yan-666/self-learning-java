package com.yanxiao.homework.case7_onlinePaymentGateway;
//支付方式
public class Payment {
    private int order_id;//订单号
    private double amount;//金额

    public Payment() {
    }

    public Payment(int order_id, double amount) {
        this.order_id = order_id;
        this.amount = amount;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void pay() {
        System.out.println("执行支付");
    }

    public void validate(){
        System.out.println("正在验证订单"+getOrder_id()+" 信息...");
    }

    @Override
    public String toString() {
        return "Payment{" +
                "order_id=" + order_id +
                ", amount=" + amount +
                '}';
    }
}
