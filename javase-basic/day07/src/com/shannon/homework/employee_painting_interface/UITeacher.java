package com.yanxiao.homework.employee_painting_interface;

/**
 * UI讲师类：子类
 */
public class UITeacher extends employee implements IPainting{

    //
    @Override
    public void work() {
        System.out.println("UI讲师，在美美的讲课~");
    }

    @Override
    public void paint() {
        System.out.println("UI讲师，画的跟本人一样美~");
    }

    public UITeacher() {
    }

    public UITeacher(String name, int age, String gender) {
        super(name, age, gender);
    }
}
