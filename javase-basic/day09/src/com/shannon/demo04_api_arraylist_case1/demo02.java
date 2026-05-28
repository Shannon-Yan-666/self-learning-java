package com.yanxiao.demo04_api_arraylist_case1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  目标：掌握集合的遍历操作
 */
public class demo02 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> stulist = new ArrayList();

        // 2.创建学生对象
        Scanner sc = new Scanner(System.in);

        //接收三个学生
        for (int i = 1; i <= 3; i++) {
            //2.1键盘录入并接收学生信息
            System.out.println("请输入第" + i + "个，学生姓名：");
            String stuName = sc.next();
            System.out.println("请输入" + i + "个，学生年龄：");
            int stuAge = sc.nextInt();

            //2.2 创建学生实体类对象，存储学生信息
            // 集合中存的是一个一个的地址
            Student stu = new Student(stuName, stuAge);

            //2.3 添加学生对象，到集合中
            //stu 存的是学生的地址
            stulist.add(stu);
        }

        //3.遍历集合中的所有学生信息
        for (int i = 0; i < stulist.size(); i++) {
            Student stu = stulist.get(i);
            System.out.println(stu);
        }
    }
}
