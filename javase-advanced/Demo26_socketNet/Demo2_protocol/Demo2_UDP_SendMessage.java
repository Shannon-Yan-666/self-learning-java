package Demo26_socketNet.Demo2_protocol;

import java.io.IOException;
import java.net.*;

/**
 * 目标：UDP通信程序（发送数据）-DatagramSocket
 */
public class Demo2_UDP_SendMessage {
    public static void main(String[] args) throws IOException {
        //需求：发送数据

        //1、创建DatagramSocket对象
        //细节：绑定端口，通过这个端口往外发送数据
        //空参：所有可用的端口中随机一个进行使用
        //有参：指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();

        //2、打包数据
        String str = "Hello World";//消息内容
        byte[] bytes = str.getBytes();//str打包成字节数组
        InetAddress address = InetAddress.getByName("127.0.0.1");//本机IP
        int port = 8080;//端口号
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);//打包数据

        //3、发送数据
        ds.send(dp);

        //4、释放资源
        ds.close();

    }
}
