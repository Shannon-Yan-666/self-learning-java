package Demo26_socketNet.Demo2_protocol.Test4_SendFile;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * TCP通信练习3---上传文件
 * 客户端：将本地文件上传到服务器。接收服务器的反馈。
 * 服务器：接收客户端上传的文件，上传完毕之后给出反馈。
 * 通过三次握手协议保证连接建立
 * 客户端Socket:FileInputStream读取本地文件
 * 服务器ServerSocket:FileOutputStream保存
 */
public class Test4_Server {
    public static void main(String[] args) throws IOException {
        //1、创建对象，并绑定端口
        ServerSocket serverSocket = new ServerSocket(2222);
        System.out.println("Server started");

        //2、等待客户端来连接
        Socket socket = serverSocket.accept();
        System.out.println("Accepted connection from " + socket.getRemoteSocketAddress());

        //3、读取数据并保存到本地文件中
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());//读取
        String name = UUID.randomUUID().toString().replace("-", "");//随机且唯一
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("slef_learning\\src\\Demo26_socketNet\\Demo2_protocol\\Test4_SendFile\\serverdir\\" + name + ".jpg"));//接收
        byte[] bytes = new byte[1024];
        int len;
        //读多少就写多少
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();

        //4、释放资源
        bos.close();
        bis.close();
        bw.close();

        socket.close();
        serverSocket.close();
    }
}
