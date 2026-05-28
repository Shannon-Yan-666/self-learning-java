package com.yanxiao.homework.employee_painting_interface;

/**
 * 员工类：抽象父类
 */
public abstract class employee {
    private String name;//姓名
    private int age;//年龄
   private String gender;//性别

    public employee() {
    }

    public employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void work();
}

