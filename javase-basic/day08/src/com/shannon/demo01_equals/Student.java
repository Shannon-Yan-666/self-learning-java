package com.yanxiao.demo1_equals;

import java.util.Objects;

class Student {
    private String name;
    private int age;

//    @Override
//    public boolean equals(Object obj) {
//        //1.判断极端情况，俩对象是同一个对象
//        if(this == obj){
//            return true;
//        }
//
//        //2.判断极端情况2，两个都不是同一个种类
//        //class 图纸
//        if(this.getClass()!=obj.getClass()){
//            return false;
//        }
//
//        //3.强制将待比较的对象转换为当前类型
//        Student stu = (Student)obj;
//
//        //4.比较数据是否相同
//        boolean result = (this.age == stu.age) && (this.name.equals(stu.name));
//        return result;
//    }

    // 重写，快捷生成equals方法：alt + insert +equals and hashcode
    // 一顿点-->next
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    //暂时用不到 hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
