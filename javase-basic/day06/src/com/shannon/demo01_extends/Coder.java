package com.yanxiao.demo01_extends;

/**
 * 子类：程序员类
 */
//创建一个子类，继承父类
public class Coder extends Employee{
    // 子类无参构造器，默认继承父类无参，省略super.
    public Coder() {
    }

    // 调用父类有参构造器：
    // alt + insert快捷键--->Constructor
    // 一级目录：父类参数
    // 二级目录：子类独有参数
    // 配置自己需要的参数
    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名为："+getName()+"，年龄为："+getAge()+"，工资为："+getSalary()+"，的程序员正在编代码。");
    }

    @Override
    public void eat() {
        System.out.println("程序员：吃泡面~");
    }

}
