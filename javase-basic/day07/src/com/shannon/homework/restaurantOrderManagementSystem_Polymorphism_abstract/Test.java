package com.yanxiao.homework.restaurantOrderManagementSystem_Polymorphism_abstract;

/**
 *### 作业二：餐厅点餐系统（父类：抽象类  +  服务方法：多态应用）
 *
 * **训练目标**：掌握父类引用指向子类对象
 * **需求背景**：模拟餐厅服务员为顾客上菜的过程，服务员不需要知道具体菜名，只需要知道这是一道“菜”。
 * **具体要求**：
 *
 * - 父类：Dish（菜肴）
 *   - 属性：菜名(name)
 *   - 方法：`cook()`（烹饪，输出“正在烹饪\[菜名]...”）
 * - 子类：Burger（汉堡）
 *   - 重写：`cook()`（输出“🍔 正在制作美味的汉堡”）
 * - 子类：Pasta（意面）
 *   - 重写：`cook()`（输出“🍝 正在煮意面”）
 * - 服务员类：Waiter
 *   - 方法：serve(**Dish** dish)（参数为父类类型）
 *     - 逻辑：调用 `dish.cook()`，然后输出“服务员为您上菜：\[dish.getName()]”
 * - **测试**：在测试类中，分别创建汉堡和意面对象，作为参数传递给同一个服务员对象的 `serve` 方法。
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建一个服务员的对象
        Waiter w1 = new Waiter();
        //传参：对象.调用自己的方法，传参子类对象（子类对象是谁，就会执行谁的方法）
        w1.serve(new Burger("巨无霸"));

        System.out.println("===================");
        //创建一个服务员的对象
        Waiter w2 = new Waiter();
        //传参：对象.调用自己的方法，传参子类对象（子类对象是谁，就会执行谁的方法）
        w2.serve(new Pasta("海鲜面"));

    }
}
