package com.yanxiao.demo01_abstract;

/**
 *  目标：了解抽象类的特点
 *      1.抽象类不能创建对象 （没有具体的方法体，没意义）
 *      2.抽象类是功能更强大的类
 *          具有 普通类中有的成员（成员变量、构造方法、成员方法）
 *          具有 抽象方法
 *      3.抽象类不一定有抽象方法
 *          有抽象方法的类，一定是抽象类
 *      4.抽象类作为父类来使用
 *          子类一定要重写父类中所有抽象方法（因为子类是普通类，普通类不能有抽象的东西）
 *          子类也是抽象的类，就可以不重写抽象方法
 *      5.抽象类中关键字冲突的问题
 *          冲突：final（没有子类）    +   abstract（有子类） 修饰类
 *          冲突：final（不能重写）    +   abstract（必须重写） 修饰方法
 *          冲突：static（类名.直接访问）+   abstract （抽象的不能直接调用，没有具体方法体，无意义）
 *          冲突：private（隐藏）     +   abstract（要求子类必须重写）
 *
 */
public abstract class Animal {
    private int age; //成员变量
    private String name;

    //无参构造
    public Animal() {
    }

    //有参构造
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //抽象方法
    public abstract void eat();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
