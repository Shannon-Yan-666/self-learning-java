package Demo26_socketNet.Demo2_protocol;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 目标：UDP通信程序（接收数据）-DatagramSocket
 */
public class Demo3_UDP_ReceiveMessage {
    public static void main(String[] args) throws IOException {
        //需求：接收数据

        //1、创建DatagramSocket对象
        //细节：在接收的时候，一定要绑定端口，要跟发送的端口保持一致。
        DatagramSocket ds = new DatagramSocket(8080);

        //2、接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //细节：receive()方法是阻塞的（死等），程序会等发送端发送消息
        ds.receive(dp);

        //3、解析数据包
        byte[] data = dp.getData();//获取数据
        int len = dp.getLength();//获取多少字节数据
        InetAddress address = dp.getAddress();//IP
        int port = dp.getPort(); //端口

        System.out.println("接收到数据："+ new String(data, 0, len));
        System.out.println("该数据是从：" + address + " 这台电脑中的：" + port + " 端口发出。");

        //4、释放资源
        ds.close();


    }
}
