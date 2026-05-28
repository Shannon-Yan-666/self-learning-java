package com.yanxiao.demo03_interface;

/**
 * 实现类：重写接口中的所有抽象方法
 * 快捷键：alt + enter
 */

public class Mouse implements USB {

    @Override
    public void disCon() {
        System.out.println("连接鼠标...");
    }

    @Override
    public void con() {
        System.out.println("断开链接鼠标...");
    }
}
