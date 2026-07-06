package demo25_thread.Demo6_Thread_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 等待唤醒机制
 * 生产者：厨师类
 */
public class Cook extends Thread{
    //定义成员变量，表示阻塞队列
    ArrayBlockingQueue<String> queue;

    //构造方法
    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            //不断的把面条放到阻塞队列当中
            try {
                //put方法底层，会用lock锁把代码给锁起来，不需要再去写锁了
                queue.put("面条");
//                System.out.println("厨师放了一碗面条"); //打印语句在锁外，控制台输出会比较乱，但不影响锁内数据执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
