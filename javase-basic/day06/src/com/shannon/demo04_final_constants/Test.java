package com.yanxiao.demo04_final_constants;

public class Test {
    public static void main(String[] args) {

        //场景1：
        double money = 100;
        //                 0.8折扣可以替换为常量
        System.out.println(100 * 0.8);
        //可读性强
        System.out.println(money*Fu.PRODUCT_DISCOUNT);

        //场景2：
        System.out.println(Fu.RQUEST_ERROR);
    }
}
