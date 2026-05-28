package com.yanxiao.homework.case4_companyStaffManageSystem;

//招聘经理类
public class Recruiter extends Employee{
    private double Commission;

    public Recruiter() {
    }

    public Recruiter(String name, String id, double salary, double commission) {
        super(name, id, salary);
        Commission = commission;
    }

    public double getCommission() {
        return Commission;
    }

    public void setCommission(double commission) {
        Commission = commission;
    }

    @Override
    public void working() {
        System.out.println("工号为："+getId()+"的，"+getName()+"招聘经理，拿着"+getSalary()+"的工资，正在Boss直聘上招人，招一个人提成"+getCommission()+"元。");
    }

    @Override
    public String toString() {
        return super.toString()+getCommission();
    }
}
