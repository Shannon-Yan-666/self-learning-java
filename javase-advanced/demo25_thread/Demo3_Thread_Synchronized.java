package demo25_thread;
/**
 * 同步代码块：把操作共享数据的代码锁起来，代码块中的代码，轮流执行
 *          特点1：锁默认打开，有一个线程进去后，锁自动关闭
 *          特点2：里面的代码全部执行完毕，线程出来，锁自动打开
 *          细节：锁对象，保证一定是唯一的，加静态关键字
 *              类名.class，一定是唯一，可以当作是锁对象（当前类的字节码文件对象）
 *          格式：
 *              synchronized(锁){
 *                  操作共享数据的代码
 *              }
 *
 * 同步方法：把synchronized关键字加到方法上
 *          特点1：同步方法是锁住方法里面所有的代码
 *          特点2：锁对象不能自己指定，是Java规定好的。
 *                                非静态：this（当前方法的调用者）
 *                                静态：当前类的字节码文件对象
 *          格式：
 *              修饰符 synchronized 返回值类型 方法名（方法参数）{
 *              }
 *          技巧：
 *             先写同步代码块，然后抽取为同步方法
 *             1、选中synchronized中的代码块，快捷键：ctrl+alt+M，抽取成方法
 *             2、删除同步代码块的synchronized
 *             3、将抽取的方法，添加synchronized关键字
 * 拓展：
 *      StringBuilder：线程不安全，需要同步，推荐使用StringBuffer
 *      StringBuffer：每个方法上都有synchronized，线程安全，可以同步
 **/
public class Demo3_Thread_Synchronized {
    public static void main(String[] args) {
        //某电影院目前正在上映国产大片，共100张票，但只有3个窗口卖票
        //利用同步方法完成

        //创建参数的对象：是唯一对象
        MyMovieRunnable mr = new MyMovieRunnable();

        //创建线程的对象：传参
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

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
