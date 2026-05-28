package com.yanxiao.demo05_project.pojo_shiti;

/**
 * 猫实体类：
 *      存储小猫数据的类
 *      1.私有属性（开辟内存资源，存储小猫属性）
 *      2.构造方法（方便创建小猫对象）
 *      3.get/set方法（方便操作小猫属性的）
 *      4.toString方法（方便查看小猫对象数据）
 */
public class Cat {
    private String id; //编号
    private String name; //名字
    private int age; //年龄

    public Cat() {
    }

    public Cat(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
