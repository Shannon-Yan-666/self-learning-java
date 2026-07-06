package demo25_thread.Test2;

import java.util.Random;

public class MyRedPacketsThread extends Thread {
    static double money = 100;//红包总金额
    static int count = 3;//红包个数
    static final double MIN = 0.01;//最小中奖金额

    @Override
    public void run() {
        //同步代码块
        synchronized (MyRedPacketsThread.class) {
            //判断共享数据是否到末尾（到了）
            //count等于0，表示没有红包了
            if (count == 0) {
                System.out.println(getName() + "，没有抢到红包!");
            } else {
                //判断共享数据是否到末尾（没到），还有红包，需要抽取金额
                //定义变量，表示最后一个中奖金额
                double prize = 0;
                //count等于1，表示还剩最后一个红包
                if (count == 1) {
                    //最后一个红包无需随机，剩余所有的钱都是中奖金额
                    prize = money;

                    //如果不是最后一个红包
                } else {
                    //表示第一第二个红包，需要随机抽取
                    //第一个红包最多：99.98 = 100-（3-1）*0.01
                    Random random = new Random();//创建随机数
                    double bounds = money - (count - 1) * MIN;//创建最大随机范围99.98元。
                    prize = random.nextDouble(bounds);
                    //判断：不能低于最小金额，如果低于最小金额，强制替换为最小金额的值。
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }
                //从money当中，去掉当前中奖的金额
                money = money - prize;
                //红包的个数 -1
                count--;
                //打印本次红包信息
                System.out.println(getName() + "，抢到了：" +prize + "元。");
            }
        }
    }
}
