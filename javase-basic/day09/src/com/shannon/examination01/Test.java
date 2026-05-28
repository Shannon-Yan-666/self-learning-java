package com.yanxiao.examination01;
/**
 * 定义类：Test，定义main方法，main方法内按以下要求编写代码：
 * 1.定义一个int类型的数组，存储以下几个考试分数：
 * 2.计算这几个考试分数去掉最低分后剩余元素的平均分，并在控制台打印输出
 */
public class Test {
    public static void main(String[] args) {
        //定义int类型数组
        int[] Score = {88,96,97,74,90,58,77,90,99};

        //设置累加变量
        int sum = 0;
        //设置最小值变量
        int min = Integer.MAX_VALUE;
        //遍历数组
        for (int i = 0; i < Score.length; i++) {
            //求和
            sum += Score[i];
            //判断最小值
            if (Score[i] < min ) {
                min = Score[i];
            }
        }
        //打印结果
        System.out.println("最高分：" + min);
        System.out.println("平均分：" + (sum-min)/(Score.length-1));
    }
}



