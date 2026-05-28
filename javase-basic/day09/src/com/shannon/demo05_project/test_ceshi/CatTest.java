package com.yanxiao.demo05_project.test_ceshi;

import com.yanxiao.demo05_project.service_yewu.CatService;

/**
 * 小猫测试类：启动程序
 *      main方法
 */
public class CatTest {
    public static void main(String[] args) {
        //1.创建业务类对象
        CatService catService = new CatService();

        //2.启动小猫管理系统
        catService.start();
    }
}
