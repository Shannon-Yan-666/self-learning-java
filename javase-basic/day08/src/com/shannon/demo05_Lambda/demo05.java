package com.yanxiao.demo5_Lambda;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/**
 * 目标：掌握Lambda表达式的使用
 * 语法：固定结构全部删除，只留下不固定的（参数列表和方法体）
 *      接口 变量 = ()->{
 *          重写的方法体
 *      }
 *  注意：
 *      lambda表达式只能简化 函数式接口
 *      只有一个抽象方法 接口的匿名内部类书写
 *  省略规则：
 *         //参数类型可以省略不写。
 *         //如果只有一个参数，参数类型可以省略，同时（）也可以省略。
 *         //如果Lambda表达式的方法体代码只有一行代码
 *         //可以省略大括号不写，同时要省略分号
 *         //此时，如果这行代码是return语句，必须省略return不写，同时也必须省略各"；”不写
 *
 */
public class demo05 {
    public static void main(String[] args) {
        //需求：批量修改数组中的数据*10
        int[] nums = {1,2,3,4,5};

        //实现方案：Arrays工具类，setAll(数组,ntUnaryOperator接口)批量修改
        //匿名内部类版本
        Arrays.setAll(nums, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int index) {
                return nums[index]*10;
            }
        });

        //lambda版本
        Arrays.setAll(nums,(int index)-> {
                return nums[index]*10;
            });

        //lambda版本-简化版
        //参数类型可以省略不写。
        //如果只有一个参数，参数类型可以省略，同时（）也可以省略。
        //如果Lambda表达式的方法体代码只有一行代码
        //可以省略大括号不写，同时要省略分号
        //此时，如果这行代码是return语句，必须省略return不写，同时也必须省略各"；”不写
        Arrays.setAll(nums,index->nums[index]*10);

        //验证
        System.out.println(Arrays.toString(nums));

    }
}
