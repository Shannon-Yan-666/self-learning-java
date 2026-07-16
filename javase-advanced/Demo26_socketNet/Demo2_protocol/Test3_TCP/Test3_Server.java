package Demo26_socketNet.Demo2_protocol.Test3_TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP通信练习2---接收和反馈
 * 服务器：接收数据并打印，再给客户端反馈消息
 */

public class Test3_Server {
    public static void main(String[] args) throws IOException {
        //1、创建对象，并绑定8686端口
        ServerSocket ss = new ServerSocket(8686);
        System.out.println("Server listening on port 8686");

        //2、等待客户端连接
        Socket socket = ss.accept();
        System.out.println("Client connected");

        //3、读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        //4、回复数据
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        //循环收发
        while (true) {
            String str = br.readLine();
            System.out.println("客户端消息: " + str);
            if ("886".equals(str)) {
                break;
            }
            System.out.println("请输入回复消息：");
            String str1 = sc.nextLine();
            osw.write(str1 + "\n");
            osw.flush();
        }

        //5、释放资源
        socket.close();
        ss.close();
    }
}
