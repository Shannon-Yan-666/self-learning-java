package Demo26_socketNet.Demo2_protocol.Test7_SenFile_ThreadPool;

import java.io.*;
import java.net.Socket;

/**
 * TCP通信练习--上传文件（多线程版)
 * 想要服务器不停止，能接收很多用户上传的图片。
 * 该怎么做呢?
 * 提示：可以用循环或者多线程。
 * 但是循环不合理，最优解法是（循环+多线程）改写
 */
public class Test7_Client {
    public static void main(String[] args) throws IOException {
        //图片路径：slef_learning\src\Demo26_socketNet\Demo2_protocol\Test4_SendFile\clientdir\bonnie.jpg
        //1、创建Socket对象，并连接服务器
        Socket socket = new Socket("127.0.0.1", 1111);

        //2、读取本地文件中的数据，并写到服务器当中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("slef_learning\\src\\Demo26_socketNet\\Demo2_protocol\\Test4_SendFile\\clientdir\\bonnie.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        //读取多少，就写出多少
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //写出结束标记，仅适用于一次性发送全部数据的场景（文件传输）
        socket.shutdownOutput();

        //3、接收服务器的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);

        //4、释放资源
        socket.close();
    }
}
