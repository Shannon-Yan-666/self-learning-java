package Demo26_socketNet.Demo2_protocol;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 目标：TCP通信程序-客户端Socket
     * 1、创建客户端的Socket对象(Socket)与指定服务端连接
         Socket(String host, int port)
     * 2、获取输出流，写数据
          OutputStream getOutputStream()
     * 3、释放资源
          void close()
 */
public class Demo4_TCP_Socket {
    public static void main(String[] args) throws IOException {
        //需求：TCP协议-发送数据

        //1、创建Socket对象
        //细节：在创建对象的同时会连接服务端，如果连接不上，代码会报错
        Socket socket = new Socket("127.0.0.1",8888);

        //2、获取输出流-写出数据
        OutputStream os = socket.getOutputStream();//创建字节输出流
        os.write("Hello World - 你好呀！".getBytes());//写出字节信息

        //3、释放资源
        os.close();
        socket.close();
    }
}
