package demo25_thread.Demo7_Thread_Pool_Executors;

public class MyPoolRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + "----" + i);
        }
    }
}
