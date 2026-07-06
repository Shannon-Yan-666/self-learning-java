package demo25_thread;

/**
 * 练习：
 *      某电影院目前正在上映国产大片，共100张票，但只有3个窗口卖票
 *      请设计一个程序模拟该电影院买票
 *
 *  卖票引发的安全问题：
 *          1、相同的票出现了多次
 *          2、出现了超出范围的票
 *
 *  同步代码块：把操作共享数据的代码锁起来，代码块中的代码，轮流执行
 *          特点1：锁默认打开，有一个线程进去后，锁自动关闭
 *          特点2：里面的代码全部执行完毕，线程出来，锁自动打开
 *          细节：锁对象，保证一定是唯一的，加静态关键字
 *              类名.class，一定是唯一，可以当作是锁对象
 *          格式：
 *              synchronized(锁){
 *                  操作共享数据的代码
 *              }
 */
public class Test1 {
    public static void main(String[] args) {
        //创建线程对象：3个窗口卖票
        MyMovieThread t1 = new MyMovieThread();
        MyMovieThread t2 = new MyMovieThread();
        MyMovieThread t3 = new MyMovieThread();

        //命名
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
    }
}
