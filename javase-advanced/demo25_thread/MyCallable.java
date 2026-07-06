package demo25_thread;

import java.util.concurrent.Callable;

/**
 *      多线程的第三种实现方式：利用Callable接口和Future接口方式实现
 *                        （特点：可以获取到多线程运行的结果）
 *                  1、自己定义一个类MyCallable，实现Callable接口
 *                  2、重写里面的抽象方法（有返回值，表示多线程运行的结果）
 *                  3、创建MyCallable的对象（表示多线程要执行的任务）
 *                  4、创建Future的实现类，FutureTask的对象（作用：管理多线程运行的结果）
 *                  5、创建Thread类的对象，并启动（表示线程）
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //重写抽象方法
        //求1~100之间的和
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
