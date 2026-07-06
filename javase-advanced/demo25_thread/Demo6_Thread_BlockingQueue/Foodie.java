package demo25_thread.Demo6_Thread_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 等待唤醒机制
 * 消费者：食客
 */
public class Foodie extends Thread{
    //定义成员变量，表示阻塞队列
    ArrayBlockingQueue<String> queue;

    //构造方法
    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            //不断的从阻塞队列中，获取面条
            try {
                //take方法底层，会用lock锁把代码给锁起来，不需要再去写锁了
                String food = queue.take();
//                System.out.println(food); //打印语句在锁外，控制台输出会比较乱，但不影响锁内数据执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
