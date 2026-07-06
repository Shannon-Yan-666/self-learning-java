package demo25_thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyMovieThread extends Thread {
    //加static关键字，表示整个类所有的对象都共享此数据
    static int ticket = 0;//票号  0~99
    //锁对象，保证一定是唯一的，加静态关键字
    static Object lock = new Object();
    //MyMovieThread.class ：类名.class，一定是唯一，可以当作是锁对象

    //创建Lock锁对象: 加static关键字，表示整个类所有的对象都共享此对象
    static Lock lock1 = new ReentrantLock();

    @Override
    public void run() {
        //无线循环
        while (true) {
            /*//同步代码块：把操作共享数据的代码锁起来，代码块中的代码，轮流执行
           synchronized (MyMovieThread.class){
               //判断
               if(ticket < 100){
                   try {
                       Thread.sleep(10);//有异常，try
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   ticket++;
                   System.out.println(getName()+"，正在卖第："+ticket+" 张票！！");
               }else {
                   break;
               }*/

            lock1.lock();//开锁
            //快捷键ctrl+alt+T：try-catch-finally（关锁）
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(getName() + "，正在卖第：" + ticket + " 张票！！");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //关锁
                lock1.unlock();
            }
        }
    }
}
