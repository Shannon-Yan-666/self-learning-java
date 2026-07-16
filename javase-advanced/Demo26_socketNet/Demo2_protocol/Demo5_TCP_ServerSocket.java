package Demo26_socketNet.Demo2_protocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 目标：TCP通信程序-服务器ServerSocket
         * 1、创建服务器端的Socket对象(ServerSocket)
            ServerSocket(int port)
         * 2、监听客户端连接，返回一个Socket对象
            Socket accept()
         * 3、获取输入流，读数据，并把数据显示在控制台
            InputStream getInputStream()
         * 4、释放资源
            void close()
 */

public class Demo5_TCP_ServerSocket {
    public static void main(String[] args) throws IOException {
        //需求：TCP协议-接收数据

        //1、创建ServerSocket对象
        ServerSocket ss = new ServerSocket(8888);

        //2、监听客户端连接
        Socket socket = ss.accept();

        //3、获取输入流-读取数据
        InputStream is = socket.getInputStream();
        //转换流，将字节流转换为字符流，解决中文乱码问题
        InputStreamReader isr = new InputStreamReader(is);
        //增加缓冲流，提高读取效率
        BufferedReader br = new BufferedReader(isr);
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));


        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        //4、释放资源
        socket.close();
        ss.close();
    }
}
