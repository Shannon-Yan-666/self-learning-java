package com.yanxiao.homework;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        //练习二：创建学生对象s1
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.show();
        //练习二：创建学生对象s2
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        s2.show();

        System.out.println("===================");
        //练习三：创建老师对象t1
        //使用set+无参构造器，初始化赋值
        Teacher t1 = new Teacher();
        t1.setName("杨老师");
        t1.setWorkNumber("t001");
        t1.teach();

        //练习三：创建老师对象t2
        //使用有参构造器，初始化赋值
        Teacher t2 = new Teacher("李老师","t002");
        t2.teach();

        System.out.println("===================");
        //练习四：创建手机对象p1
        Phone p1 = new Phone();
        p1.setBrand("小米");
        p1.setColor("黑色");
        p1.setPrice(3998);
        p1.call();
        p1.sendMessage();

        System.out.println("===================");
        //练习五：static 工具类
        int []list = {11,22,33,44,55,66,77,88,99};
        ListUtils.getSum(list);
        ListUtils.getMax(list);
        ListUtils.getMax(list);
        ListUtils.fill(list,11);
        ListUtils.sort(list);
        ListUtils.shuffle(list);

        System.out.println("===================");
        //练习六：static 修饰成员变量
        StaticField stu = new StaticField();
        StaticField.setNationality("中国");//使用类名访问，不用开辟对象空间，性能高
        stu.setNationality("");//不推荐使用对象访问，性能低
    }
}
