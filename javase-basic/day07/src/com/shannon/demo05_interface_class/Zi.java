package com.yanxiao.demo05_interface_class;

//1.类和类之间的关系：继承关系，单继承
//2.类和接口之间的关系：实现关系，单实现/多实现
//3.类可以继承父类的同时，实现多个接口
//4.接口和接口之间的关系，见ISkill
public class Zi extends Fu implements /*IRap,IBaskerball,IFly*/ISkill{
    //遵循接口标准/规则
    @Override
    public void rap() {

    }
    //遵循接口标准/规则
    @Override
    public void baskerball() {

    }
    //遵循接口标准/规则
    @Override
    public void fly() {

    }
}
