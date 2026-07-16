package Demo26_socketNet.Demo2_protocol.Test7_SenFile_ThreadPool;

import Demo26_socketNet.Demo2_protocol.Test6_SendFile_Thread.Test6_MyRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * TCP通信练习--上传文件（多线程版)
 * 想要服务器不停止，能接收很多用户上传的图片。
 * 该怎么做呢?
 * 提示：可以用循环或者多线程。
 * 但是循环不合理，最优解法是（循环+多线程）改写
 */
public class Test7_Server {
    public static void main(String[] args) throws IOException {
        //1、创建对象，并绑定端口
        ServerSocket serverSocket = new ServerSocket(1111);
        System.out.println("Server started");

        //创建线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量
                16,//线程池总大小
                60,//空闲时间
                TimeUnit.SECONDS,//空闲时间（单位）
                new ArrayBlockingQueue<>(2),//队列
                Executors.defaultThreadFactory(),//线程工厂，让线程池如何创建对象
                new ThreadPoolExecutor.AbortPolicy()//阻塞队列
        );

        //循环接收
        while (true) {
            //2、等待客户端来连接
            Socket socket = serverSocket.accept();
            System.out.println("Accepted connection from " + socket.getRemoteSocketAddress());

            //开启一条线程：一个用户对应一条线程
//            new Thread(new Test7_MyRunnable(socket)).start();
            pool.execute(new Test7_MyRunnable(socket));
        }

    }
}
