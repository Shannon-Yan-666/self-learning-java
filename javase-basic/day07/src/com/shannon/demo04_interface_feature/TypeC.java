package com.yanxiao.demo04_interface_feature;

/**
 *  TypeC 接口：
 *
 */
public interface TypeC {

    //成员变量：WIDTH/HEEIGHT
    //成员都是常量，前缀默认省略   public static final
    public static final double WIDTH = 2;
    double HEEIGHT = 1.5;

    //成员方法: public abstract  前缀默认省略了
    public abstract void connection();
    void disConnection();

    //构造方法：没有构造方法
}
