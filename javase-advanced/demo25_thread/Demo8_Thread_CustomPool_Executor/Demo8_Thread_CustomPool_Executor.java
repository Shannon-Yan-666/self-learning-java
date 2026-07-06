package demo25_thread.Demo8_Thread_CustomPool_Executor;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 目标：了解自定义线程池
 * ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
 * (核心线程数量，最大线程数量,空闲线程最大存活时间,任务队列，创建线程工厂，任务的拒绝策略）
 *
 * 自定义线程池的七个参数作用：
 * 参数一：核心线程数量               不能小于0
 * 参数二：最大线程数                不能小于等于0，最大数量>=核心线程数量
 * 参数三：空闲线程最大存活时间        不能小于0
 * 参数四：时间单位                 用TimeUnit指定
 * 参数五：任务队列                 不能为nu11
 * 参数六：创建线程工厂              不能为nu11
 * 参数七：任务的拒绝策略            不能为nu11
 *
 * 自定义线程池的工作原理
 * 1、创建一个空的池子
 * 2、有任务提交时，线程池会创建线程去执行任务，任务完毕归还线程
 *
 * 不断提交的任务，会有以下三个临界点：
 *                  1、当核心线程满时，再提交任务就会排队
 *                  2、当核心线程满时，队伍满时，会创建临时线程
 *                  3、当核心线程满时，队伍满，临时线程满时，会触发任务拒绝策略
 *
 * 线程池多大合适呢？
 * CPU密集型运算： 最大并行数 + 1
 * 1/0密集型运算： 最大并行数 * 期望CPU利用率 *（总时间(CPU计算时间+等待时间)/CPU计算时间）
 * 测试工具：thread dump  （cpu计算时间和等待时间）
 * 举例：从本地文件中，读取两个数据，并进行相加
 * 操作一：读取两个数据 (1秒钟)
 * 操作二：相加 (1秒钟)
 * 4核8线程：  8 * 100% *（100% / 50%）= 16
 */
public class Demo8_Thread_CustomPool_Executor {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//参数一：核心线程数量    不能小于0
                6,//参数二：最大线程数     不能小于等于0，最大数量>=核心线程数量
                60,//参数三：空闲线程最大存活时间    不能小于0
                TimeUnit.SECONDS,//参数四：时间单位   用TimeUnit指定
                new LinkedBlockingQueue<>(3),//参数五：任务队列     不能为nu11
                Executors.defaultThreadFactory(),//参数六：创建线程工厂    不能为nu11
                new ThreadPoolExecutor.AbortPolicy()//参数七：任务的拒绝策略   不能为nu11
        );

//        pool.submit()//提交任务
    }
}
