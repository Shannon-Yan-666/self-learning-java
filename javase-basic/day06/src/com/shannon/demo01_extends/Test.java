package com.yanxiao.demo01_extends;

public class Test {
    public static void main(String[] args) {
        //new子类对象，使用父类提供的非私有方法
        Coder coder = new Coder();
        Coder coder1 = new Coder("李磊",28,15000);
        coder.setName("张三");
        coder.setAge(23);
        coder.setSalary(15000);
        System.out.println(coder.getName()+"，"+coder.getAge()+"岁，"+coder.getSalary()+"元。");
        coder.eat();
        coder.work();
        System.out.println("========================");

        Manager manager = new Manager();
        manager.setName("李四");
        manager.setAge(24);
        manager.setSalary(18000);
        manager.setBonus(5000);
        System.out.println(manager.getName()+"，"+manager.getAge()+"岁，"+manager.getSalary()+"元。");
        manager.eat();
        manager.work();
        System.out.println(manager);
        System.out.println("========================");

        Hr hr = new Hr();
        hr.setName("王五");
        hr.setAge(20);
        hr.setSalary(10000);
        System.out.println(hr.getName()+"，"+hr.getAge()+"岁，"+hr.getSalary()+"元。");
        hr.eat();
        System.out.println("========================");
    }
}
