package homework;

import java.util.Scanner;

/**
 * 题目1：三数求最大值
 * 训练目标：掌握if条件语句的基本用法，学会通过比较运算符比
 * 较多个数值的大小。
 * 需求描述：让用户依次录入三个整数，求出三个数中的最大
 * 值，并打印到控制台。【使用if】
 * 实现提示：
 * i1.使用Scanner类获取用户输入的三个整数。
 * 2.定义一个变量（如 max）用于存储最大值，可以先假设第
 * 个数是最大的。
 * 3.使用if语句将第二个数与max比较，如果第二个数更大，则
 * 更新max。
 * 4.再次使用if语句将第三个数与max比较，如果第三个数更
 * 大，则更新max。
 * 5.最后打印max的值。
 *
 */
public class homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int n1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int n2 = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int n3 = sc.nextInt();

        int max = n1;
        if (n2 > max){
            max = n2;
        } else if (n3 > max) {
            max = n3;
        }
        System.out.println("最大值：" + max);
    }
}
