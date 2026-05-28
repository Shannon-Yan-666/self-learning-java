package com.yanxiao.homework.case6_gameCharacterBattleSystem;

public class Warrior extends GameCharacter{
    private String weaponName;

    public Warrior() {
    }

    public Warrior(String name, int level, double hp, String weaponName) {
        super(name, level, hp);
        this.weaponName = weaponName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("战士挥舞"+getWeaponName()+"，进行近战攻击！");
    }

    @Override
    public String toString() {
        return super.toString()+getWeaponName();
    }

    public void defend(){
        System.out.println("战士举起盾牌防御！！！");
    }
}
