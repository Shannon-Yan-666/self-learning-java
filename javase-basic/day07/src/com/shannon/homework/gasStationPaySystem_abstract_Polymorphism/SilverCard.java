package com.yanxiao.homework.gasStationPaySystem_abstract_Polymorphism;

/**
 * `SilverCard`（银卡）：子类
 * 继承`Card`，重写`pay`方法，实际扣款金额 = `amount * 0.85`。
 * 注意：扣款前需要判断余额是否充足。
 */
public class SilverCard extends Card {
    public SilverCard() {
    }

    public SilverCard(String id, double balance) {
        super(id, balance);
    }

    @Override
    //重写父类的抽象方法：pay
    public void pay(double amount) {
        //创建一个变量：
        double money = getBalance();
        //判断余额是否充足
        if (money < amount*0.85) {
            System.out.println("余额不足");
        }

        //余额= 总金额-支付金额*0.8
        money -= amount*0.8;
        //重新赋值给余额
        setBalance(money);
        System.out.println("扣款成功，余额："+getBalance());
    }
}
