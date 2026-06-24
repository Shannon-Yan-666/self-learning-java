package demo24_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  目标：掌握FileWriter-字符输出流
 *  底层：
 *      字符流的底层其实就是字节流，字符流底层有缓冲区（字节流没有）
 *      字符流 = 字节流 + 字符集
 *  特点：
 *      输出流：底层会把数据按照指定的编码方式继续编码，变成字节再写到文件中
 *  使用场景：
 *      对于纯文本文件进行读写操作（中文） FileReader/FileWriter
 *
 *  构造方法：
 *                  方法                                          说明
 *  public  FileWriter(File file)                           创建字符输出流关联本地文件（File对象表示的路径）
 *  public  FileWriter(String pathname)                     创建字符输出流关联本地文件（字符串表示的路径，底层也是File对象）
 *  public  FileWriter(File file , boolean append)          创建字符输出流关联本地文件，续写（File对象表示的路径）
 *  public  FileWriter(String pathname , boolean append)    创建字符输出流关联本地文件，续写（字符串表示的路径，底层也是File对象）
 *
 *  成员方法：
 *           成员方法                                   说明
 *  void  write(int C)                             写出一个字符
 *  void  write(String str)                        写出一个字符串
 *  void  write(String str , int off , int len)    写出一个字符串的一部分
 *  void  write(char[] cbuf)                       写出一个字符数组
 *  void  write(char[] cbuf , int off , int len)   写出字符数组的一部分
 *
 *  步骤：
 *      1、创建字符输出流对象
 *              细节1：参数是字符串表示的路径/File对象
 *              细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
 *              细节3：如果文件已存在，则会清空文件，如果不想清空可以打开续写开关
 *      2、写数据
 *              细节：write方法的参数是整数，实际写入到本地文件中的是字符集上对应的字符
 *      3、释放资源/关流：
 *              每次使用后都要释放资源
 */
public class Demo9_IO_FileWriter_Char {
    public static void main(String[] args) throws IOException {
        //1.创建字符输出流
        FileWriter fw = new FileWriter(new File("slef_learning\\c.txt"),true);
        //2.写数据
//        //write(String str)方法：写出一个字符串
//        fw.write("Hello 夏洛特");

        //write(char[] cbuf)方法：写出一个字符数组
        char[] chars = { '你', '是', '一', '位', '大', '美', '女' };
        fw.write(chars);

        //3，释放资源
        fw.close();

    }
}
