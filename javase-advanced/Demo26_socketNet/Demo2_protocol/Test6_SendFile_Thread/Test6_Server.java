package Demo26_socketNet.Demo2_protocol.Test6_SendFile_Thread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * TCP通信练习--上传文件（多线程版)
 * 想要服务器不停止，能接收很多用户上传的图片。
 * 该怎么做呢?
 * 提示：可以用循环或者多线程。
 * 但是循环不合理，最优解法是（循环+多线程）改写
 */
public class Test6_Server {
    public static void main(String[] args) throws IOException {
        //1、创建对象，并绑定端口
        ServerSocket serverSocket = new ServerSocket(1111);
        System.out.println("Server started");

        //循环接收
        while (true) {
            //2、等待客户端来连接
            Socket socket = serverSocket.accept();
            System.out.println("Accepted connection from " + socket.getRemoteSocketAddress());

            //开启一条线程：一个用户对应一条线程
            new Thread(new Test6_MyRunnable(socket)).start();

        }

    }
}
