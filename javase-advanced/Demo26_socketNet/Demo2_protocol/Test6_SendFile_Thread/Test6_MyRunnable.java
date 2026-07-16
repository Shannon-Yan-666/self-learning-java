package Demo26_socketNet.Demo2_protocol.Test6_SendFile_Thread;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class Test6_MyRunnable implements Runnable {
    Socket socket;
    public Test6_MyRunnable(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            //4、释放资源
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
