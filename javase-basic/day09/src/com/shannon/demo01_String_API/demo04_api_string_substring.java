package com.yanxiao.demo01_String_API;
import java.util.Scanner;
/**
 *      目标：掌握字符串截取的方法
 *     	方法：
 * 		equals(String   str);  //比较
 * 		equalsIgnoreCase(String  str);//忽略大小写比较
 * 		toCharArray();//转换成字符数组
 * 		charAt(int   i);//根据索引获得字符
 * 		length()；//计算长度
 * 		substring(int  start,  int  end ); //截取字符 （包前不包后）
 * 		substring(int  start);//截取字符  （从指定位置截取到最后）
 * 		replace(String old  , String new);//替换字符
 * 		split(String  ch)//分割字符
 */
public class demo04_api_string_substring {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.length());
        System.out.println(str.substring(0,1));
        System.out.println(str.toCharArray());
        System.out.println(str.replace("b","D"));

        int b = 1;
        while(b++ < 3) {
            System.out.println("loop");
        }

        //需求：完成用户敏感手机号码脱敏
        //1.创建键盘扫描器工具
        Scanner sc = new Scanner(System.in);
        //2.提醒用户输入手机号码
        System.out.println("请输入您的手机号码：");
        //3.接收用户输入的手机号码
        String usrNum = sc.next();
        //4.文本脱敏
        //4.1 截取手机号码前三位：startNum
        String startNum = usrNum.substring(0, 3);
        //4.2 截取手机号码后四位：endNum
        String endNum = usrNum.substring(7);
        //4.3 拼接：startNum + "****" + endNum
        String phone = startNum + "****" + endNum;
        System.out.println("脱敏后的手机号码："+ phone);
    }
}
