package com.yanxiao.homework.case3_resumeInfo;
/**
 * 题目3：简历信息模拟
 * 训练目标
 * 掌握方法的重写（Override）以及super关键字的使用，理解子类
 * 如何复用并扩展父类的方法逻辑。
 * 需求描述
 * 模拟简历信息。
 * 1.定义一个Person类，有姓名(name）、年龄(age）、住址
 * (address)属性。
 * 2.在Person类中定义一个编写经历的方法write(经历)。
 * 3.在Person中定义一个info方法，输出各项属性。
 * 4.编写student类继承Person，重写write方法，在write中调
 * 用info方法，展示信息，并打印：“学生上学经历"。
 * 5.编写Teacher类继承Person，重写write方法，在write中调
 * 用info方法，展示信息，并打印：“老师授课经历"。
 * 实现提示
 * 1.方法重写：子类中的write方法签名必须与父类一致。
 * 2.逻辑复用：在子类的write方法内部，先调用this.info（
 * （或super.info（））来打印基本信息，然后再打印各自特定的
 * 经历描述。
 * 3.多态基础：这种结构为后续学习多态（父类引用指向子类对
 * 象）打下基础。
 */

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("老王",33,"郑州");
        t1.write();
        System.out.println(t1);

        Student s1 = new Student("小李",18,"深圳");
        s1.write();
        System.out.println(s1);
    }
}
