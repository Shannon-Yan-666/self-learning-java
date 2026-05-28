package demo07_system_api;

import java.util.Arrays;

/**
 *  System是系统相关的方法
 *              方法名                                                           说明
 * public static void exit(int status)                                  终止当前运行的Java虚拟机
 * public static long currentTimeMillis()                             返回当前系统的时间毫秒值形式
 * public static void arraycopy (数据源数组，起始索引，目的地数组，起始索引，拷贝个数)   拷贝数组
 *
 * 时间原点：1970年1月1日  8：00
 * 1秒 = 1000毫秒
 *
 */

public class demo01_System_api_method {
    public static void main(String[] args) {

        //exit(int status) 方法形参
        //状态码：
        //      0 ：表示当前虚拟机是正常停止
        //     非0 ：表示当前虚拟机异常停止
//        System.exit(0); // 终止当前运行的Java虚拟机

        //currentTimeMillis()
        long l = System.currentTimeMillis();//返回当前系统的时间毫秒值形式
        System.out.println(l);

        //arraycopy (数据源数组，起始索引，目的地数组，起始索引，拷贝个数)
        //拷贝数组：
        // 1.基本类型的数组，两个数组类型需保持一致；
        // 2.引用类型的数组，子类类型可以赋值给父类类型（需强转）；
        // 3.数组长度需要考虑，避免超出范围报错。
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));

    }
}
