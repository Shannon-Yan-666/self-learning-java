package com.yanxiao.demo03_interface;

/**
 *  目标：掌握接口的定义和基本使用
 *  语法：
 *      pubilc interface 接口名称{ }
 *
 *  特点：
 *      接口是不能创建对象的，是提供给别人遵循的规则
 *
 *  使用场景：被类事项 implements
 *      public  子类  implements  接口{
 *
 *      }
 *  注意：
 *      实现类实现了接口，一定要重写接口中的所有抽象方法，除非当前实现类也是抽象类
 *
 */
public class Demo04 {
    public static void main(String[] args) {
        //接口不能创建对象

        //创建实现类对象
        Mouse mouse = new Mouse();

        //调用接口已经制定的规则，实现类重写后的方法
        mouse.con();
        mouse.disCon();
    }
}
