package com.yanxiao.demo01_String_API;

import java.util.Scanner;

/**
 *  目标：掌握字符串替换方法
 *  方法：
 *      String replace(String old, String new)
 *      String replace(旧值，新值) 替换注意点：返回值才是替换之后的结果,需要接返回值
 */
public class demo05_api_string_replace {
    public static void main(String[] args) {

        //需求：替换字符串文本数据中指定的内容，将大爷替换成***
        String msg = "你大爷的，你大爷，大娘，最近身体好吗？";
        String newMsg = msg.replace("大爷", "**");
        System.out.println(newMsg);

        //需求：聊天内容脱敏处理
        // 键盘录入一个字符串，如果字符串中包含（TMD），则使用 *** 替换
        //1.创建键盘扫描器
        Scanner sc = new Scanner(System.in);
        //2.提示 并 接收用户输入的聊天内容
        System.out.println("队伍：");
        String content = sc.next();
        //3.直接进行脱敏处理
        String newContent = content.replace("TMD", "***");
        //4.展示脱敏后的文本数据
        System.out.println("队伍："+ newContent);
    }
}
