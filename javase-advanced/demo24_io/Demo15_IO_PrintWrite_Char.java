package demo24_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
 * PrintWriter（字符打印流）-方法：
 *              构造方法                                                            说明
 * public PrintWriter(Write/File/String)                                    关联字节输出流/文件/文件路径
 * public PrintWriter(String fileName, Charset charset)                     指定字符编码
 * public PrintWriter(Write w, boolean autoFlush)                           自动刷新（字符流底层有缓冲区，想要自动刷新需要开启）
 * public PrintWriter(OutputStream out, boolean autoFlush, Charset charset) 指定字符编码且自动刷新
 *
 *             成员方法                                               说明
 * public void Write(...)                            常规方法：规则跟之前一样，将指定的字节写出（无自动换行）
 * public void println(Xxx xx)                       特有方法：打印任意数据，自动刷新，自动换行（数据原样写出）
 * public void print(Xxx xx)                         特有方法：打印任意类型数据，不换行（数据原样写出）
 * public void printf(String format, Object... args) 特有方法：带有占位符的打印语句（数据原样写出）
 */
public class Demo15_IO_PrintWrite_Char {
    public static void main(String[] args) throws IOException {
        //1、创建字符打印流的对象
        PrintWriter pw = new PrintWriter(new FileWriter("slef_learning\\d15.txt"),true);//开启自动刷新

        //2、写出数据
        pw.println("Hello World");
        pw.print("你好世界");
        pw.println();
        pw.printf("%s爱上了%s","英法","EnShaw");

        //3、释放资源
        pw.close();
    }
}
