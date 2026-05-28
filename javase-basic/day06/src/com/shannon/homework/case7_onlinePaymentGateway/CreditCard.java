package com.yanxiao.homework.case7_onlinePaymentGateway;
//信用卡支付
public class CreditCard extends Payment{
    private int cardNumber;
    private String cvvNumber;

    public CreditCard() {
    }

    public CreditCard(int order_id, double amount, int cardNumber, String cvvNumber) {
        super(order_id, amount);
        this.cardNumber = cardNumber;
        this.cvvNumber = cvvNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvvNumber() {
        return cvvNumber;
    }

    public void setCvvNumber(String cvvNumber) {
        this.cvvNumber = cvvNumber;
    }

    @Override
    public void pay() {
        super.validate();
        System.out.println("使用信用卡"+getCardNumber()+"，支付"+getAmount()+"元，验证CVV："+getCvvNumber()+"，通过。");
    }

    @Override
    public String toString() {
        return super.toString()+getCardNumber()+","+getCvvNumber();
    }
}
