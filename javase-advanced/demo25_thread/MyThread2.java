package demo25_thread;

public class MyThread2 extends Thread{
    @Override
    public void run() {

        for (int i = 0; i <= 100; i++) {
            System.out.println(getName()+"：Engfa Waraha："+i);
/*            //表示出让当前CPU的执行权：尽可能的运行结果均匀一点
              //public static void yield()    出让线程/礼让线程
            Thread.yield();*/
        }
    }
}
