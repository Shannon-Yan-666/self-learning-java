package com.yanxiao.demo05_oop_javabean;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        GirlFriend gf2 = new GirlFriend();

        gf1.setName("Film");
        gf1.setHeight(165.5);
        gf1.setWeight(90);

        System.out.println("我女朋友叫:"+gf1.getName()+"，身高："+gf1.getHeight()+"，体重"+gf1.getWeight()+"斤。");

        gf2.setName("蓝莓");
        gf2.setHeight(170);
        gf2.setWeight(95);

        System.out.println("我女朋友叫:"+gf2.getName()+"，身高："+gf2.getHeight()+"，体重"+gf2.getWeight()+"斤。");
    }
}
