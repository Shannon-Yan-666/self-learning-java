package demo25_thread.Demo5_Thread_Wait_Notify;

/**
 * 等待唤醒机制
 * 生产者：厨师类
 *
 * 1、循环
 * 2、同步代码块（抽取方法）
 * 3、判断共享数据是否到了末尾（先写到了）
 * 4、判断共享数据是否到了末尾（没到，执行核心逻辑）
 */
public class Cook extends Thread{
/*    //定义成员变量，表示阻塞队列
    ArrayBlockingQueue<String> queue;

    //构造方法
    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }*/

    @Override
    public void run() {
        while(true){
            synchronized(Desk.lock){
                //共享数据到末尾
                if (Desk.count == 0){
                    break;
                  //共享数据没有到末尾
                }else {
                    //1、判断桌子上是否有食物
                    //2、如果有，就等待
                    //3、如果没有，就制作食物
                    //4、修改桌子上的食物状态
                    //5、叫醒消费者，开吃
                    if(Desk.foodFlag == 1){
                        //1表示有，用锁对象调用wait方法等待
                        try {
                            Desk.lock.wait();//让当前线程与锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //非1表示没有，制作食物
                        System.out.println(getName()+"做了一碗面条");
                        //修改桌子上的食物状态
                        Desk.foodFlag = 1;
                        //唤醒消费者开吃
                        Desk.lock.notifyAll();//唤醒这把锁绑定的所有线程
                    }
                }
            }
        }
    }
}
