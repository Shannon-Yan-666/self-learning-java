package com.yanxiao.homework.case6_gameCharacterBattleSystem;

public class GameCharacter {
    private String name;
    private int level;
    private double hp;

    public GameCharacter() {
    }

    public GameCharacter(String name, int level, double hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void attack(){
        hp -= 0.1;
        System.out.println(getName()+"，被揍，掉血...HP: " + getHp());
    }

    public void move(){
        System.out.println(getName() + "正在移动...");
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}
