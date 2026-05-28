package com.yanxiao.demo08_Polymorphism_feature;

/**
 * 饲养员类
 * 设计一个功能更强大的方法接收-->父类类型（实现对象多态/行为多态）
 */
public class Breeder {

    //需求：设计一个能够喂养所有动物的方法，供上层调用
                    //对象多态：可以接收所有子类对象
                    //形参接收父类实现对象多态
                    // 向上转型：父接子（自动进行向上类型转换）
    public  void feed(Animal animal) {
        //使用父类变量调用方法，执行对应子类的方法
        animal.eat();//行为多态：可以表现多种不同的行为

        // 向下转型：父类强制转为子类（可以调用子类独有的方法）
        //    语法：子 = （子）父
        // 类型判断关键字：instanceof  格式：对象名 instanceof 类型

        //判断变量引用真实的类型，判断动物是否是猪
        if (animal instanceof Pig) {
            //如果是，执行方法体：让猪去睡觉~
        ((Pig)animal).sleep();
        }

        //判断变量引用真实的类型，判断动物是否是狗
        if (animal instanceof Dog) {
            //如果是，执行方法体：让小狗去散步~
            ((Dog)animal).run();
        }
    }





    //需求：设计一个方法，能接入所有USB设备
    public void useDevice(/* 父类/接口 */){
//        父类变量.方法名  谁调用这个方法，执行的就是哪个子类的方法

    }
}
