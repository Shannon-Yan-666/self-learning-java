package com.yanxiao.homework.Animal_Polymorphism;

/**
 * ### 作业一：动物多态（抽象类+多态+类型转换）
 *
 * #### 训练目标
 *
 * 深入理解多态的创建方式（父类引用指向子类对象），掌握`instanceof`关键字在运行时的类型判断作用，以及熟练使用向下转型调用子类特有方法。
 *
 * #### 需求描述
 *
 * 1. **定义父类：** `Animal`抽象类，包含`name`（名字）、`weight`（体重）属性，以及一个抽象的`eat()`方法。
 * 2. 定义子类：
 *    - `Dog`类：继承`Animal`，重写`eat()`方法（输出“狗吃骨头”），定义特有方法`lookHome()`（输出“老老实实看家”）。
 *    - `Cat`类：继承`Animal`，重写`eat()`方法（输出“猫吃鱼”），定义特有方法`catchMouse()`（输出“努力抓老鼠”）。
 * 3. 测试要求：
 *    - 使用多态形式（`Animal a = new Dog()`）创建对象。
 *    - 调用`eat()`方法。
 *    - 使用`instanceof`判断对象具体类型，进行向下转型，并调用各自的特有方法。
 *
 * #### 实现提示
 *
 * 1. **抽象类设计：** `Animal`类不能直接实例化，必须通过子类实现。属性建议使用`protected`或`private`（配合构造方法）。
 * 2. **构造方法：** 子类构造方法中需要使用`super(name, weight)`将属性传递给父类初始化。
 * 3. **多态调用：** 当使用`Animal`引用调用`eat()`时，执行的是子类重写后的版本。
 * 4. 向下转型逻辑：
 *    - 直接强转（如`(Dog)animal`）如果对象实际不是Dog，会报`ClassCastException`。
 *    - 必须先判断：`if (animal instanceof Dog)`，确认类型后再转型调用特有方法。
 *
 */
public class Test {
    public static void main(String[] args) {
        //对象多态：创建小猫对象
        Animal a1 = new Cat(50.5, "Film");
        //行为多态：调用小猫重写的eat方法
        a1.eat();
        System.out.println(a1);

        //instanceof 类型判断，a1是否为Cat类，如果是则执行if内方法体。
        if (a1 instanceof Cat) {
            //调用子类独有方法:
            //向下转型：a1动物类强转为Cat猫类
            ((Cat)a1).catchMouse();
        }

        System.out.println("=================");
        //对象多态：创建小狗对象
        Animal a2 = new Dog(55.5, "Namtan");
        //行为多态：调用小狗重写的eat方法
        a2.eat();
        System.out.println(a2);

        //instanceof 类型判断，a2是否为Dog类，如果是则执行if内方法体。
        if (a2 instanceof Dog) {
            //调用子类独有方法:
            //向下转型：a1动物类强转为Dog猫类
            ((Dog)a2).lookHome();
        }
    }
}
