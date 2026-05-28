package com.yanxiao.demo03_api_arraylist_methos;
import java.util.ArrayList;
/**
 *  目标：掌握ArrayList集合常用方法
 *  方法：
 *      增加数据：
 *            boolean add(E类型  data数据);  向集合末尾添加数据
 *            void    add(int index索引 , data数据);  向指定位置添加数据
 *      删除数据：
 *           E        remove(int index索引);  删除指定位置的数据，把数据返回给你（返回需要就接，不需要可以不接）
 *           boolean  remove(Object data数据);  删除指定数据，返回删除结果（是否成功）（返回需要就接，不需要可以不接）
 *      修改数据：
 *           E        set(int index索引 , data修改数据); 修改指定位置数据，返回被修改的数据（返回需要就接，不需要可以不接）
 *      查询数据：
 *           E        get(int index索引);  获取指定位置的数据
 *           int      size(); 获取容器中数据个数
 */
public class demo01 {
    public static void main(String[] args) {
        //创建空集合，存储多个用户的姓名
        ArrayList <String> namelist = new ArrayList();

        //1.添加数据：add
        namelist.add("Film");  //0
        namelist.add("南丹");   //1
        namelist.add("蓝莓");   //2
        namelist.add("山药");   //3

        System.out.println(namelist);

        //向指定位置添加数据：小景添加到南丹后
        namelist.add(2,"小景");
        System.out.println(namelist);

        //2.删除数据：remove
        //根据位置，删除小景，返回数据
        System.out.println(namelist.remove(2));
        //根据数据（内容），删除山药，返回结果
        System.out.println(namelist.remove("山药"));

        //3.修改数据：set
        //根据位置，修改南丹，改为阿笑，返回数据
        System.out.println(namelist.set(1, "笑"));
        System.out.println(namelist);

        //4.查询数据：get/size
        //获取当前集合中，元素的个数，接收返回结果
        System.out.println(namelist.size());
        //获取当前集合中，第3个数据，接收返回结果
        System.out.println(namelist.get(0));
    }
}
