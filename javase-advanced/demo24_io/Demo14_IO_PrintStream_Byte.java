package demo24_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/**
 * 目标：了解打印流（高级流）
 * 分类：打印流一般是指PrintStream（字节打印流）、PrintWriter（字符打印流）两个类
 * 特点1：打印流只操作文件目的地，不操作数据源
 * 特点2：特有的写出方法可以实现，数据原样写出
 *      例如：
 *          打印：97    文件中：97
 *          打印：true  文件中：ture
 * 特点3：特有的写出方法，可以实现自动刷新，自动换行
 *      打印一次数据 = 写出 + 换行 + 刷新
 *
 * PrintStream（字节打印流）-方法：
 *              构造方法                                                            说明
 * public PrintStream(OutputStream/File/String)                             关联字节输出流/文件/文件路径
 * public PrintStream(String fileName, Charset charset)                     指定字符编码
 * public PrintStream(OutputStream out, boolean autoFlush)                  自动刷新（字节流底层没有缓冲区，开不开自动刷新都一样）
 * public PrintStream(OutputStream out, boolean autoFlush, String encoding) 指定字符编码且自动刷新
 *
 *             成员方法                                               说明
 * public void Write(int b)                          常规方法：规则跟之前一样，将指定的字节写出（无自动换行）
 * public void println(Xxx xx)                       特有方法：打印任意数据，自动刷新，自动换行（数据原样写出）
 * public void print(Xxx xx)                         特有方法：打印任意数据，不换行（数据原样写出）
 * public void printf(String format, Object... args) 特有方法：带有占位符的打印语句，不换行（数据原样写出）
 */
public class Demo14_IO_PrintStream_Byte {
    public static void main(String[] args) throws FileNotFoundException {
        //1、创建字节打印流的对象
        PrintStream ps = new PrintStream(new FileOutputStream("slef_learning\\d14.txt"),true, Charset.forName("UTF-8"));
        //2、写出数据
        ps.println(97);//写出 + 换行 + 刷新
        ps.print(true);
        ps.println();
        ps.printf("%s爱上了%s","Engfa","我");//%s 占位符
        //3、释放资源
        ps.close();
    }
}
