package demo25_thread.Test2;

import demo25_thread.MyThread;

/**
 * 练习2：抢红包完整代码
 * 需求梳理:
     * 总金额 100 元，预先分成 3 个红包（3 份共享资源）
     * 5 个线程模拟 5 个人同时抢红包
     * 红包是共享数据，必须加同步锁保证线程安全，一个红包只能被一个人抢到
     * 输出格式：
 *          抢到则打印「XX 抢到 XX 元」
 *          无红包则打印「XX 没抢到」
 */
public class Test2 {
    public static void main(String[] args) {
        //创建线程
        MyRedPacketsThread t1 = new MyRedPacketsThread();
        MyRedPacketsThread t2 = new MyRedPacketsThread();
        MyRedPacketsThread t3 = new MyRedPacketsThread();
        MyRedPacketsThread t4 = new MyRedPacketsThread();
        MyRedPacketsThread t5 = new MyRedPacketsThread();

        //命名
        t1.setName("Bonnie");
        t2.setName("Engfa");
        t3.setName("蓝莓");
        t4.setName("王邦邦");
        t5.setName("nini");

        //启动
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
