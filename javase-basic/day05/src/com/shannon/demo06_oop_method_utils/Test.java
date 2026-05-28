package com.yanxiao.demo06_oop_method_utils;

public class Test {
    public static void main(String[] args) {
        //普通类：创建对象+调用成员方法（性能低）
        ArrayTools arrayTools = new ArrayTools();
        //创建一个数组，存储要处理的数据
        int[]nums = {1,2,3,4,5};
        //普通类：一定需要通过成员对象调用方法（繁琐）
        int max1 = arrayTools.max(nums);
        int min1 = arrayTools.min(new int[]{11, 22, 33, 44});
        System.out.println(nums);


        //工具类（推荐使用）：类名称.方法名
        ArrayTools.print(nums);
        int max = ArrayTools.max(nums);
        int min = ArrayTools.min(nums);
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
