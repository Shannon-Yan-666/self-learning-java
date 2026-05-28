package com.yanxiao.homework.gasStationPaySystem_abstract_Polymorphism;

import com.yanxiao.demo10_Polymorphism_case2.test.Payment;

import java.util.Scanner;

/**
 * ### 作业六：加油站支付系统（选做）
 * #### 训练目标=
 * 掌握抽象类（`abstract class`）的定义与使用，理解方法重写（Override）在实现多态性中的核心作用，学会利用父类引用指向子类对象来编写通用的业务处理方法。
 * #### 需求描述
 * 某加油站推出了2种支付卡：
 * 1. **金卡**：后续加油享受8折优惠。
 * 2. **银卡**：后续加油享受8.5折优惠。
 *
 * **卡片基本信息**：需要包含卡号、余额、支付功能。
 *
 * #### 实现提示
 * 1. 抽象父类设计：
 *    - 定义一个`Card`抽象类。
 *    - 包含私有属性：`id`（卡号）、`balance`（余额）。
 *    - 包含构造方法、Getter/Setter方法。
 *    - 定义抽象方法`pay(double amount)`，因为不同卡片的支付逻辑（折扣）不同，无法在父类中给出具体实现。
 * 2. 子类实现：
 *    - `GoldenCard`（金卡）：继承`Card`，重写`pay`方法，实际扣款金额 = `amount * 0.8`。
 *    - `SilverCard`（银卡）：继承`Card`，重写`pay`方法，实际扣款金额 = `amount * 0.85`。
 *    - 注意：扣款前需要判断余额是否充足。
 * 3. 多态测试：
 *    - 在测试类中定义一个静态方法`payMoney(Card card, double amount)`。
 *    - 该方法接收的参数类型是`Card`，这样无论是传入`GoldenCard`对象还是`SilverCard`对象，都能自动调用对应的`pay`方法（动态绑定）。
 * 4. 交互逻辑：
 *    - 使用`Scanner`获取用户输入的卡类型（1或2）和支付金额，根据选择创建不同的卡对象，并调用通用的支付方法。
 */
public class Test {
    public static void main(String[] args) {
//        //创建Sc扫描器
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入：1、金卡，2、银卡");
//        //获取用户输入的卡类型（1或2）
//        int type = sc.nextInt();
//
//        System.out.println("请输入您要支付的金额：");
//        //录入用户的支付金额。
//        double money = sc.nextDouble();
//
//        //实现接口：初始化一个空值null，作为空容器，避免报错（必须赋值）
//        Payment payment = null;
//
//        switch (type){
//            case 1->
//            break;
//        }


        GoldenCard goldenCard = new GoldenCard("ID01",100);
        payMethod(goldenCard,10);


    }

    public static void payMethod(Card card,double amount) {
        card.pay(amount);
    }
}
