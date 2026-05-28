package com.yanxiao.demo01_extends;

/**
 *  父类/员工类：也称为基类、超类
 *  子类：派生类，可以直接使用父类中非私有成员
 *  父类使用情况：
 *          当类与类 之间存在相同（共性）的内容，并产生了is a 的关系，就可以考虑使用继承，来优化代码
 *  父类好处：
 *         1.减少冗余代码书写，提高开发效率
 *         2.提高代码的维护性和管理性
 */
//创建父类，私有化成员变量，提供对外的get/set方法供子类使用，有参/无参构造器1111
public class Employee {

    //1.抽取的公共的成员变量/属性
    private String name;
    private int age;
    private double salary;

    //2.提供无参/全参构造方法，提供给子类构造方法使用（第一行调用父类的构造方法）
    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //3.提供get/set 方法，操作被隐藏的成员变量/属性，被子类继承的属性
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //4.抽取公共的成员方法（供子类调用/重写）
    public void eat(){
        System.out.println("吃饭！");
    }

    public void work(){
        System.out.println("工作");
    }


    // 快捷键： alt + insert + override method + toString
    // 重写父类的toString方法
    @Override
    public String toString() {
        return "Employee（父类的）" +
                "姓名：" + name +
                "，年龄：" + age +
                "，工资：" + salary ;
    }
}
