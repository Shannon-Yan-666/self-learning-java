package demo24_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 练习：文件拷贝-小文件拷贝
 * 文件：D:\aaa\movie.mp4
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long start = System.currentTimeMillis();

        //1.创建对象
        //读取数据
        FileInputStream fis = new FileInputStream("D:\\aaa\\movie.mp4");
        //写出数据
        FileOutputStream fos = new FileOutputStream("slef_learning\\copy.mp4");

//        //2.拷贝-方式一  核心思想：边读边写
//        //定义一个第三方变量，记录当前读取到的*数据*
//        int read;
//                //读取每一个数据
//        while ((read = fis.read()) !=-1){
//            //写入每一个数据
//            fos.write(read);
//        }

        //2.拷贝-方式二 边读边写
        //定义一个三方变量，记录当前读取到的*字节个数*
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];//5M字节数组
        while ((len = fis.read(bytes)) != -1){
                     // 参数二：表示从0索引写出
                              //参数三：读取长度为len
            fos.write(bytes,0,len);
        }

        //3.释放资源
        //规则：先开的流，最后再关闭
        fos.close();//后开的流
        fis.close();//掀开的流

        //记录结束时间
        long end = System.currentTimeMillis();
        //打印运行时长：毫秒   秒（/1000）
        System.out.println(end-start);
    }
}
