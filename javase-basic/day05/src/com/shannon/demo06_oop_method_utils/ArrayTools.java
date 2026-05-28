package com.yanxiao.demo06_oop_method_utils;

/**
 * 工具类：包含实现特定功能的方法
 *       直接提供给其他类使用，被所有对象共享
 *       随着类的加载而加载，优先于对象存在
 * static 修饰方法：
 *          好处：
 *          1.方便调用方法：直接使用  类名.方法名
 *          2.提高性能：（不用创建对象，不用开辟对象内存空间，性能低。）
 *  注意事项：
 *      静态方法只能访问静态成员，不能使用this关键字
 */
public class ArrayTools {

    public static int max(int[] arr) {
        //举例：功能实现省略
        return 100;
    }

    public static int min(int[] arr) {
        //举例：功能实现省略
        return 200;
    }

    public static void print(int[] arr) {
        //举例：功能实现省略
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"");
        }
    }
}

