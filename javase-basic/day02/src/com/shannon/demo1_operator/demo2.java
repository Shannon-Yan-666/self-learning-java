package com.yanxiao.demo1_operator;

/**
 *
 * 目标：掌握自增自减运算符的基本使用
 * 符号:
 *      ++   --
 * 作用：
 *      对变量进行使用，对其数据进行 +1  ， -1
 * 注意：
 *      1.单独使用时：符号在变量前或者后面都可以
 *          a++ ; ++a ; b-- ; --b
 *      2.只能对变量进行使用，不能对字面量使用
 *          666++ ； --666
 *      3.不单独对变量使用，放置的前后位置效果不同
 *          c = ++b;  //先运算后赋值
 *          c = b++;  //先赋值后运算
 *
 */

public class demo2 {

    public static void main(String[] args) {
        //需求：完成点赞和取消点赞的功能
        //1.定义变量，存储变化的点赞数量
        int love = 666;

        //2.模拟一次点赞操作
        //love = love + 1;
        love++;
        System.out.println("当前点赞数"+love);

        //2.模拟一次点赞操作
        ++love;
        System.out.println("当前点赞数"+love);

        //3.模拟一次取消点赞操作
        love--;
        System.out.println("当前点赞数"+love);

        //3.模拟一次取消点赞操作
        --love;
        System.out.println("当前点赞数"+love);

        //注意事项3：放置的前后位置效果不同
        // c = ++b;  //先运算后赋值
        // c = b++;  //先赋值后运算
        int num = 888;
        int count = num++;
        System.out.println(count); //888 先被赋值888
        System.out.println(num); //889 然后运算
    }
}
