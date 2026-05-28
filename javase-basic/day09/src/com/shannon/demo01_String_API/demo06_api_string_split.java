package com.yanxiao.demo01_String_API;

/**
 * 目标：掌握字符串切割方法
 * 方法：
 *      String []  split(String 切割符)
 *      切割多份，使用String数组接收返回值
 *
 *  常用String API(多看手册：看参数怎么传，有没有响应结果)：
 *      public boolean equals方法（要比较的字符串)： 比较内容
 *      public boolean equalsIgnoreCase（要比较的字符串）：比较内容，忽略大小写
 *      public char[ ]  toCharArray()  将字符串转换为字符数组
 *      public char chatAt (int index) 根据索引找字符
 *      public int length() 返回字符串的长度
 *      public String substring(int beginIndex) 截取到末尾
 *      public String substring(int beginIndex, int endIndex) 根据开始和结束索引做截取，包含头不包含尾
 *      public String replace  (旧值，新值) 替换
 *      public String[l split(String regex)  切割
 */
public class demo06_api_string_split {
    public static void main(String[] args) {
        //需求：从网络上爬取一批用户账号，截取出每个账户
        String netUsernames = "zhangsan0301,hanmeimei520,wangwu@99";

        String[] usernames = netUsernames.split(",");
        for (int i = 0; i < usernames.length; i++) {
            System.out.println(usernames[i]);
        }
    }
}
