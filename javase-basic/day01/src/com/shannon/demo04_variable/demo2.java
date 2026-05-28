package com.yanxiao.demo04_variable;

/**
 * 目标：了解变量使用时的注意事项及相应的解决防范
 */
public class demo2 {

    public static void main(String[] args) {

        //注意事项1：变量要先声明才能使用
//        System.out.println(money);

        //注意事项2：变量是什么类型，就装什么类型的工具
        int a = 10;

        //注意事项3：变量的作用范围是其定义时所处的{}内
        double b = 5.0;

        //注意事项4：同一个范围内，变量名称不能相同，类型不一样也不行
//        int a

        //注意事项5：变量在使用前一定要进行赋值操作，否则无法使用
        int weight;
//        System.out.println(weight);//报错

        //注意事项6：一条语句可以同时定义多个变量，使用逗号分隔
        int c = 1 , d = 2, e = 3;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
