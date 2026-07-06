package demo25_thread.Demo5_Thread_Wait_Notify;

/**
 * 等待唤醒机制
 * 控制类：桌子
 * 作用：控制生产者和消费者的执行
 */
public class Desk {
    //表示：桌子上是否有面条： 0：没有、1：有。
    public static int foodFlag = 0 ;

    //总个数
    public static int count = 10 ;

    //锁对象
    public static Object lock = new Object();
}
