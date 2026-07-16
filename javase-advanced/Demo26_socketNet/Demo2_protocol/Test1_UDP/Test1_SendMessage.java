package Demo26_socketNet.Demo2_protocol.Test1_UDP;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * 练习：聊天室
 * 按照下面的要求实现程序
 * UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
 * UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
 */
public class Test1_SendMessage {
    public static void main(String[] args) throws IOException {
        //1、创建对象
        DatagramSocket ds = new DatagramSocket();

        //2、打包数据
        Scanner sc = new Scanner(System.in);//键盘扫描器
        while (true) {
            System.out.println("请数据您要说的话：");//提示语句
            String str = sc.nextLine();//接收键盘内容
            if ("886".equals(str)) {
                break;
            }
            byte[] bytes = str.getBytes();//将内容打包成字节数组
            InetAddress address = InetAddress.getByName("127.0.0.1");//IP地址
            int port = 10010;//端口号
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);//打包
            //3、发送数据
            ds.send(dp);
        }
        //4、释放资源
        ds.close();
    }
}
