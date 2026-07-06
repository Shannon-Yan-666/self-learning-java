package demo25_thread;

/**
 * 目标：了解Thread类-常见的成员方法
 * 方法：
 *          方法名                          说明
 * String getName()                     返回此线程的名称
 * void setName(String name)            设置线程的名字（构造方法也可以设置名字）
                                         细节：
                                             1、如果没有给线程设置名字，线程也是有默认的名字的
                                                格式：Thread-X（X序号，从0开始的）
                                             2、如果要给线程设置名字，可以使用set方法/构造方法
 * static Thread currentThread()        获取当前线程的对象
                                         细节：
                                            1、当JVM虚拟机启动之后，会自动的启动多条线程其中有一条线程就叫做main线程
                                            2、他的作用就是去调用main方法，并执行里面的代码
                                            3、在以前，我们写的所有的代码，其实都是运行在main线程当中
 * static void sleep(long time)         让线程休眠指定的时间，单位为毫秒
                                         细节：
                                             1、哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
                                             2、方法的参数：就表示睡眠的时间，单位毫秒
                                                        1秒=1000毫秒
                                             3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
 *
 * setPriority(int newPriority)         设置线程的优先级（最小1，最大10，默认5）
 * final int getPriority()              获取线程的优先级（最小1，最大10，默认5）
 *
 * final void setDaemon(boolean on)     设置为守护线程
                                        细节：
                                            当其他的非守护线程执行完毕后，守护线（备胎）程会陆续结束
 * public static void yield()           出让线程/礼让线程
 * public static void join()            插入线程/插队线程
 */
public class Demo2_Thread_Method {
    public static void main(String[] args) throws InterruptedException {
/*        //static Thread currentThread() 获取当前线程的对象
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        System.out.println(name);//main*/

/*        //static void sleep(long time) 线程休眠指定的时间，单位为毫秒
        System.out.println("666");
        //父类：有异常直接抛出  子类：Try
        Thread.sleep(5000);//睡眠5秒钟
        System.out.println("888");*/

/*        //setPriority(int newPriority) 设置线程的优先级（最小1，最大10，默认5）
        //创建线程要执行的参数对象
        MyRun myRun = new MyRun();
        //创建线程对象
        Thread t1 = new Thread(myRun,"英法");
        Thread t2 = new Thread(myRun,"夏洛特");
        //final int getPriority()  获取线程的优先级（最小1，最大10，默认5）
*//*        //查看默认优先级
        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5
        System.out.println(Thread.currentThread().getPriority());//5*//*
        //设置优先级
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();*/

        //final void setDaemon(boolean on)     设置为守护线程
        //创建线程对象
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        //手动为线程命名
        t1.setName("Wind");
        t2.setName("Nam");
        //设置第二个线程为守护线程（备胎线程）
        t2.setDaemon(true );
        //开启线程
        t2.start();
        //public static void join()  插入线程/插队线程
        t2.join();
        t1.start();

        //public static void yield()   出让线程/礼让线程



    }
}
