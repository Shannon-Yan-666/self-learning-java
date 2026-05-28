package com.yanxiao.homework.case6_gameCharacterBattleSystem;

/**
 *游戏角色战斗系统
 * 训练目标：掌握抽象类的使用以及子类特有方法的调用。需求背景：开发一款RPG游戏，游戏中有不同的角色，他们都有攻击行为，
 * 但攻击方式各异。具体要求：
 * ·父类：GameCharacter (游戏角色)
 * o属性：名称(name)、等级(level)、生命值(hp)
 * 构造方法：初始化属性
 * 。方法：attack(） (攻击行为)
 * ○方法：move(）(输出"[name] 正在移动")
 * ）子类：Warrior (战士)
 * o新增属性：武器名称(weaponName)
 * 。重写方法：attack(）（输出"战士挥舞[weaponName] 进行近战攻击！")
 * ○新增方法：defend（）（输出"战士举起盾牌防御")
 * ·子类:Mage (法师)
 * 。新增属性：魔法系(magicType，如火焰、冰霜)
 * 。重写方法：attack(（）（输出"法师吟唱咒语，释放[magicType]魔法！")
 * 。新增方法：heaL(）（输出"法师正在饮用魔法药水恢复生命")
 * ·测试：
 * 。创建战士和法师对象。
 * ○调用attack(）方法。
 *
 */
public class Test {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("狂战天下",10,100,"大锤");
        w1.attack();
        w1.move();
        w1.defend();
        System.out.println(w1);

        System.out.println("=====================");

        Mage m1 = new Mage("轻舞飞扬",12,100,"风暴");
        m1.attack();
        m1.move();
        m1.heal();
        System.out.println(m1);
    }
}
