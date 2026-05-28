package com.yanxiao.homework.employee_painting_interface;
/**
 * ### 作业三：员工与绘画接口（接口应用）
 * #### 训练目标
 * 掌握接口的定义与实现，理解类与接口之间的实现关系（implements），以及类与类之间的继承关系（extends）的综合运用。
 *
 * #### 需求描述
 * 1. 定义“员工”类：
 *    - 属性：姓名、性别、年龄（全部私有）。
 *    - 行为：工作（抽象）。
 *    - 方法：无参、全参构造方法，get/set方法。
 * 2. 定义“绘画”接口：
 *    - 抽象方法：绘画。
 * 3. **定义“Java讲师”类：** 继承自“员工”类。
 * 4. **定义“UI讲师”类：** 继承自“员工”类，并实现“绘画”接口。
 * 5. **要求：** 按上述要求设计出类结构，并实现相关的方法，并进行调用测试。
 *
 * #### 实现提示
 * 1. **抽象类设计：** “员工”类包含抽象方法“工作”，因此必须声明为`abstract class`。
 * 2. **接口定义：** 使用`interface`关键字定义“绘画”接口，并在其中声明`paint()`方法（默认为`public abstract`）。
 * 3. **多重关系：** “UI讲师”类既要继承“员工”类（`extends`），又要实现“绘画”接口（`implements`）。在Java中，`extends`写在`implements`之前。
 * 4. **方法重写：** 子类必须重写父类的抽象方法`work()`，实现类必须重写接口的抽象方法`paint()`。
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建子类对象:java讲师
        JavaTeacher j1 = new JavaTeacher("阿笑",38,"男");
        //子类对象.调用重写的接口的方法
        j1.paint();
        //子类对象.调用重写的父类的方法
        j1.work();

        //创建子类对象:ui讲师
        UITeacher u1 = new UITeacher("小美",18,"女");
        //子类对象.调用重写的接口的方法
        u1.paint();
        //子类对象.调用重写的父类的方法
        u1.work();

        System.out.println("=======================");

        employee e1 = new UITeacher();
        e1.work();

        //类型判断：员工e1 是否为接口类型 ，如果是则执行方法体
        if (e1 instanceof IPainting){
            IPainting i1 = (IPainting)e1;
            i1.paint();
        }

        System.out.println("================");
        IPainting i2 = new JavaTeacher();
        i2.paint();
        //类型判断：接口i2，是否为员工类型，如果是则执行方法体
        if (i2 instanceof employee){
            employee e2 = (employee)i2;
            e2.work();
        }
    }
}
