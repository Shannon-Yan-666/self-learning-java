package demo25_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 目标：了解多线程及实现方式
 * 概念：
 *      并发：在同一时刻，有多个指令在单个CPU上交替执行
 *      并行：在同一时刻，有多个指令在多个CPU上同时执行
 *
 * 实现方式：
 *      多线程的第一种实现方式：继承Thread类的方式进行实现（无返回值）
 *                  1、自己定义一个类继承Thread类
 *                  2、重写run方法
 *                  3、创建子类对象，启动多线程（表示线程）
 *
 *      多线程的第二种实现方式：实现Runnable接口的方式进行实现（无返回值）
 *                  1、自己定义一个类实现Runnable接口
 *                  2、重写里面的抽象方法
 *                  3、创建自己的类的对象（表示多线程要执行的任务）
 *                  4、创建一个Thread类的对象，并开启线程（表示线程）
 *
 *      多线程的第三种实现方式：利用Callable接口和Future接口方式实现
 *                        （特点：可以获取到多线程运行的结果）
 *                  1、自己定义一个类MyCallable，实现Callable接口
 *                  2、重写里面的抽象方法（有返回值，表示多线程运行的结果）
 *                  3、创建MyCallable的对象（表示多线程要执行的任务）
 *                  4、创建Future的实现类，FutureTask的对象（作用：管理多线程运行的结果）
 *                  5、创建Thread类的对象，并启动（表示线程）
 *
 * 三种实现方式的对比：
 *                                          优点                     缺点
 *              继承Thread类             编程比较简单，               可拓展性较差
 *                              可以直接使用Thread类中的方法        不能再继承其他的类
 *              实现Runnable接口      拓展性强，实现该接口的同时         编程相对复杂
 *              实现Callable接口        还可以继承其他的类       不可以直接使用Thread类中的方法
 *
 *  线程的生命周期：
 *                                          没有执行资格
 *          sleep()方法时间到   <------------没有执行权---------<   sleep()或其他阻塞方法
 *          其他阻塞方式结束    |              阻塞              |
 *                           |                               |
 *                          | notify()   没有执行资格   wait() |
 *                          |-------------没有执行权----------|
 *                          |               等待             |
 *                          |                               |
 *                          |  到时间了  没有执行资格  sleep(10)|
 *                          |-------------没有执行权----------|
 *                          |             计时等待           |
 *                          |                              |
 *             start()      |     其他线程抢走CPU的执行权      |      run()执行完毕
 *  创建线程对象---------->有执行资格<---------------------有执行资格--------------->线程死亡，变成垃圾
 *                      没有执行权---------------------->有执行权
 *    新建           就绪，不停抢CPU    抢到CPU的执行权     运行代码                     死亡
 */
public class Demo1_Thread_feature {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
/*        //多线程的第一种实现方式：继承Thread类的方式进行实现（无返回值）
        //创建子类对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        //线程命名
        t1.setName("线程1");
        t2.setName("线程2");
        //开启线程
        t1.start();
        t2.start();*/

/*        //多线程的第二种实现方式：实现Runnable接口的方式进行实现（无返回值）
        //创建在自己类的对象：表示多线程要执行的任务
        MyRun myRun = new MyRun();
        //创建线程对象：把要执行的任务，传参给线程
        Thread t3 = new Thread(myRun);
        Thread t4 = new Thread(myRun);
        ////线程命名
        t3.setName("线程3");
        t4.setName("线程4");
        //开启线程
        t3.start();
        t4.start();*/

        //多线程的第三种实现方式：利用Callable接口和Future接口方式实现
        // （特点：可以获取到多线程运行的结果）
        //创建MyCallable的对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();
        //创建Future的实现类，FutureTask的对象（作用：管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建Thread类的对象，并启动（表示线程）
        new Thread(ft).start();
        //获取多线程运行的结果（有异常直接抛出）
        Integer result = ft.get();
        System.out.println(result);

    }
}
