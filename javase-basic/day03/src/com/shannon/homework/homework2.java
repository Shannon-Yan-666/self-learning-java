package homework;

import java.util.Scanner;

/**
 *题目2：工龄涨薪计算器
 * 训练目标：掌握if-else if-else多重条件判断结构，学会处理区间
 * 范围的逻辑判断。
 * 需求描述：根据程序员的工龄（整数）给程序员涨工资（整
 * 数），程序员的工龄和基本工资通过键盘录入。涨工资的条件
 * 如下：
 * [10-15] +20000;
 * [5-10] +10000;
 * [3~5] +5000;
 * [1~3]+3000。
 * 运行程序：
 * 请输入作为程序员的你的工作的工龄:10;
 * 请输入作为程序员的你的基本工资为：60000;
 * 程序运行后打印格式"您目前工作了10年，基本工资为60000
 * 元，应涨工资_20000元，涨后工资80000元"。
 * 实现提示
 * 1.使用Scanner录入工龄（years）和基本工资（salary)
 * 2.定义一个变量increase用于存储涨薪金额，初始值为0。
 * 3.使用if-else if结构判断years所在的区间。注意区间的写法，
 * 例如years >= 10 && years < 15。
 * 4.根据判断结果给increase赋值。
 * 5.计算涨后工资 totalSalary= salary+ increase。
 * 6.使用字符串拼接或占位符按指定格式输出结果。
 */
public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的工龄：");
        int years = sc.nextInt();
        System.out.println("请输入您的基本工资");
        int salary = sc.nextInt();

        int increase = 0;
        if (years >= 10 && years < 15) {
            increase += 20000;
        } else if (years >= 5 && years < 10) {
            increase += 10000;
        } else if (years >= 3 && years < 5 ) {
            increase += 5000;
        } else if (years >= 1 && years < 3) {
            increase += 3000;
        }else {
            System.out.println("您不符合涨薪要求~");
        }
        int totaSalary = salary + increase;

        System.out.println("您目前工作了" + years + "年，基本工资为："+ salary + "元，应涨工资："+ increase +"元，涨后工资："+ totaSalary +"元。");
    }
}
