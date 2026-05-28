package com.yanxiao.demo03_oop_constructor;

public class Dod {
    // 成员变量：描述属性/特征
    String name;
    int age;
    char gender;
    double height;
    double weight;
    String type;
    String address;
    String phone;
    boolean isNeutered;
    String color;

    //构造方法：创建对象使用的
    //特点：无返回值类型，方法名称与类名称一致
    //无参构造器
    public Dod(){
        System.out.println("Dod Constructor");
    }

    //有参构造器： ctrl + A 全选
    // 右键 选Generate --> Constructor --> 选择属性值，生成有参构造器
    public Dod(String name, int age, char gender, double height, double weight, String type, String address, String phone, boolean isNeutered, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.type = type;
        this.address = address;
        this.phone = phone;
        this.isNeutered = isNeutered;
        this.color = color;
    }

    //成员方法：描述行为和功能的
    public void lookHome(){
        System.out.println(name+ "：看家护院。");
    }
}
