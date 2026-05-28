package com.yanxiao.demo04_array_define_dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {

        //需求：存储用户键盘录入的5个艺人
        //1.动态初始化方式，创建大小为5的字符串数据
        String [] names = new String[5];

        //2.导入键盘扫描器
        Scanner sc = new Scanner(System.in);

        //3.循环提示：接收输入的艺人名称，并存储到动态数组中
        for (int i = 0; i <names.length; i++) {
            System.out.println("请输入第" + (i+1) + "个艺人名称：");
            String name = sc.next();

            //4.存储到数组中
            names[i] = name;
        }
        //5.打印：使用Arrays.toString (核心类库)
        System.out.println(Arrays.toString(names));

    }
}
