package Demo26_socketNet.Demo2_protocol;

/**
 * 目标：了解网络编程-协议
 * 概念：计算机网络中，连接和通讯的规则被成为网络通信协议
 *
 * UDP协议：用户数据协议（User Datagram Protocol）
 *      UDP是 面向无连接 通信协议
 *      特点：速度快，有大小限制一次最多发送64K，数据不安全，易丢失数据
 *      UDP三种通信方式：
 *                 单播（DatagramSocket）
 *                 组播（MulticastSocket）
 *                      组播地址：224.0.0.0~239.255.255.255
 *                             其中224.0.0.0~224.0.0.255为预留的组播地址
 *                 广播（DatagramSocket）
 *                      广播地址：255.255.255.255
 * TCP协议：传输控制协议TCP（Transmission Control Protocol）
 *      TCP协议是 面向连接 通信协议
 *      特点：速度慢，没有大小限制，数据安全。
 *      TCP通信程序：
         *      TCP通信协议是一种可靠的网络协议，它在通信的两端各简历一个Socket对象
         *      通信之前要确保连接已经简历
         *      通过Socket产生IO流来进行网络通信
 *                  输出流->写出                输入流->读取
 *              客户端---->-通信之前保证连接已简历-->----服务器
 *              Socket                          ServerSocket
 */
public class Demo1_Protocol_UDP_TCP_feature {
    public static void main(String[] args) {

    }
}
