package com.yanxiao.homework.case2_teachingManagementSystem;
/**
 * 题目2：教学管理系统师生信息
 * 训练目标
 * 理解继承在层级关系中的应用，掌握子类如何扩展父类的属性和行
 * 为。
 * 需求描述
 * 模拟教学管理系统师生信息。
 * 1.定义Person类：
 * 。属性：姓名、年龄。
 * 。构造方法：无参构造方法，有参构造方法。
 * 。成员方法：getxxx方法，setxxx方法，显示基本信息
 * showMsg方法。
 * 2.定义Teacher类，继承Person:
 * 。属性：学科。
 * 。构造方法：无参构造方法，有参构造方法。
 * 。成员方法：getxxx方法，setxxx方法，讲课方法。
 * 3.定义Student类，继承Person:
 * 。属性：分数。
 * 。构造方法：无参构造方法，有参构造方法。
 * 。成员方法：getxxx方法，setxxx方法，考试方法。
 * 实现提示
 * 1.父类设计：Person类作为基类，包含最基础的name和age。
 * 2.子类扩展：Teacher和student继承Person后，自动拥有了
 * 姓名和年龄，只需额外定义特有的属性（学科/分数）。
 * 3.方法调用：在子类中可以直接调用父类的showMsg（）方法来显
 * 示基础信息。
 */

public class Test {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("张三",38,"数学");
        t1.teaching();
        t1.showMsg();
        System.out.println(t1);

        Student s1 = new Student("李四",18,98.8);
        s1.examination();
        s1.showMsg();
        System.out.println(s1);
    }
}
