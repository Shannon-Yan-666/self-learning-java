package demo25_thread.Demo5_Thread_Wait_Notify;

/**
 * 等待唤醒机制
 * 消费者：食客
 * 1、循环
 * 2、同步代码块（抽取方法）
 * 3、判断共享数据是否到了末尾（先写到了）
 * 4、判断共享数据是否到了末尾（没到，执行核心逻辑）
 */
public class Foodie extends Thread{
/*    //定义成员变量，表示阻塞队列
    ArrayBlockingQueue<String> queue;

    //构造方法
    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }*/

    @Override
    public void run() {
        while (true){
            synchronized(Desk.lock){
                //共享数据到末尾
                if(Desk.count == 0){
                    break;
                 //共享数据没有到末尾
                }else {
                    //1、判断桌子是是否有面条
                    //2、如果没有，就等待
                    //3、如果有，就开吃
                    //4、吃完之后，唤醒厨师继续做
                    //5、把吃的总数-1
                    //6、修改桌子的状态 foodFlag

                    //判断桌子上是否有面条
                    if(Desk.foodFlag == 0){
                        //0表示没有，用锁对象调用wait方法等待
                        try {
                            Desk.lock.wait();//让当前线程与锁进行绑定
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //吃的总数-1（先减再打印）
                        Desk.count--;
                        //非0表示有，开吃
                        System.out.println(getName()+"正在吃面条，还能再吃"+ Desk.count+"碗！！");
                        //吃完之后，唤醒厨师继续做
                        Desk.lock.notifyAll();//唤醒这把锁绑定的所有线程
                        //修改桌子状态
                        Desk.foodFlag = 0;
                    }
                }
            }
        }
    }
}
