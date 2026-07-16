package Demo26_socketNet.Demo2_protocol.Test1_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 练习：聊天室
 * 按照下面的要求实现程序
 * UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
 * UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
 */
public class Test1_ReceiveMessage {
    public static void main(String[] args) throws IOException {
        //1、创建对象
        DatagramSocket ds = new DatagramSocket(10010);

        //2、接收数据包
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        while (true) {
            ds.receive(dp);

            //3、解析数据包
            byte[] data = dp.getData();//获取数据
            int len = dp.getLength();//获取当前接收多少字节
            String ip = dp.getAddress().getHostAddress();//获取IP
            String name= dp.getAddress().getHostName();//获取主机名

            //4、打印数据
            System.out.println("IP为：" + ip + "，主机名为：:" + name + "的人，发送了数据:" + new String(data, 0, len));
        }

    }
}
