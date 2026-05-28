package com.yanxiao.demo03_oop_constructor;

/**
 *  目标：掌握构造方法的定义和使用常见
 *  构造方法：
 *          类的组成部分之一
 *          方法名称和类名称一致
 *          没有返回值类型
 *  特点：
 *      创建对象时，自动执行
 *  使用场景：
 *      创建对象的同时，给对象设置初始的数据/初始值
 */
public class DogTest {
    public static void main(String[] args) {
        //创建小狗对象，加载会默认执行一次无参构造器。
        Dod d1 = new Dod();
        //现象：对象属性值多，创建对象时设置数据非常繁琐
        d1.name = "小黑";
        d1.age = 1;
        d1.address = "广东深圳";
        d1.gender = '母';
        d1.height = 0.8;
        d1.weight = 35;
        d1.color = "blue";
        d1.isNeutered = true;
        d1.phone = "150011223388";
        d1.type = "哈士奇";

        //解决方案：使用有参构造器，实现创建对象时设置初始值
        Dod d2 = new Dod("Film",25,'女',165, 55,"小猫","曼谷","1500000",true,"黑色");
        d2.lookHome();

    }
}
