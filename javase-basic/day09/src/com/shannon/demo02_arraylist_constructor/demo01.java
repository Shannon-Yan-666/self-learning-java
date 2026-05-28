package com.yanxiao.demo02_arraylist_constructor;

import java.util.ArrayList;

/**
 *  目标：掌握ArrayList集合的创建方式
 *  构造方法：
 *      ArrayList() :创建初始容量为10的容器。（推荐使用）
 *      ArrayList(int size) :创建初始容量为指定大小的容器。
 *
 *      推荐指定类型创建集合，更严谨合理：
 *      ArrayList<类型>  ArrayList<类型>() :创建初始容量为10的容器。（推荐使用）
 *      ArrayList<类型>  ArrayList<类型>(int size) :创建初始容量为指定大小的容器。
 *
 *  集合特点：
 *      长度不固定，想存多少存多少
 *      存储的数据类型不限
 *      限定类型（给容器贴上泛型标签）
 *      泛型集合中的泛型类型，不允许使用基本数据类型，可以使用基本数据类型的包装类：
 *          byte   ---  Byte
 *          short  ---  Short
 *          int    ---  Integer （特殊）
 *          long   ---  Long
 *
 *          float  --- Float
 *          double --- Double
 *
 *          char    ---  Character （特殊）
 *          boolean ---  Boolean
 */
public class demo01 {

    public static void main(String[] args) {
        //需求1：创建容器存储一批用户名
        ArrayList list1 = new ArrayList();  //创建初始容器为10的容器（推荐使用无参）

        for (int i = 0; i < 20; i++) {
            list1.add("张三");
            list1.add("张三");
            list1.add("李四");
            list1.add("王五");
            list1.add("赵六");
            list1.add("张三");
        }

        list1.add(666);
        list1.add(true);
        list1.add('女');
        list1.add(new Cat());//可以存一个对象

        list1.set(0,"");//修改索引位置的内容
        list1.get(1);//获取索引位置的内容
        list1.remove(0);//删除索引位置的内容
        list1.add("赵六");//删除内容
        list1.add(3,"小七");//添加到索引位置

        System.out.println(list1.toString());//默认带toString


        //需求2：创建容器存储一批用户名（只存储文本字符串数据）
        ArrayList<String> namelist = new ArrayList<String>();
        namelist.add("Film");
        System.out.println(namelist);

        //需求3：创建容器存储一批基本数据类型的数据，使用基本数据类型的包装类
        ArrayList<Integer>agelist = new ArrayList<Integer>();
        agelist.add(18);
        agelist.add(22);
        for (int i = 0; i < agelist.size(); i++) {
            System.out.println(i+":"+agelist.get(i));
        }

    }
}

class Cat {}