package com.yanxiao.homework.Car_interface;
/**
 * ### 作业四：机动车与GPS接口（接口应用）
 * #### 训练目标
 * 理解接口在解决“非继承关系的类具有相同功能”这一场景下的优势（即“扩展功能”），掌握继承与接口的混合使用。
 *
 * #### 需求描述
 * 一个机动车管理系统中有以下类的设计：
 *
 * - 机动车类：Car
 *   - 奔驰车
 *   - 宝马车
 *   - 雅马哈摩托
 *   - 宝马摩托
 * - 所有车都有如下信息：
 *   - 属性：品牌、价格
 *   - 行为：运行
 * - **特殊需求：** 现在要求为所有“宝马车系”的汽车增加一个GPS功能。
 *
 * #### 实现提示
 * 1. **父类设计：** 定义一个`Car`父类，包含`brand`（品牌）和`price`（价格）属性，以及`run()`方法。
 * 2. **接口设计：** 定义一个`GPS`接口，包含`gps()`方法。
 * 3. **类继承：** `Benz`、`BMW`、`YamahaMotor`、`BMWMotor`都继承`Car`类。
 * 4. **接口实现：** 只有`BMW`（宝马车）和`BMWMotor`（宝马摩托）实现`GPS`接口。雅马哈摩托和奔驰车不实现该接口。
 * 5. **设计思想：** 继承代表“是什么”（Is-a），接口代表“有某种能力”（Can-do）。宝马车系不仅有车的特性，还有GPS的能力。
 */
public class Test {
    public static void main(String[] args) {
        Benz benz = new Benz("奔驰",9999.9);
        benz.run();

        YamahaMotor motor = new YamahaMotor("雅马哈",6666.6);
        motor.run();

        BMWMotor b1 = new BMWMotor("宝马摩托车",8888.8);
        b1.run();
        b1.gps();

        BMW b2 = new BMW("宝马汽车",2222.2);
        b2.run();
        b2.gps();

    }
}
