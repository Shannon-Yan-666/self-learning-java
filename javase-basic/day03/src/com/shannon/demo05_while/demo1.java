package demo05_while;
/**
 *  目标：掌握while循环语法格式和使用场景
 *  语法：
 *      书写形式1：
 *          1初始化语句(计数器变量)：
 *          while( 2判断条件（判断计数器变量）){
 *              3重复执行的代码;
 *
 *              4条件控制语句(修改计数器变量);
 *          }
 *
 *  执行流程:
 *      先 1
 *      判断 2
 *      如果 2成立.就执行 3 4
 *      在继续判断 2
 *
 *   使用场景：
 *      1.for和while可以互相替换使用
 *      2.在知晓循环次数的情况下，推荐使用for，书写简单
 *      方便：次数.fori
 *      3.在不知晓循环次数的情况下，推荐使用while，书写简单
 *      没法写：for(i =? ; i < ? ;  i + ?)
 *      方便：while(条件)
 */
public class demo1 {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        demo3();
    }

    public static void demo1(){
        // 需求；使用while 打印5次 hell world
        int i = 0;
        while (i < 5){
            System.out.println("Hello World");
            i++;
        }
    }

    public static void demo2(){
        int count = 0;
        double i = 0.1;
        double Height = 8848860;
        while (i < Height){
            i *= 2;
            count++;
        }
        System.out.println(count);
        System.out.println(i);
    }

    public static void demo3(){
        int money = 1;
        long totalMoney = 0;

        for (int i = 1; i <= 30; i++) {
            totalMoney +=money;
            money *= 2;
        }
        System.out.println(totalMoney);
    }
}
