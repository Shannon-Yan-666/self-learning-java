package com.yanxiao.homework;

import java.util.Arrays;

/**
 * 题目6：奇偶数分离（综合挑战）
 * ·训练目标：综合运用数组遍历、条件判断（取余）、数组元素
 * 赋值，理解数据分类存储的逻辑。
 * ）需求描述：定义一个数组其中包含多个数字。用自己的方式最
 * 终实现，奇数放在数组的左边，偶数放在数组的右边。（可以
 * 创建其他数组，不必须在原数组中改变）。
 * ·实现提示：
 * 方法一（创建新数组）：
 * 1.创建一个新的数组，长度与原数组相同。
 * 2.定义两个指针（索引l），一个指向新数组的头部（1eft
 * =0），一个指向尾部（right=新数组.length-
 * 1）.
 * 3.遍历原数组，判断当前数字是奇数还是偶数（num%2
 * !=o)。
 * 4.如果是奇数，放入新数组的left位置，并将left向右移
 * 动；如果是偶数，放入right位置，并将right向左移
 * 动。
 * 。方法二（原地交换－较难）：
 * 1.使用双指针，一个指向原数组头部，一个指向尾部。
 * 2.左边找偶数，右边找奇数，找到后交换位置，直到两指
 * 针相遇。
 */

public class homework1 {
    public static void main(String[] args) {
        //1.初始化一个动态数组，存储1~10的数据：
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            }

        //创建一个新的动态数组
        int[] nums_new = new int[10];
        // 头指针：放偶数
        int left = 0;
        // 尾指针：放奇数
        int right = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums_new[left] = nums[i];
                left++;
            }
            else{
                nums_new[right] = nums[i];
                right--;
            }
        }
        System.out.println(Arrays.toString(nums_new));
    }
}
