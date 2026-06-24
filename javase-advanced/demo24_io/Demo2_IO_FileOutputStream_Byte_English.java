package demo24_io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 目标：掌握 FileOutputStream-文件字节输出流
 * 作用：操作本地文件的字节输出流，可以把程序中的数据写到本地文件中。
 * 步骤：f
 *        1、创建字节输出流对象
 *             细节1：参数是字符串表示的路径/File对象
 *             细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
 *             细节3：如果文件已存在，则会清空文件，如果不想清空可以打开续写开关
 *        2、写出数据
 *              细节：write方法的参数是整数，实际写入到本地文件中的是ASCII上对应的字符
 *                                                          97 --> a
 *        3、释放资源（解除资源占用）
 *              每次使用完流之后，都要释放资源
 * 原理：在程序和文件中创建一条通道，写入数据，关闭通道释放资源
 *
 * 写数据方法：
 *          方法                                  说明
 * void write(int b)                        一次写一个字节数据
 * void write(byte[] b)                     一次写一个字节数组数据
 * void write(byte[] b, int off, int len)   一次写一个字节数组的部分数据
 *
 */
public class Demo2_IO_FileOutputStream_Byte_English {
    public static void main(String[] args) throws IOException {
        //需求：写出一段文件到本地文件中。（暂时不写中文）
        //1.创建对象
                                //提示：检查本地文件中是否有a.txt文件
                                 //编译时异常：alt + 回车 抛出处理
//        FileOutputStream fos = new FileOutputStream("slef_learning\\a.txt"); //字符串表示的路径
        FileOutputStream fos = new FileOutputStream(new File("slef_learning\\a.txt")); //File对象

        //2.写出数据
        // 有异常进行抛出处理

        //void write(int b)  一次写一个字节数据
//        fos.write(97);

        //void write(byte[] b) 一次写一个字节数组数据
        byte[] bytes = {97,98,99,100,101};// a b c d e
//        fos.write(bytes);

        //void write(byte[]b, int off, int len)   一次写一个字节数组的部分数据
                //参数一：数组
                        //参数二：起始索引
                                    //参数三：个数
        fos.write(bytes,1,2);// b c

        //3.释放资源
        // 有异常进行抛出处理
        fos.close();
    }
}
