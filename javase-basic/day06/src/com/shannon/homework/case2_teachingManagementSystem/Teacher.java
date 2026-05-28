package com.yanxiao.homework.case2_teachingManagementSystem;

public class Teacher extends Person{
    private String DiscipLine;//学科

    public Teacher() {
    }

    public Teacher(String name, int age, String discipLine) {
        super(name, age);
        this.DiscipLine = discipLine;
    }

    public String getDiscipLine() {
        return DiscipLine;
    }

    public void setDiscipLine(String discipLine) {
        DiscipLine = discipLine;
    }

    public void teaching(){
        System.out.println("讲课~");
    }

    @Override
    public String toString() {
        return super.toString()+getDiscipLine();
    }
}
