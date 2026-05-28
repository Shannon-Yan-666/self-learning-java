package com.yanxiao.demo1_oop_class_object;

public class phone {
    String name;
    String color;
    double price;

    public void call(){
        System.out.println("给"+ name + "打电话。");
    }

    public void sendMessage(){
        System.out.println("给"+ name + "群发短信。");
    }
}
