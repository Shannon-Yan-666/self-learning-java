package demo25_thread.Test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MyLotteryBoxThread extends Thread{
    //(10,5,20,50,100,200,500,800,2,80,300,700)
    //需要去重，抽一个删一个
    //创建集合，自带去重
    ArrayList<Integer> list;

    public MyLotteryBoxThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer>boxList = new ArrayList<>();
        //1、循环
        while(true){
            //2、同步代码块
            synchronized (MyLotteryBoxThread.class){
                if (list.size() == 0){
                    System.out.println(getName()+boxList);
                    break;
                }else {
                    Collections.shuffle(list);
                    int prinze = list.remove(0);
                    boxList.add(prinze);
//                    System.out.println(getName() + "，产生了一个：" + prinze + "元的大奖。");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
