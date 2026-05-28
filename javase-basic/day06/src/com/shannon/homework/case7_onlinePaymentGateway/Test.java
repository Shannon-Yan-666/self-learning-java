package com.yanxiao.homework.case7_onlinePaymentGateway;

/**
 * 在线支付网关
 * 训练目标：综合运用接口/抽象类与多态，模拟实际业务场景。需求背景：电商系统需要对接多种支付方式，每种支付方式的验证和
 * 扣款流程不同。具体要求：
 * ·父类：Payment (支付方式)
 * o属性：订单号(orderld)、金额(amount)
 * 构造方法：初始化属性
 * o方法：pay(）(执行支付)
 * 。方法：vaLidate(）（输出"正在验证订单[orderld] 信息.")
 * ）子类：Alipay (支付宝支付)
 * 。新增属性：账号(account)
 * 。重写方法：payO
 * 先调用validate（)
 * 输出"使用支付宝账号[account] 支付[amount] 元，扫码成功"
 * 子类：CreditCard (信用卡支付)
 * ○新增属性：卡号(cardNumber)、CVV码
 * 。重写方法：payO
 * 先调用validate()
 * 口输出"使用信用卡[cardNumber]支付[amount] 元，验证cVV通过"
 * 测试：
 * 。 创建一个 Alipay 和CreditCard 对象。
 *    调用pay（）方法，实现支付。
 */
public class Test {
    public static void main(String[] args) {
        Ailpay ailpay = new Ailpay(110120,9999,"小阎");
        ailpay.pay();
        System.out.println(ailpay);

        System.out.println("================================");

        CreditCard creditCard = new CreditCard(6668888,6666,112233,"da1ce3s");
        creditCard.pay();
        System.out.println(creditCard);
    }
}
