package com.yanxiao.homework.case6_gameCharacterBattleSystem;

public class Mage extends GameCharacter {
    private String magicType;

    public Mage() {
    }

    public Mage(String name, int level, double hp, String magicType) {
        super(name, level, hp);
        this.magicType = magicType;
    }

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("师吟唱咒语~ 释放"+ magicType +"魔法！！~");
    }

    @Override
    public String toString() {
        return super.toString()+getMagicType();
    }

    public void  heal(){
        System.out.println("正在饮用魔法药水恢复生命"+(getHp()+0.1));
    }
}
