package com.yanxiao.demo04_capsulation;

public class PigTest {
    public static void main(String[] args) {
        Pig p1 = new Pig();
        p1.setName("猪") ;
        p1.setAge(18);
        p1.setGender("公");
        p1.setWeight(200);

        p1.println();
        p1.eat();
        p1.slep();
        p1.walk();
    }

}
