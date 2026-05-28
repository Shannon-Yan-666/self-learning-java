package com.yanxiao.demo1_operator;

/**
 *
 *  目标：掌握逻辑运算符基本使用
 *  符号：
 *         & ：逻辑与，并且
 *         | ：逻辑或，或者
 *         ! ：逻辑非，取反
 *         ^ ：逻辑异或，不相同
 *
 *         && : 双与，短路效果，左边成立，右侧不执行，性能更高
 *         || : 双或，短路效果，左边成立，右侧不执行，性能更高
 */

public class demo7 {

    public static void main(String[] args) {
        //场景1：找工作，工资salary >= 13000 并且 employee >= 100
        double salary = 10000;
        int employee = 200;

        boolean result = salary >= 13000 && employee >= 100;
        System.out.println("当前公司是否复合要求：" + result);


        //场景2：50年后找工作，wek >= 2 或者 distance < 5
        int wek = 3;
        int distance = 2 ;

        boolean result2 = wek >= 2 || distance < 5;
        System.out.println(result2);

        //场景3：对上一个场景的结果取反
        boolean result3 = !(wek >= 2 || distance < 5);
        System.out.println(result3);

        //场景4：异或
        System.out.println( true ^ true);
        System.out.println( false ^ false);
        System.out.println( false ^ true);
        System.out.println( true ^ false);

    }
}
