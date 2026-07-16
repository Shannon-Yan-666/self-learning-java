package Demo26_socketNet.Demo2_protocol.Test8_BS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP通信练习1---多发多收
 * 了解BS架构：接收浏览器传输过来的数据，回写数据是回写给浏览器
 * 服务器：接收多次接收数据，并打印
 * 浏览器访问地址：127.0.0.1:10000
 */
public class Test8_Server {
    public static void main(String[] args) throws IOException {
        //1、创建对象，绑定10000端口
        ServerSocket serverSocket = new ServerSocket(10000);

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
