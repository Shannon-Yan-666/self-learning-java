package homework;

import java.util.Scanner;

/**
 * 题目4：数字位筛选统计
 * 训练目标：练习数字位数的提取（个位、十位、百位），掌握
 * 计数器模式和累加器模式的结合使用。
 * 需求描述：从键盘上录入一个大于100的三位数，打印出100到
 * 该数字之间满足如下要求的数字，数字的个数，以及数字的
 * 和：数字的个位数不为7；数字的十位数不为5；数字的百位数
 * 不为3。
 * 实现提示：
 * 1.使用Scanner录入一个整数targetNum。
 * 2.定义sum（和）和count（个数）变量，初始化为0。
 * 3.使用for循环从100遍历到targetNum。
 * 4.在循环中，通过数学运算提取当前数字i的个位(i % 10)、十
 * 位(i / 10 % 10)和百位(i / 100 % 10)。
 * 5.使用if语句组合三个条件（&&连接），判断是否符合要求。
 * 6.符合条件则打印数字，count自增，sum累加。
 * 7.循环结束后打印总个数和总和。
 *
 */
public class homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数字（大于100）：");
        int targetNum = sc.nextInt();

        int sum = 0;
        int count = 0;
        if (targetNum > 100) {
            for (int i = 100; i < targetNum; i++) {
                int ge = i % 10;
                int shi = i / 10 % 10;
                int bai = i / 100;
                if (ge != 7 && shi != 5 && bai != 3) {
                    sum += i;
                    count++;
                }
            }
        } else {
            System.out.println("您输入的数字有误！");
        }
        System.out.println("总个数：" + count + "求和为：" + sum);
    }
}
