package demo02_swtich;

import java.util.Scanner;

/**
 *  目标：掌握switch 分支语法格式的使用场景
 *  语法：
 *      switch（表达式）{
 *          case 值1：
 *                语句体1;
 *                break;
 *          case 值2：
 *                语句体2;
 *                break;
 *          .....
 *          default:
 *                 语句体n+1;
 *                 break;
 *      }
 * if、switch的比较，各自适合的业务场景：
         * if 适合做条件是区间判断的情况
         * switch 适合做：条件是比较值的情况、代码优雅、性能较好
 *
 */
public class demo2 {
    public static void main(String[] args) {

        // 需求：制作备忘录
        // 周一：埋头苦干
        // 周二：埋头苦干
        // 周三：埋头苦干
        // 周四：疯狂星期四，V我50
        // 周五：找前台聊天
        // 周六：健身
        // 周日：健身

        //1.输入日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的日期：");
        int week = sc.nextInt();

        //2.给出当日的安排
        switch (week) {
            case 1:
                System.out.println("周一：埋头苦干");
                break;
            case 2:
                System.out.println("周二：埋头苦干");
                break;
            case 3:
                System.out.println("周三：埋头苦干");
                break;
            case 4:
                System.out.println("周四：疯狂星期四，V我50");
                break;
            case 5:
                System.out.println("周五：找前台聊天");
                break;
            case 6:
                System.out.println("周六：健身");
                break;
            case 7:
                System.out.println("周日：健身");
                break;
            default:
                System.out.println("您输入的日期有误！");
                break;
        }

        // JDK 14 ，箭头形式简化书写：
        // 1.case 存放多个值
        // 2.case 后的冒号替换为箭头->
        // 3.case 代码块中的break 删除 （默认自动添加）
        // 4.case 代码块中如果是多行代码，需要添加{}包裹

        switch (week) {
            case 1, 2, 3 -> System.out.println("埋头苦干");
            case 4 -> System.out.println("周四：疯狂星期四，V我50");
            case 5 -> System.out.println("周五：找前台聊天");
            case 6, 7 -> System.out.println("健身");
            default -> System.out.println("您输入的日期有误！");
        }
    }
}
