package com.yanxiao.demo04_array_define_dynamic;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        // 双指针法：首尾交换
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 打印结果
        for (int num : arr) {
            System.out.print(num + " "); // 输出：55 44 33 22 11
        }
    }
}