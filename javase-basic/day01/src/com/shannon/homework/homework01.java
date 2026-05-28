package com.yanxiao.homework;

public class homework01 {
    public static void main(String[] args) {
        System.out.println("The harder you try, the Luckier you get");

        //使用程序，分别输出整数字面量，小数字面量，字符字面量，字符串字面量，布尔字面量
        //整数
        int Score    = 20;
        System.out.println(Score);
        //小数
        double Height = 5.2; //小数
        System.out.println(Height);
        //字符
        char  nickName= '我';
        System.out.println(nickName);
        //字符串
        String slogan = "今天的学习，是为了明天更好的自己";
        System.out.println(slogan);
        //布尔
        boolean isExcellent = true;
        System.out.println(isExcellent);

        //创建一个Java程序，在程序中分别输出整数10，小数5.333，字符10,字符串小明，
        //布尔值true以及空常量null。如果程序中出错，请把错误的代码注释掉
        int age = 10;
        System.out.println(age);

        double e =5.333;
        System.out.println(e);

//        char b = '10';
//        System.out.println(b);

        String c ="小明";
        System.out.println(c);

        boolean d = true;
        System.out.println(d);

//        System.out.println(null);

        //定义一个整数变量a，为其赋值为10。输出a的值。让其重新赋值为30，输出其结果
        int a = 10;
        System.out.println(a);
        a = 35;
        System.out.println(a);

        //定义一个整数，代表年龄。年龄的初始值是18，隔了一年，年龄要大一岁。使用程序表示年龄以及他的变化
        int Age = 18;
        System.out.println("去年小明"+Age+"岁,今年"+(Age+1)+"岁。");

        //定义一个变量代表商品的价格。商品一开始价格是300块钱。在控制台输出商品的初始价格。
        // 为了迎接双十一，商品的价格先升价233.50元，输出升价之后的价格。
        // 到了双十一，再降价200块，输出降价之后的价格。使用程序表示价格变化。
        double price = 300;
        System.out.println("开始价格"+price+"元。");
        price +=233.5;
        System.out.println("为了迎接双十一，商品的价格先升价233.50元，输出升价之后的价格"+price+"元。");
        price -=200;
        System.out.println("到了双十一，再降价200块，输出降价之后的价格"+price+"元。");

        // 现在模拟学生信息记录。已知学生的学号：A20330303，姓名：易秀，年龄是23岁，身高：173.5，居住地：广州市天河区珠吉公路上街4号。
        // 要求：把上述学生的信息：学号、年龄、身高、居住地用变量定义，进行存储，并且打印学生的信息
        // tips: 可以使用下面的名称
        //	  学号 : id
        //    姓名 : name
        //    年龄 : age
        //    身高 : height
        //    居住地 : address
        String id ="A20330303";
        String name = "易秀";
        int age1 = 23;
        double height = 173.5;
        String address = "广州市天河区珠吉公路上街4号";

        System.out.println("------学员信息展示-------");
        System.out.println(id);
        System.out.println(name);
        System.out.println(age1);
        System.out.println(address);

        // 模拟输出网站中手机的信息。手机的品牌：小米，商品介绍：小米13 徕卡光学镜头 第二代骁龙8处理器，
        // 评论数：100000，商家信息:小米京东自营旗舰店。
        // 要求，把上述手机的信息：品牌、商品介绍、评论数、商家信息用变量定义，进行存储，并且打印手机的信息
        //    tips: 可以使用下面的名称
        //	  品牌 :  brand
        //    商品介绍 : desc
        //    评论数 : count
        //    商家信息 : store
        String brand ="小米";
        String desc = "小米13 徕卡光学镜头 第二代骁龙8处理器";
        int count = 100000;
        String store = "小米京东自营旗舰店";

        System.out.println("------手机信息-------");
        System.out.println(brand);
        System.out.println(desc);
        System.out.println(count);
        System.out.println(store);

    }
}
