package com.yanxiao.demo04_capsulation;

/**
 * 封装： 把猪的对象，进行封装。
 *      将 对象的属性 和 方法，捆绑在一起
 *      通过修饰符来控制 访问权限
 *      合理隐藏、合理暴露。
 */
public class Pig {
    private String name;
    private int age;
    private String gender;
    private double weight;
    public Pig() {
    }

    public Pig(String name, int age, String gender, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void slep() {
        System.out.println("睡觉");
    }

    public void walk() {
        System.out.println("散步");
    }

    public void println() {
        System.out.println(name + age + gender + weight);
    }

}
