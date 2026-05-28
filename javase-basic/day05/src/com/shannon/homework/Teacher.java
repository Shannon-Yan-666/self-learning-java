package com.yanxiao.homework;

/**
 *练习三
 * 目标：能够使用无参+set方法去创建对象，给属性赋值。能够
 * 掌握有参构造去创建对象
 * 1.需求
 * 请定义教师类（Teacher），属性包括姓名和工号，定义教课
 * （teach）方法，输出“工号为xxx的xxx老师正在讲课”。
 * 在测试类中，要求分别使用空参和有参构造方法创建对象，空参创建的
 * 对象通过setXxx赋值，有参创建的对象直接赋值。创建对象之后，调
 * 用对象中的teach（)方法
 * 程序执行，在控制台输出效果
 * 工号为t001的杨老师正在讲课
 * 工号为t002的李老师正在讲课
 */
public class Teacher {
    private String name;
    private String workNumber;

    public Teacher() {
    }

    public Teacher(String name, String workNumber) {
        this.name = name;
        this.workNumber = workNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public void teach() {
        System.out.println("工号为： " + workNumber +"的"+ name + "，正在讲课。" );
    }
}
