package demo25_thread.Demo7_Thread_Pool_Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 目标：了解线程池的工具类
 *      Executors:线程池的工具类，通过调用方法返回不同类型的线程池对象
 * 方法：
 *                                              方法名称                          说明
 *      public  static  ExecutorService newCachedThreadPool()               创建一个没有上限的线程池(最多21个亿多的线程)
 *      public  static  ExecutorService newFixedThreadPool(int nThreads)    创建一个有上限的线程池
 * 主要核心原理：
 *      1、创建一个池子，池子中是空的
 *      2、提交任务是，池子会创建新的线程对象，任务执行完毕，线程归还给池子
 *        下次再提交任务时，不需要创建新的线程池，直接复用已有的线程池即可
 *      3、但是如果提交任务时，池子中没有空闲的线程，也无法创建新的线程，任务就会排队等待
 */
public class Demo7_Thread_Executors {
    public static void main(String[] args) throws InterruptedException {
        //1、获取线程池对象
//        ExecutorService pool1 = Executors.newCachedThreadPool();
        ExecutorService pool2 = Executors.newFixedThreadPool(3);//设置最多3个线程

        //2、提交任务
        pool2.submit(new MyPoolRunnable1());
//        Thread.sleep(1000);//证明复用，每次睡1秒钟
        pool2.submit(new MyPoolRunnable1());
//        Thread.sleep(1000);//证明复用，每次睡1秒钟
        pool2.submit(new MyPoolRunnable1());
//        Thread.sleep(1000);//证明复用，每次睡1秒钟
        pool2.submit(new MyPoolRunnable1());

/*        //3、销毁线程池（线程池一般是不会销毁的）
        pool1.shutdown();*/
    }
}
