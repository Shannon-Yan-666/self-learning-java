package com.yanxiao.demo01_extends;

/**
 * 子类：项目经理类
 */
//创建一个子类，继承父类
public class Manager extends Employee{
    private double bonus;
    // 子类无参构造器，默认继承父类无参，省略super.
    public Manager() {
    }

    // 调用父类有参构造器：
    // alt + insert快捷键--->Constructor
    // 一级目录：父类参数
    // 二级目录：子类独有参数
    // 配置自己需要的参数
    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名为："+getName()+"，年龄为："+getAge()+"，工资为："+getSalary()+"，奖金为"+getBonus()+"，的项目经理，正在分配任务。");
    }

    @Override
    public void eat() {
        System.out.println("项目经理：吃日料~");
    }

    // 快捷键： alt + insert + override method + toString
    // 调用父类重写的toString + 子类自己的toString  （父类+子类拼接）
    @Override
    public String toString() {
        return super.toString()+"，Manager（子类的）奖金："+bonus;
    }
}
