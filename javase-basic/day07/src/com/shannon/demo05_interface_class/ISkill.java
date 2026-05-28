package com.yanxiao.demo05_interface_class;
//4.接口和接口之间的关系:继承关系，可以单继承，也可以多继承
//类只需要实现这一个接口就行，简化一个子类/实现类，同时实现多个接口的场景。方便管理
public interface ISkill extends IRap,IFly,IBaskerball{
}
