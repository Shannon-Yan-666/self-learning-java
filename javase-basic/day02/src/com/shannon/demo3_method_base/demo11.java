package com.yanxiao.demo3_method_base;

/**
 *
 *  目标：掌握带返回值方法的定义和调用
 *  语法：
 *         public static 数据类型 方法(可有可无){
 *             //方法体
 *             return 数据变量名;
 *         }
 *  调用：
 *          数据类型 变量名 = 方法名称(可有可无)
 */
public class demo11 {
    public static void main(String[] args) {

        //调用带返回值的方法：有参传参；有返回值，接返回值。
        int result = sum(1,2);
        System.out.println("求和的结果：" + result);

    }


    public static  int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
