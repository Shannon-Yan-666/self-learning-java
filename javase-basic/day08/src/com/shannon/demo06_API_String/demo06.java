package com.yanxiao.demo6_API_String;

/**
 * 目标：了解String类的特点
 *      掌握字符串对象创建的方式
 *      方式一：字面量的方式，推荐，简洁+高效+节省内存资源
 *      底层原理：在堆内存中的字符串常量池中创建此字符串对象
 *              字符串常量池中相同的字符串对象，只维护一个
 *           String str1 = "XXX";
 *           String str2 = "XXX";
 *           (str1 == str2) ture
 *
 *      方式二：构造方法方式，不推荐，繁琐+低效
 *      底层原理：在堆内存中创建此字符串对象
 *              每调用一次构造方法，就开辟一块新的内存空间
 *           String srt = new String()
 *           String srt = new String(String str)  new开辟一块空间，参数（常量）又开辟一块空间，共开辟两块空间，低效。
 *           String srt = new String(char[] cs)
 */
public class demo06 {
    public static void main(String[] args) {
        //特点1：程序中书写的所有字符串字面量都是一个字符串对象
        String name = "Film";//字符串对象

        //特点2：字符串不可修改
//        name.set();
//        name.update();
//        name.modify();
        name = "lisi" ;//注意：只是修改了name变量中储存的地址值，本身字符串数据并没有修改

        //特点3：字符串可以共享使用，字符串存在常量池中
        //方式一：（推荐方式一）
        String str1 = "阿笑";
        String str2 = "阿笑"; //没有创建新的字符串对象，地址可以被共享
        //验证特点3：
        System.out.println(str1 == str2);

        //方式二：构造方法方式
        String str5 = new String();

        String str4 = new String("阿哭");//开辟两块空间

        char[] cs = {'a','b','c'};
        String str3 = new String(cs);
        System.out.println(str3);

        //面试、笔试题
        String s1 = "abc";
        String s2 = "a"+"b"+"c";
        String s3 = s1 +"c";
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//flase
    }
}
