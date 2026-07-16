package Demo26_socketNet.Demo2_protocol.Test2_TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信练习1---多发多收
 * 服务器：接收多次接收数据，并打印
 */
public class Test2_Server {
    public static void main(String[] args) throws IOException {
        //1、创建对象，绑定6666端口
        ServerSocket serverSocket = new ServerSocket(6666);

        //2、等待客户端来连接
        Socket socket = serverSocket.accept();

        //3、读取数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(isr);
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        //4、释放资源
        socket.close();
        serverSocket.close();
    }
}
