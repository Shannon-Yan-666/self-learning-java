package com.yanxiao.demo03_array_foreach;

import java.util.Arrays;

public class case1 {
    public static void main(String[] args) {
        //需求：数字的反转操作
//        已知一个数组 arr = {11, 22, 33, 44, 55}; 用程序实现把数组中的元素值交换，
//        交换后的数组 arr = {55, 44, 33, 22, 11}; 并在控制台输出交换后的数组元素。
        // 1.定义数组，存储待反转的多个数据
        int[] arr = {11, 22, 33, 44, 55};
//                   0   1   2   3  length-1

        // 2.定义两个变量，记录待交换的数据的位置
        int start = 0; //头指针：第一位的位置
        int end = arr.length - 1; //尾指针：最后一位的位置

        // 3.循环进行交换操作 start < end ,推荐使用while
        while (start < end) {
            // 创建临时变量，储存数据
            int temp = 0;
            //4.交换操作：数组[start]<====>数组[end]
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;//头指针+1，后移一位
            end--;//尾指针-1，前进一位
        }
        // 5.打印数组，查看反转的结果
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // toString 核心类库的功能，打印数组
        System.out.println(Arrays.toString(arr));
    }
}
