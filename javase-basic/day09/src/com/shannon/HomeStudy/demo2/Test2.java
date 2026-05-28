package com.yanxiao.HomeStudy.demo2;

/**
 * 1. **设计一个简单的动物叫声系统**（20分）
 *    - 构建一个抽象类 `Animal`，其中包含抽象方法 `makeSound()` 用于发出叫声。
 *    该类还有属性 `name` 表示动物名称，`age` 表示动物年龄。
 *
 *    - 创建 Dog（狗）、Cat（猫）和 Bird（鸟）类，它们都继承自 Animal类。
 *      - `Dog` 类实现 `makeSound()` 方法，输出“[动物名称] 汪汪叫”。
 *      - `Cat` 类实现 `makeSound()` 方法，输出“[动物名称] 喵喵叫”。
 *      - `Bird` 类实现 `makeSound()` 方法，输出“[动物名称] 叽叽喳喳叫”。
 *
 *    - 在 `Main` 类的 `main` 方法中，创建 `Dog`、`Cat` 和 `Bird` 对象，
 *    调用每个动物的 `makeSound()` 方法并输出结果。
 */
public class Test2 {
    public static void main(String[] args) {
        Animal a1 = new Dog("NamTan",2);
        a1.makeSound();
        System.out.println(a1);

        Animal a2 = new Cat("Film",1);
        a2.makeSound();
        System.out.println(a2);

        Animal a3 = new Bird("蓝莓",1);
        a3.makeSound();
        System.out.println(a3);
    }
}
