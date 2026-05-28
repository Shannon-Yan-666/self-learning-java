package com.yanxiao.homework.employee_painting_interface;

/**
 * java讲师类：子类
 */
//继承员工父类，实现绘画接口
public class JavaTeacher extends employee implements IPainting{

    //重写父类的抽象方法
    @Override
    public void work() {
        System.out.println("java讲师，在巴拉巴拉的讲课~");
    }

    //重写接口的抽象方法
    @Override
    public void paint() {
        System.out.println("java讲师，画的一般般~");
    }

    //无参、有参构造器
    public JavaTeacher() {
    }

    public JavaTeacher(String name, int age, String gender) {
        super(name, age, gender);
    }
}
