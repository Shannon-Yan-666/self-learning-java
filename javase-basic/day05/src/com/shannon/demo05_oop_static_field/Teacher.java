package com.yanxiao.demo05_oop_static_field;

/**
 * static 修饰成员变量：（静态变量：用于共享变量/数据）
 *      1.类加载到方法去，就开辟存储空间。
 *      2.类加载依次加载，static变量开辟一块堆内存中的存储空间
 *      3.可以直接使用类名称访问，也可以通过对象名称访问（不推荐）
 *      4.此静态变量被所有对象共享使用
 *  使用场景：
 *        类中的某个属性变量存储的是相同的共享数据，使用static修饰
 *  好处：
 *       1.节省内存资源
 *       2.方便操作
 *  访问方式：
 *      类名称.变量名称
 *      对象名称.变量名称（不推荐）
 */
public class Teacher {
    private String name;
    private int age;
    public static String company; //所有老师属于同一个学校
    public static String controlMachine;//所有老师共享使用一个遥控器

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Teacher.company = company;
    }

    public void teach() {
        System.out.println("上课");
    }

    public void eat() {
        System.out.println("太胖不吃");
    }
}
