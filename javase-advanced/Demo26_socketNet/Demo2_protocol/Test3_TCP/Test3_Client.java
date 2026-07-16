package Demo26_socketNet.Demo2_protocol.Test3_TCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP通信练习2---接收和反馈
 * 客户端：发送一条数据，接收服务端反馈的消息并打印
 */
public class Test3_Client {
    public static void main(String[] args) throws IOException {
        //1、创建Socket对象，并连接服务器
        Socket socket = new Socket("127.0.0.1", 8686);

        //2、写出数据
        OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
        //3、读取数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        Scanner sc = new Scanner(System.in);
        //循环收发
        while (true) {
            System.out.println("请输入您要发送的信息：");
            String str = sc.nextLine();
            if ("886".equals(str)) {
                break;
            }
            osw.write(str + "\n");
            osw.flush();//刷新缓冲区，立刻发送

            String read = br.readLine();
            System.out.println("服务端消息：" + read);
        }

        //4、释放资源
        socket.close();
    }
}
