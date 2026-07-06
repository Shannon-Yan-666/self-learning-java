package demo25_thread.Demo5_Thread_Wait_Notify;

/**
 * 目标：了解等待唤醒机制
 * wait：等待
 * notify：唤醒
 *
 * 方法：
 *           方法                 说明
 *      void wait()         当前线程等待，直到被其他线程唤醒
 *      void notify()       随机唤醒单个线程
 *      void notifyAll()    唤醒所有线程（常用）
 *
 */
public class Demo5_Thread_Wait_Notify {
    public static void main(String[] args) {
        //需求：完成生产者和消费者（等待唤醒机制）的代码
        //实现线程轮流交替执行的效果

        //创建线程对象
        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        //命名
        cook.setName("厨师");
        foodie.setName("吃货");

        cook.start();
        foodie.start();
    }
}
