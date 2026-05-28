package com.yanxiao.demo05_project.service_yewu;

import com.yanxiao.demo05_project.pojo_shiti.Cat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 小猫业务类：提供操作和管理所有猫的业务功能方法、
 *          添加小猫：aadCat()
 *          删除小猫：deleteCat()
 *          修改小猫：updateCat()
 *       查询所有小猫：queryALLCat()
 *       查询指定小猫：queryOneCat()
 *
 */
public class CatService {
    //创建键盘扫描器，类调用
    Scanner sc = new Scanner(System.in);

    //存储所有管理的小猫数据容器/集合
    ArrayList<Cat> cats = new ArrayList<Cat>();

    //提供所有业务功能的方法
    public void  start(){
        //快捷键：ctrl+alt+ T
        //选中方法体，用while包裹
        while (true) {
            System.out.println("==欢迎使用小猫管理系统==");
            System.out.println("1.添加小猫");
            System.out.println("2.删除小猫");
            System.out.println("3.修改小猫");
            System.out.println("4.查询所有小猫");
            System.out.println("5.查询指定小猫");
            System.out.println("6.退出系统");
            System.out.println("请选择：");
            //接收键盘扫描器数据
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    addCat();
                    break;
                case 2:
                    deleteCat();
                    break;
                case 3:
                    updateCat();
                    break;
                case 4:
                    queryALLCat();
                    break;
                case 5:
                    queryOneCat();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("输入无效");
            }
        }
    }

    public void addCat() {
        System.out.println("add cat");
        System.out.println("请输入小猫的编号：");
        String id = sc.next();
        System.out.println("请输入小猫的姓名：");
        String name = sc.next();
        System.out.println("请输入小猫的年龄：");
        int age = sc.nextInt();

        //创建一个小猫实体类对象
        Cat cat = new Cat(id,name,age);
        //添加到集合中
        cats.add(cat);
    }

    public void deleteCat() {
        System.out.println("delete cat");
        System.out.println("请输入小猫的编号：");
        String id = sc.next();
        for (int i = 0; i < cats.size(); i++) {
            String user_catId = cats.get(i).getId();
            if (user_catId.equals(id)) {
                cats.remove(i);
                i--;
            }
        }
        System.out.println("删除成功~");
    }

    public void updateCat() {
        System.out.println("update cat");
    }

    public void queryALLCat() {
        System.out.println("queryALL cat");
        for (int i = 0; i < cats.size(); i++) {
            Cat cat = cats.get(i);
            System.out.println("id:" + cat.getId());
            System.out.println("name:" + cat.getName());
            System.out.println("age:" + cat.getAge());
        }
    }

    public void queryOneCat() {
        System.out.println("queryOne cat");
    }
}
