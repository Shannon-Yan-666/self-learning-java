package demo04_loop_loop;

/**
 *  目标：了解嵌套循环的书写形式和执行特点
 *  语法：
 *      循环
 *          循环
 * 执行特点：
 *      外层循环执行一次，内层循环执行一整轮
 *
 *
 */
public class demo4 {

    public static void main(String[] args) {
    methon();
    methon2();
    }

    // 打印25行Hell World
    public static void methon(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Hello World"+ i);
            }
        }
    }

    public  static void methon2(){

        //打印一个四行五列的*
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= 5; j++) {
                //不换行打印
                System.out.print("*");
            }
            //内循环打印完一行，外循环换行一次
            System.out.println();
        }


        //打印一个倒三角的*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
