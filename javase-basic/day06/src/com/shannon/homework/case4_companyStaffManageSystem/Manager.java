package com.yanxiao.homework.case4_companyStaffManageSystem;

//项目经理类
public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void working() {
        System.out.println("工号为："+getId()+"的，"+getName()+"项目经理，拿着"+getSalary()+"的工资和"+getBonus()+"的奖金，正在盯着程序员写代码。");
    }

    @Override
    public String toString() {
        return super.toString()+getBonus();
    }
}
