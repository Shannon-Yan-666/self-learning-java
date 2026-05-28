package com.yanxiao.homework.case4_companyStaffManageSystem;

//研发工程师类
public class Coder extends Employee{

    public Coder() {
    }

    public Coder(String name, String id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void working() {
        System.out.println("工号为："+getId()+"的，"+getName()+"程序员，拿着"+getSalary()+"的工资，正在苦逼的写代码。");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
