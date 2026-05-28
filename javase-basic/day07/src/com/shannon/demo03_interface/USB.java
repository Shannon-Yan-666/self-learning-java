package com.yanxiao.demo03_interface;

//USB接口：用于制定规则
public interface USB {

    //抽象方法：表示具体的规则1（因为抽象类，强制重写）
    // public abstract  默认都有  可以省略
    public abstract void disCon();

    //抽象方法：表示具体的规则2（因为抽象类，强制重写）
    public abstract void con();
}
