package com.yanxiao.demo4_noname_class;

/**
 * 匿名内部类：可以操作类、接口
 */

public class demo04_2_lambda {

    public static void main(String[] args) {

        //连接鼠标
        usbDevice(new IUsb() {
            @Override
            public void connect() {
                System.out.println("连接鼠标~");
            }
        });

        //连接键盘
        usbDevice(new IUsb() {
            @Override
            public void connect() {
                System.out.println("连接键盘~");
            }
        });

        //连接手机（Lambda 表达式）
        usbDevice(()->{
            System.out.println("连接手机~");
        });


        //lambda-简化版
        //参数类型可以省略不写。
        //如果只有一个参数，参数类型可以省略，同时（）也可以省略。
        //如果Lambda表达式的方法体代码只有一行代码
        //可以省略大括号不写，同时要省略分号
        //此时，如果这行代码是return语句，必须省略return不写，同时也必须省略各"；”不写
        usbDevice(()-> System.out.println("连接BB机~"));
    }

//链接所有的USB设备

    public static void usbDevice(IUsb usb){
        usb.connect();
    }
}
