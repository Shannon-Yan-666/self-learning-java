package com.yanxiao.homework.case1_car;

/**
 * 题目1：出租车与家用轿车的设计
 * 训练目标
 * 掌握面向对象编程中"继承"的思想，学会从具体类中提取公共父
 * 类，减少代码冗余。
 * 需求描述
 * 请使用面向对象的思想，设计自定义类，描述出租车和家用轿车的
 * 信息。
 * ·出租车类：属性包括：车型，车牌，所属出租公司；方法包括：
 * 启动，停止（输出相应对顾客的提醒问候语）。
 * ·家用轿车类：属性包括：车型，车牌，车主姓名；方法包括：
 * 启动，停止。
 * ·要求：
 * 1.分析出租车和家用轿车的公共成员，提取出父类一汽车类。
 * 2.利用继承机制，实现出租车类和家用轿车类。
 * 3.编写测试类，分别测试汽车类，出租车类和家用轿车类对象
 * 的相关方法。
 * 4.定义名为car的包存放汽车类，出租车类，家用轿车类和测
 * 试类。
 * 实现提示
 * 1.提取父类：观察发现"车型"和"车牌"是两者共有的，可以提取到
 * 一个名为car的父类中。
 * 2.定义子类：Taxi类和Privatecar类使用extends 关键字继承
 * Car类。
 * 3.特有属性：Taxi类增加company属性，Privatecar类增加
 * ownerName 属性。
 * 4.构造方法：子类构造方法中需要使用super（）调用父类的构造
 * 方法来初始化共有属性。
 * 5.包管理：在文件第一行使用packagecar;声明包。
 *
 */
public class Test {
    public static void main(String[] args) {
        TaxiCar t1 = new TaxiCar();
        t1.setLicensePlate("京A8888");
        t1.setVehicleType("劳斯莱斯-幻影");
        t1.setOwnerName("笑氏企业");
        System.out.println(t1.getOwnerName()+t1.getVehicleType()+t1.getLicensePlate()+"接美女~");
        t1.start();
        t1.stop();

        FamilyCar f1 = new FamilyCar();
        f1.setLicensePlate("浙A6666");
        f1.setVehicleType("布加迪-威航");
        f1.setNameOfTheOwner("阿笑");
        System.out.println(f1.getNameOfTheOwner()+f1.getVehicleType()+f1.getLicensePlate()+"去拉风~");
        f1.start();
        f1.stop();
    }
}
