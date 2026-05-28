package com.yanxiao.case5_petShopManageSystem;

public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat("暹罗","Film","黑色",2);
        c1.catchMouse();
        c1.eat();
        System.out.println(c1);

        Dog d1= new Dog("哈士奇","糖","白色",3);
        d1.lookHome();
        d1.eat();
        System.out.println(d1);

        Hedgehog h1 = new Hedgehog("月球","LUNA","黑白",1);
        h1.actingCute();
        h1.eat();
        System.out.println(h1);
    }
}
