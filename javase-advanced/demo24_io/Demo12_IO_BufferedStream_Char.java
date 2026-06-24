package demo24_io;

import java.io.*;

/**
 * 目标：BufferedStream-char 了解字节缓冲流（高级流）
 *        字符缓冲流：（提升效果不明显，因为基本流底层已经带有缓冲区）
 *                   但字符缓冲流底层有两个好用的特有方法！！！
 *                 底层原理：底层自带了长度为8192（字符数组：长度16k）的缓冲区，提高性能
 *                 BufferedReader:字符缓冲输入流
 *                 BufferedWriter:字符缓冲输出流
 *                 方法：
 *                        构造方法                       说明
 *               public BufferedReader(Reader r)     把基本流变成高级流
 *               public BufferedWriter(Writer r)     把基本流变成高级流
 *                        特有方法                       说明
 *               public String readLine()   （输入流特有）读取一行数据，如果没有数据可读了，会返回null
 *               public  void  newLine()    （输出流特有）跨平台的换行
 *
 */
public class Demo12_IO_BufferedStream_Char {
    public static void main(String[] args) throws IOException {
        //1、创建字符缓冲输入/输出流的对象
        BufferedReader br = new BufferedReader(new FileReader("slef_learning\\b.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("slef_learning\\d.txt",true));//打开File的续写开关

        //2、读取数据
//        //一次读取一行
//        String line = br.readLine();
//        System.out.println(line);
//
//        //一次读取多行
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }

        //2、写出数据
        bw.write("Engfa 俺稀罕你");
        bw.newLine();
        bw.write("Engfa 跳舞好看");
        bw.newLine();

        //3、释放资源
        br.close();
        bw.close();


    }
}
