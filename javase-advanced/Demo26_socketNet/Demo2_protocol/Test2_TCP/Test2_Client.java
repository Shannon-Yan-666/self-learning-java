package Demo26_socketNet.Demo2_protocol.Test2_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * TCP通信练习1---多发多收
 * 客户端：多次发送数据
 */
public class Test2_Client {
    public static void main(String[] args) throws IOException {
        //1、创建Socket对象，并连接服务端
        Socket socket = new Socket("127.0.0.1",6666);
        //2、写出数据
        Scanner sc = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();
        while (true) {
            System.out.println("请输入您要发送的消息：");
            String line = sc.nextLine();
            if ("886".equals(line)) {
                break;
            }
            os.write(line.getBytes());
        }

        //3、释放资源
        socket.close();
    }
}
