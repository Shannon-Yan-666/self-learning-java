package com.yanxiao.homework.case2_teachingManagementSystem;

public class Student extends Person{
    private double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void examination(){
        System.out.println("考试~");
    }

    @Override
    public String toString() {
        return super.toString()+getScore();
    }
}
