package com.yanxiao.HomeStudy.demo3;

import java.util.ArrayList;

/**
 * 2. **设计一个简单的学生管理系统**（20分）
 *    1. 设计一个 `Student` 类，并生成相应的空参、满参构造方法，`get/set`方法。
 *    私有成员变量：
 *    学号 `id`（`String`类型），
 *    姓名 `name`（`String`类型），
 *    成绩 `score`（`int`类型），
 *    2. 定义测试类 StudentTest在 main方法中完成以下要求：
 *       - 创建三个 `Student` 对象，分别为:
 *       ("S001", "张三", 85),
 *       ("S002", "李四", 92),
 *       ("S003", "王五", 78)。
 *       - 将以上3个对象添加到 `ArrayList` 集合中。
 *       - 遍历集合，将成绩大于80的学生的所有属性值打印到控制台上。
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();


        Student s1 = new Student("S001", "张三", 85);
        Student s2 = new Student("S002", "李四", 92);
        Student s3 = new Student("S003", "王五", 78);

        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);

        System.out.println(studentArrayList);

        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getScore()>80) {
                System.out.println("成绩大于80分的同学,第"+ (i+1) +"个"+ studentArrayList.get(i));
            }
        }
    }
}
