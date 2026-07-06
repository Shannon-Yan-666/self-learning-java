package demo25_thread.Demo6_Thread_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 目标：了解阻塞队列的继承结构
 * 什么是阻塞：
 *          1、put数据，数据放不进去，需要等待；
 *          2、take数据，取第一个数据，取不到，需要等待；
 *
 *      接口：顶层接口 Iterable 、实现单列集合 Collection
 *           队列 Queue 、 阻塞队列 BlockingQueue
 *
 *      实现类：ArrayBlockingQueue  底层是数组，有界（必须指定队列长度）。
 *            LinkedBlockingQueue 底层是链表，无界（不需要指定队列长度），
 *                                但不是真的无界，最大为int的最大值，21个亿多。
 *
 */
public class Demo6_Thread_BlockingQueue {
    public static void main(String[] args) {
        //需求：利用阻塞队列完成生产者和消费者（等待唤醒机制）
        //细节：生产者和消费者必须使用同一个阻塞队列

        //1、创建阻塞队列的对象（在测试类中创建）
        ArrayBlockingQueue<String>queue = new ArrayBlockingQueue<>(1);//上限1

        //2、创建线程对象，并把阻塞队列传递过去
        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);

        //3、开启线程
        cook.start();
        foodie.start();

    }
}
