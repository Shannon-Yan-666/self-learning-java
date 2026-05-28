package com.yanxiao.homework.restaurantOrderManagementSystem_Polymorphism_abstract;
/**
 * 服务员类
 * 设计一个功能更强大的方法接收-->父类类型（实现对象多态/行为多态）
 */
public class Waiter {
    //定义一个能上菜方法，供上层调用，不用菜名是什么
            //对象多态：可以接收所有子类对象
            //形参接收父类实现对象多态
            // 向上转型：父接子（自动进行向上类型转换）
    public void serve(Dish dish){
        //使用父类变量调用方法，执行对应子类的方法
        //行为多态：可以表现多种不同的行为
        dish.cook();
        System.out.println("服务员为您上菜："+dish.getName());
    }
}
