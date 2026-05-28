package com.yanxiao.demo06_array_array;

/**
 * 目标：了解二维数组的创建方式和数据访问方式
 * 语法：
 *      数据类型[][]  数组名称 = {}
 *      数据类型[][]  数组名称 = new 数据类型 [] [] {}
 *
 *      数据类型[][]  数组名称 = new 数据类型 [] []
 *
 */
public class demo06 {
    public static void main(String[] args) {
        //1.创建二维数组，静态初始化
        int[][] ages = {
                {18 , 28 , 30},
                {22 , 24 , 25}
        };

        int [][] ages2 = new int[][]{{1,2,3},{4,5,6}};

        //2.创建二维数组，动态初始化
        String[][] names = new String[2][2];

        //3.访问二维数组        [外层][内层]
        System.out.println(ages[0][2]);
        System.out.println();

        //4.遍历二维数组
        //遍历获取每一个一维数组
        // 快捷方式：数组名称.fori 回车
        for (int i = 0; i < ages2.length; i++) {
            System.out.println(ages2[i]);//打印一维数组地址

            //通过一维数组地址，继续遍历数组内的元素
            //数组名称[i].fori 回车
            for (int j = 0; j < ages2[i].length; j++) {
                //                 一维数组 元素索引/下标
                System.out.println(ages2[i][j]);//打印数组内容
            }
            System.out.println();
        }
    }
}
