package com.yanxiao.demo04_api_arraylist_case1;

import java.util.ArrayList;

/**
 *  目标：掌握集合的遍历操作
 */
public class demo01 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> stulist = new ArrayList();

        // 2.创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",19);
        Student s3 = new Student("王五",20);
        //储存学生信息到集合中
        stulist.add(s1);
        stulist.add(s2);
        stulist.add(s3);
        
        //3.遍历集合中的所有学生信息
        for (int i = 0; i < stulist.size(); i++) {
            Student stu = stulist.get(i);
            System.out.println(stu);
        }

    }
}
