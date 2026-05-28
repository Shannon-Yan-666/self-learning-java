package demo03_for;

/**
 *  目标：掌握for循环语法格式和使用场景
 *  语法：
 *      书写形式1：
 *          1初始化语句(计数器变量)：
 *          for(  ;  2判断条件（判断计数器变量）  ; ){
 *              3重复执行的代码;
 *
 *              4条件控制语句(修改计数器变量);
 *          }
 *
 *       书写形式2：
 *          for( 1初始化语句(定义计数器) ; 2条件判断语句(判断计数器) ; 4条件控制语句(修改计数器 ){
 *              3重复执行的代码;
 *          }
 *
 *  执行流程:
 *      先 1
 *      判断 2
 *      如果 2成立.就执行 3 4
 *      在继续判断 2
 */
public class demo3 {
    public static void main(String[] args) {
        // 需求：打印5行HelloWorld
        // 使用循环语句,书写形式1：
        int i = 10;
        for (; i < 15 ;) {
            System.out.println("Hello World");
            i ++;
        }

        // 使用循环语句，书写形式2：(推荐使用)
        for (int j = 1; j < 10; j++) {
            System.out.println("Hello Film");
        }

        // 使用循环语句，书写形式3
        // 次数.for 回车 ,快速生成for循环代码
        for (int n = 0; n < 5; n++) {
            System.out.println("Hello 深圳" + n);
        }


        // 使用循环语句,实现倒计时的功能
        // 次数.for 回车 ,快速生成
        for (int i1 = 3; i1 > 0; i1--) {
            System.out.println("倒计时"+ i1);
        }

    }
}

