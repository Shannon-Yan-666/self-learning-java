package com.yanxiao.demo05_datatype;

/**
 *  目标：掌握java中的常用的数据类型
 *  类型：
 *          引用的数据类型：存储空间没有限制
 *              String
 *          基本的数据类型：8个
 *              整  形： byte   1   short  2   int  4
 *              浮点型： float  4   double 8
 *              字符型： char   1
 *              布尔型：boolean 1
 *
 */
public class demo1 {

    public static void main(String[] args) {
        String Name = "Film";
        int Age = 25;
        char Sex = '女';
        double Weight = 165.5;
        boolean IsSingle = true;


        //问题1：整型字面量是啥类型？
        //结论：默认int类型
        System.out.println(2111111111);
        //书写Long类型字面量：在数据后添加L
        System.out.println(2111111111111111111L);

        //问题2：小数字面量是啥类型？
        //结论：默认double类型
        System.out.println(88.88);
        //书写float类型字面量：在数据后添加F
        System.out.println(88.88F);

        //问题3：计算机只能处理机器语言，只认识0/1，只能存储0/1数据
        //计算机是如何存储数值数据呢？字符数据呢？字符串文本数据呢？图片？声音？视频？

        //整数类型---》二进制0/1（0010010）
        int num = 25;

        //字符数据----》ASCII编码表----》字符对应数值型数据----》二进制θ/1（001001θ)
        char xing = 'a' ;  //97
        System.out.println((int)xing);

        //字符数据----》GBK编码表-------》字符对应数值型数据----》二进制θ/1（0010010）
        char ming = '影';
        System.out.println((int)ming);

        //存储多个字符的过程
        String name = "Film电影";

        //图片数据----》像素点组成----》（255，255，0）字符对应数值型数据----》二进制0/1（0010010）
        //声音数据----》声波（坐标轴）----》（66，88）字符对应数值型数据----》二进制0/1（0010010）
        //视频数据----》图片+声音

    }

}


