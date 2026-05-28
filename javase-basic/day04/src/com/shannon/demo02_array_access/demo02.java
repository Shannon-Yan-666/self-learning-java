package com.yanxiao.demo02_array_access;
/**
 *  目标：掌握数组中数据访问的方式
 *  语法：
 *          数组内存位置  + 座位号/位置
 *            数据名称   + [索引]
 *
 *  索引(角标/下标)：获取数组中，每一个元素
 *                索引从 0 开始 ，逐个 +1
 */
public class demo02 {
    public static void main(String[] args) {
        //需求1：定义一个存储多个用户姓名的数组
        String [] names = {"宝强", "乃亮", "羽凡"};
        //访问/获取/查询数组中的数据
        System.out.println(names[0]); //最小索引：0
        System.out.println(names[1]);
        System.out.println(names[2]); //最大索引：长度 - 1


        int [] ages = {18 , 19 , 20 , 21};
        //     地址@     0    1    2    3
        System.out.println(ages[1]);//修改前
        //修改数组中的数据
        ages[1] = 25;
        System.out.println(ages[1]);//修改后

        //获取数组容器长度
        System.out.println(names.length);
        System.out.println(ages.length);




    }
}
