package com.yanxiao.demo02_abstract_model;
//父类

/**
 * 目标：了解模板方法设计模式
 * 设计模式：
 *      1.设计模式解决什么问题
 *          方法内重复代码书写
 *      2.了解编码步骤
 *          1）编写抽象模板类
 *          2）编写模板方法（使用final关键字，可以避免被子类重写）
 *              a.定义公共的步骤/操作/流程
 *              b.不确定的步骤/操作/流程，调用抽象方法（可以被重写）
 *          3）编写抽象方法
 *              3.1定义不确定的操作b，交给子类重写
 *
 */

//1.编写抽象模板类
public abstract class MakeDrink {

    //2.编写模板方法(增加final关键字，定义模板，不能被重写)--确定的部分
    public final void make(){
        System.out.println("1.烧水，100度...");
        //3.1模板内部，可以调用抽象方法，供子类重写。---不确定的部分
        drinktype();
        System.out.println("3.搅拌...");
        System.out.println("4.沉淀...");

    }
    // 3.需要重写的抽象方法---不确定的部分
    public abstract void drinktype();
}
