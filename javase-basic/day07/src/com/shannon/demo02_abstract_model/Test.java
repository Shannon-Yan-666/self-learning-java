package com.yanxiao.demo02_abstract_model;

public class Test {
    public static void main(String[] args) {
        MakeCoffe makeCoffe = new MakeCoffe();
        makeCoffe.make();

        System.out.println("================");

        MakeTea makeTea = new MakeTea();
        makeTea.make();
    }
}
