package com.yanxiao.demo04_array_define_dynamic;
import java.util.Arrays;
/**
 *  目标：掌握创建动态数组的方式
 *  动态态创建语法：
 *              数据类型[]  数组名称 = new 数据类型[大小/长度/容量];
 *
 *  使用场景：
 *          动态：不确定存储的具体数据
 *          静态：确定存储的具体数据
 *
 *  特点：
 *      动态：手动指定数据长度，系统自动提供默认值
 *      静态：手动指定存储数据，系统自动计算数组长度
 */
public class demo04 {
    public static void main(String[] args) {
        //需求1：定义一个存储多个用户姓名的数组
        String [] names = new String[5];
        //需求2：定义一个容器，存储多个用户学生年纪的数组
        int [] ages = new int[5];
        //需求3：定义一个容器，存储多个用户考生分数的数组
        double [] scores = new double[5];
        //需求4：定义一个容器，存储多个员工性别的数组
        char genders [] = new char[20];
        //需求5：定义一个容器，存储员工是否单身的数组
        boolean isSingleDog [] = new boolean[9];

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(ages));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(genders));
        System.out.println(Arrays.toString(isSingleDog));
    }
}
