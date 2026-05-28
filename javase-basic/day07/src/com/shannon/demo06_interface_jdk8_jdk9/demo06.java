package com.yanxiao.demo06_interface_jdk8_jdk9;

/**
 * 目标：了解jdk8/jdk9 接口的新特性
 * 接口的新特性：
 *          JDK8 ：默认方法 default / 静态方法 static
 *                对接口进行功能增强
 *          JDK9 ：私有方法 private
 *                供接口内部方法的调用
 */
public class demo06 {
    public static void main(String[] args) {

        A a = new A();
        a.fly();//调用抽象方法
        a.run();//调用默认方法
        ISkill.rap();//调用静态方法
    }
}

//接口1
interface ISkill{

    //定义抽象方法，无方法体（必须被重写）
    void fly();

    //定义默认方法
    //特点：有方法体，可以调用（不要求必须重写），可以被实现类重写
    //临时添加的默认方法，不影响实现类（不需要所有实现类都重写新增方法）
    default void run(){
        System.out.println("默认方法：跑两步");
        // 调用接口中的私有方法（简化接口内的重复代码）
        // private私有化，防止外部调用，只允许接口的内部方法调用
        log();
    }

    //特点：有方法体，可以被实现类重写，public可以省略，只能使用接口名称直接访问
    static void rap(){
        System.out.println("静态方法");
    }

    // 私有方法体：防止外部调用，只允许接口的内部方法调用
    private void log(){
        System.out.println("私有方法");
    }
}

//接口2
// 与ISkill  存在相同的默认方法，那当前类就必须重写默认方法
interface ISkill2{
    default void run(){}
}

//实现类
class A implements ISkill,ISkill2{
    // 与ISkill  存在相同的默认方法，那当前类就必须重写默认方法
    @Override
    public void run() {
        ISkill.super.run();
    }

    // 抽象方法
    @Override
    public void fly() {

    }
}

//实现类
class B implements ISkill{
    @Override
    public void fly() {

    }
}

//实现类
class C implements ISkill{
    @Override
    public void fly() {

    }
}

