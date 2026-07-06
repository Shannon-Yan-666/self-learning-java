package demo25_thread;

/**
 *      多线程的第一种实现方式：继承Thread类的方式进行实现（无返回值）
 *                  1、自己定义一个类继承Thread类
 *                  2、重写run方法
 *                  3、创建子类对象，启动多线程（表示线程）
 */

public class MyThread extends Thread {
    @Override
    public void run() {
        //重写线程要执行的代码
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + "：Hello World："+i);
        }
    }
}
