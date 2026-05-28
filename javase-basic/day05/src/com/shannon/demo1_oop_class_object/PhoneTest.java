package com.yanxiao.demo1_oop_class_object;

public class PhoneTest {
    public static void main(String[] args) {
        phone p1 = new phone();
        phone p2 = new phone();

        p1.name = "小米";
        p1.color = "白色";
        p1.price = 4999;
        System.out.println("品牌：" + p1.name + "，颜色：" + p1.color + "，价格："+ p1.price + "元。"); ;
        p1.call();
        p1.sendMessage();

        System.out.println();

        p2.name = "华为";
        p2.color = "黑色";
        p2.price = 5000;
        System.out.println("品牌：" + p2.name + "，颜色：" + p2.color + "，价格："+ p2.price + "元。"); ;
        p2.call();
        p2.sendMessage();
    }
}
