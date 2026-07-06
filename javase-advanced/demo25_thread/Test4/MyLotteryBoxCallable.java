package demo25_thread.Test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyLotteryBoxCallable implements Callable<Integer> {
    //(10,5,20,50,100,200,500,800,2,80,300,700)
    //需要去重，抽一个删一个
    //创建集合，自带去重
    ArrayList<Integer> list;

    public MyLotteryBoxCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();
        //1、循环
        while (true) {
            //2、同步代码块
            synchronized (MyLotteryBoxCallable.class) {
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int prinze = list.remove(0);
                    boxList.add(prinze);
                }
            }
            Thread.sleep(10);
        }
        //把集合中得最大值返回
        if (boxList.size() == 0) {
            //如果没有抽到，返回null
            return null;
        }else {
            //抽到，则返回最大值
            return Collections.max(boxList);
        }
    }
}
