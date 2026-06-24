package demo24_io;


/**
 * 目标：了解缓冲流（高级流）的体系结构
 * 缓冲流的体系：
 *       字节缓冲流：（显著提高性能）
 *                 底层原理：底层自带了长度为8192（字节数组：长度8k）的缓冲区，提高性能
 *                         缓冲取的数据传输/读写，是在内存中进行的，内存的运算速度极快。节约了读写与硬盘之间传输/运算的时间
 *                 BufferedInputStream:字节缓冲输入流
 *                 BufferedOutputStream:字节缓冲输出流
 *
 *                方法：
 *                         构造方法                                    说明
 *          public BufferedInputStream(InputStream is)    把基本流包装成高级流，提高读取数据的性能
 *          public BufferedOutputStream(OutputStream os)   把基本流包装成高级流，提高写出数据的性能
 *
 *        字符缓冲流：（提升效果不明显，因为基本流底层已经带有缓冲区）
 *                     但字符缓冲流底层有两个好用的特有方法！！！
 *                 底层原理：底层自带了长度为8192（字符数组：长度16k）的缓冲区，提高性能
 *                 BufferedReader:字符缓冲输入流
 *                 BufferedWriter:字符缓冲输出流
 *
 *                 方法：
 *                        构造方法                       说明
 *               public BufferedReader(Reader r)     把基本流变成高级流
 *               public BufferedWriter(Writer r)     把基本流变成高级流
 *                        特有方法                       说明
 *               public String readLine()   （输入流特有）读取一行数据，如果没有数据可读了，会返回null
 *               public  void  newLine()    （输出流特有）跨平台的换行
 *
 */
public class Demo10_IO_Buffered_Architecture {
    public static void main(String[] args) {

    }

}
