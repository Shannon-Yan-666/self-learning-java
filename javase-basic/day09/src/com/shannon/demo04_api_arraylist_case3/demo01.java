package com.yanxiao.demo04_api_arraylist_case3;

import java.util.ArrayList;

/**
 *  目标：完成集合案例的筛选案例
 *  需求：定义一个方法，方法接收一个集合对象（泛型为Student）
 * 方法内部将年龄低于18的学生对象找出并存入新集合对象，方法返回新集合
 */
public class demo01 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> stulist = new ArrayList();

        // 2.创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",17);
        Student s3 = new Student("王五",15);
        Student s4 = new Student("赵六",28);
        Student s5 = new Student("田七",10);

        //存储学生信息到集合中
        stulist.add(s1);
        stulist.add(s2);
        stulist.add(s3);
        stulist.add(s4);
        stulist.add(s5);

        ArrayList<Student> newList = filter(stulist);
        System.out.println(newList);
    }

    /**
     * 筛选未成年方法
     * 参数：待筛选的多个学生的集合
     * 返回值：返回筛选后的多个未成年学生集合
     */
    public static ArrayList<Student> filter(ArrayList<Student> stulist) {
        //创建一个新集合，存储筛选后的学生对象
        ArrayList<Student> newlist = new ArrayList();
        //3.遍历集合中的所有学生信息
        for (int i = 0; i < stulist.size(); i++) {
            //遍历到的学生对象，交给一个变量
            Student stu = stulist.get(i);
            //判断学生年龄是否大于18岁
            if (stu.getAge() < 18){
                //如果满足条件，将学生对象添加到新集合中
                newlist.add(stu);
            }
        }
        //有返回值，返回新集合
        return newlist;
    }
}
