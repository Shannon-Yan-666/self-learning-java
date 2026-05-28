package com.yanxiao.homework;

/**
 * 练习六
 * 训练目标：掌握Java中static的使用
 * 需求背景：日常工作中，某些对象的成员变量是共享的变量，所以
 * 此时我们可以考虑将这些共享变量用static将其修饰，以方便开
 * 发。
 * 需求描述：国内某学习管理系统，需要对学生数据(属性：学号、姓
 * 名、年龄、性别、手机、邮箱、国籍)进行增删改查操作，操作的学
 * 生都是国内学生。请根据学生属性，自定义学生类，并思考学生属
 * 性中有哪些属性可以使用static修饰。并在测试类中，创建多名学
 */
public class StaticField {
    private String id;
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String email;
    private static String nationality;//国籍 成员共享数据

    public StaticField() {
    }

    public StaticField(String id, String name, int age, char gender, String phone, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        StaticField.nationality = nationality;
    }
}
