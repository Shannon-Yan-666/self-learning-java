package demo25_thread;

/**
 *      多线程的第二种实现方式：实现Runnable接口的方式进行实现（无返回值）
 *                  1、自己定义一个类实现Runnable接口
 *                  2、重写里面的抽象方法
 *                  3、创建自己的类的对象（表示多线程要执行的任务）
 *                  4、创建一个Thread类的对象，并开启线程（表示线程）
 */
public class MyRun implements Runnable{
    @Override
    public void run() {
        //重写线程要执行的代码
        for (int i = 0; i < 10; i++) {
            //currentThread()方法：获取当前线程的对象
            Thread thread = Thread.currentThread();//获取当前线程的对象
/*            //手动设置命名
            System.out.println(thread.getName() + "：Hello World");*/
            //系统默认命名
            System.out.println(thread.currentThread().getName()+ "：Love："+i);
        }
    }
}
