package com.yanxiao.demo01_String_API;

import java.util.Scanner;

public class demo02_api_string_equals_case1 {
    public static void main(String[] args) {
        //登录案例：模拟用户登录
        //需求：已知正确的用户名和密码，请用程序实现模拟用户登录。
        //总共给三次机会，登录之后，给出相应的提示 （3.fori）

        //1.创建字符串对象，存储正确的用户名和密码
        String sysName = "admin";
        String sysPassword = "1234";

        //2.创建键盘扫描器对象
        Scanner sc = new Scanner(System.in);

        for (int i = 3; i > 0; i--) {
            //3.提示用户输入用户名
            System.out.println("请输入您的登录账户：");
            //4.使用键盘扫描器接收用户输入的用户名
            String userName = sc.next();
            //5.提示用户输入密码
            System.out.println("请输入您的登录密码：");
            //6.使用键盘扫描器接收用户输入的密码 userPassword
            String userPassword = sc.next();
            //7.实现用户身份信息验证：字符串文本数据比较
            // （userName 和 sysName） 并且 （userPassword 和 sysPassword）
            if (userName.equalsIgnoreCase(sysName) && userPassword.equalsIgnoreCase(sysPassword)) {
                //如果身份信息验证正确，则登录成功
                System.out.println("登录成功！");
                //登录成功，结束循环
                break;
                //如果身份信息验证不正确，则登录失败。
            } else {
                if( i  > 1 ){
                    System.out.println("登录失败");
                    System.out.println("您还剩余："+ (i-1) +"次登录机会。");}
                else {
                    System.out.println("3次登录机会，您已用完！");
                    //三次登录机会用完，结束循环
                    break;
                }
            }
        }
    }
}
