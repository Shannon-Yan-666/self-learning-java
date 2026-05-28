package com.yanxiao.homework.case4_companyStaffManageSystem;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("王一","001",15000,5000);
        m1.working();
        System.out.println(m1);

        Coder c1 = new Coder("李一","002",10000);
        c1.working();
        System.out.println(c1);

        Recruiter r1 =new Recruiter("陈一","003",12000,2000);
        r1.working();
        System.out.println(r1);
    }
}
