package demo24_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  目标：掌握FileReader-字符输入流
 *  底层：
 *      字符流的底层其实就是字节流，字符流底层有缓冲区（字节流没有）
 *      字符流 = 字节流 + 字符集
 *  特点：
 *      输入流：一次读取一个字节，遇到中文时，一次读取多个字节（读取的字节数量与字符集有关）
 *  使用场景：
 *      对于纯文本文件进行读写操作（中文） FileReader/FileWriter
 *
 *  步骤：
 *      1、创建字符输入流对象：（细节：读取文件不存在时报错）
 *         底层：关联文件，并创建缓冲区（长度位8192的字节数组）
 *                  构造方法                                说明
 *          public  FileReader(File file)           创建字符输入流关联本地文件（File对象表示的路径）
 *          public  FileReader(String pathname)     创建字符输入流关联本地文件（字符串表示的路径，底层也是File对象）
 *      2、读取数据
 *          底层：1、判断缓冲区中是否有数据可以读取
 *               2、缓冲区没有数据：就从文件中获取数据，装到缓冲区中，每次尽可能装满缓冲区
 *                              如果文件中没有数据了，返回 -1
 *               3、缓冲区有数据：就从缓冲区中读取
 *                        空参read方法：把字节解码并转成十进制返回。（查看英文/汉字，需手动强转为char）
 *                        有参reda方法：把读取字节，解码，强转三步合并，强转之后的字符放到数组中
 *                  成员方法                                说明
 *          public  int  read()                     读取数据，读到末尾返回-1
 *          public  int  read(char[] buffer)        读取多个数据，读到末尾返回-1
 *
 *          细节1：按字节进行读取，遇到中文，一次读多个字节，读取后解码，返回一个整数
 *          细节2：读到文件末尾，read方法返回 -1
 *      3、释放资源（关流）
 *                  成员方法                 说明
 *           public  int  close()       释放资源/关流
 */
public class Demo8_IO_FileReader_Char {
    public static void main(String[] args) throws IOException {
        //1. 创建对象并关联本地文件
        //有异常直接抛出处理
        FileReader fr = new FileReader(new File("slef_learning\\b.txt"));

//        //2.读取数据
//        // read() ：空参方法
//        //创建临时变量：依次表示当前读取到的数据
//        int ch;
//        while ((ch = fr.read()) != -1){
//            System.out.print((char)ch);//把十进制，强制类型转换为char类型
//        }

        // read(char[] buffer)：有参方法，相当于空参read方法+强制类型转换
        //创建char类型的数组
        char[] chars = new char[2];//数组长度为2，表示一次读取两个数据
        //创建临时变量，表示当前读取的数量
        int len;
        while ((len = fr.read(chars)) != -1){
            //把数组中的数据变成字符串，再继续进行打印
            //细节：读取多少个，就转多少个，避免结尾读取不满
            System.out.print(new String(chars,0,len));
        }

        //3.释放资源/关流
        fr.close();

    }
}
