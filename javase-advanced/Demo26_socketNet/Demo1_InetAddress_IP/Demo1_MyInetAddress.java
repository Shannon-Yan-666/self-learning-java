package Demo26_socketNet.Demo1_InetAddress_IP;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 目标：了解网络编程-IP，InetAddress类的使用
 * 概念：IP全称 Internet Protocol ，是互联网协议地址，也称IP地址。
 *      是分配给上网设备的数字标签。（唯一的）
 *
 * IPv4的特点：目前主流方案，最多只有2^32次方个IP，目前已经用完了
 * IPv6的特点：为了解决IPv4不够用而出现的，最多有2^128次方个IP，可以为地球上的每一粒沙子都设定IP
 *
 *              方法名                                说明
 * static InetAddress getByName(String host)    确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
 * String getHostName( )                        获取此IP地址的主机名
 * String getHostAddress( )                     返回文本显示中的IP地址字符串
 */
public class Demo1_MyInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        //1、获取InetAddress的对象
        //IP的对象：一台电脑的对象
        InetAddress address = InetAddress.getByName("192.168.1.100");//有异常直接抛出
        System.out.println(address);

        String name = address.getHostName();
        //细节：因为网络原因或局域网中没有这台电脑，是获取不到主机名，会返回IP名
        System.out.println(name);

        String ip = address.getHostAddress();
        System.out.println(ip);
    }
}
