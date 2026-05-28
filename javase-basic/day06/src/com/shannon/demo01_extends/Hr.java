package com.yanxiao.demo01_extends;

/**
 * 子类：HR人事类
 */
//创建一个子类，继承父类
public class Hr extends  Employee{
//    String name;
//    int age;
//    double salary;
    private int money;


    // 调用父类有参构造器：
    // alt + insert快捷键--->Constructor
    // 一级目录：父类参数
    // 二级目录：子类独有参数
    // 配置自己需要的参数


    @Override
    public void eat() {
        System.out.println("HR人事：吃下午茶~");
    }


}
