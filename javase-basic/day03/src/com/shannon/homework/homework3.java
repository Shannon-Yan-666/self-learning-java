package homework;

/**
 * 题目3：3与5公倍数求和
 * 训练目标：综合运用for循环进行遍历，结合if进行条件筛选，以
 * 及累加求和算法。
 * 需求描述：打印出1到100之间的既是3的倍数又是5倍数的数字
 * 以及这些数字的和。
 * 实现提示：
 * 1.定义一个求和变量sum，初始化为0。
 * 2.使用for循环从1遍历到100。
 * 3.在循环体内，使用if判断当前数字是否同时满足"能被3整除'
 * 和"能被5整除"（即i % 3 == 0 &&i % 5 == 0）。
 * 4.如果满足条件，先打印该数字，然后将其加到sum变量中。
 * 5.循环结束后，打印sum的值。
 *
 */
public class homework3 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println("第"+ count +"个数字为："+ i);
            }
        }
        System.out.println("1~100之间，3与5公倍数共" + count + "个，和为："+ sum);
    }
}
