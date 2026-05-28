package demo08_runtime_api;

import java.io.IOException;

/**
 * 目标：掌握Runtime（非静态） API方法
 *      当前虚拟机的运行环境（单例模式）
 *                      方法名                         说明
 * public static    Runtime getRuntime()       当前系统的运行环境对象
 * public void      exit(int status)           停止虚拟机
 * public int       availableProcessors()      获得CPU的线程数
 * public long      maxMemory()                JVM能从系统中获取总内存大小(单位byte)
 * public long      totalMemory()              JVM己经从系统中获取总内存大小(单位byte)
 * public long      freeMemory()               JVM剩余内存大小(单位byte)
 * public Process exec(String command)         运行cmd命令
 *
 */
public class demo01_Runtime_api {
    public static void main(String[] args) throws IOException {
        //1.获取Runtime的对象
//        Runtime r1 = Runtime.getRuntime();

        //2.exit(int status)
        // 停止虚拟机
//        r1.exit(0);
//        Runtime.getRuntime().exit(0);

        //3.availableProcessors()
        // 获得CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //4.maxMemory()
        // JVM能从系统中获取总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);//兆

        //5.totalMemory()
        // JVM己经从系统中获取总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        //6. freeMemory()
        // JVM剩余内存大小(单位byte)
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //7.public Process exec(String command)
        // 运行cmd命令
        // 快捷键alt + 回车

        //shutdown：关机  （加上参数才能执行）
        //-s  ： 默认在1分钟之后关机
        //-s -t 指定时间 ： 指定关机时间
        //-a  ： 取消关机操作
        //-r  ： 关机并重启
//        Runtime.getRuntime().exec("shutdown -a");
//        Runtime.getRuntime().exec("notepad");
    }
}
