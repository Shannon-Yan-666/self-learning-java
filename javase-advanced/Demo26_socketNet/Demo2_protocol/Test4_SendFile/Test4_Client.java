package Demo26_socketNet.Demo2_protocol.Test4_SendFile;

import java.io.*;
import java.net.Socket;

/**
 * TCP通信练习3---上传文件
 * 客户端：将本地文件上传到服务器。接收服务器的反馈。
 * 服务器：接收客户端上传的文件，上传完毕之后给出反馈。
 * 通过三次握手协议保证连接建立
 * 客户端Socket:FileInputStream读取本地文件
 * 服务器ServerSocket:FileOutputStream保存
 */
public class Test4_Client {
    public static void main(String[] args) throws IOException {
        //图片路径：slef_learning\src\Demo26_socketNet\Demo2_protocol\Test4_SendFile\clientdir\bonnie.jpg
        //1、创建Socket对象，并连接服务器
        Socket socket = new Socket("127.0.0.1", 2222);

        //2、读取本地文件中的数据，并写到服务器当中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("slef_learning\\src\\Demo26_socketNet\\Demo2_protocol\\Test4_SendFile\\clientdir\\bonnie.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        //读取多少，就写出多少
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        bos.flush();
        //写出结束标记，仅适用于一次性发送全部数据的场景（文件传输）
        socket.shutdownOutput();

        //3、接收服务器的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);

        //4、释放资源
        bis.close();
        socket.close();
    }
}
