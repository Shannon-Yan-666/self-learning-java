package demo05_while;

/**
 * 目标：了解do-while 语法格式和使用场景
 * 语法：
 *      初始化语句(定义变量)；
 *      1do{
 *          1循环体语句;
 *          3条件控制语句;
 *      } 2while(循环条件);
 *
 *  执行特点：
 *          do-while：先执行，再判断（最少执行一次）
 *          for/while：先判断，再执行
 *  使用场景：
 *          抢票软件
 */

public class demo2 {
    public static void main(String[] args) {
        // 使用do-while打印5次HelloWorld
        int i = 0;
         do {
            System.out.println("Hello World");
            i++;
        } while (i < 5);
    }
}
