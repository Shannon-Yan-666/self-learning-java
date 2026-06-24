package demo24_io;

import java.io.*;

/**
 * 目标：BufferedStream-byte 了解字节缓冲流（高级流）
 *       字节缓冲流：（显著提高性能）
 *                 底层原理：底层自带了长度为8192（字节数组：长度8k）的缓冲区，提高性能
 *                         缓冲取的数据传输/读写，是在内存中进行的，内存的运算速度极快。节约了读写与硬盘之间传输/运算的时间
 *                 BufferedInputStream:字节缓冲输入流
 *                 BufferedOutputStream:字节缓冲输出流
 *                方法：
 *                          构造方法                                    说明
 *          public BufferedInputStream(InputStream is)    把基本流包装成高级流，提高读取数据的性能
 *          public BufferedOutputStream(OutputStream os)   把基本流包装成高级流，提高写出数据的性能
 */
public class Demo11_IO_BufferedStream_Byte {
    public static void main(String[] args) throws IOException {
        //需求：利用字节缓冲流，拷贝文件
        //1、创建缓冲流的对象
        //读取
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("slef_learning\\b.txt"));
        //写出
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("slef_learning\\copy.txt"));

//        //2、循环读取，并拷贝到目的地（一次读写一个字节）
//        int b;
//        while ((b = bis.read()) !=-1){
//            bos.write(b);
//        }

        //（一次读写多个字节）
        //创建字节数组：一次读取1024个字节
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

        //3、释放资源
        //底层：会关闭基本流
        bos.close();
        bis.close();
    }
}
