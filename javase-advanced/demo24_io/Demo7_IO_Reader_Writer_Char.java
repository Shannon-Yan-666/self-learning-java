package demo24_io;

/**
 *  目标：了解字符流
 *      Reader：抽象父类，字符输入流
 *      Writer：抽象父类，字符输出流
 *  底层：
 *      字符流的底层其实就是字节流，底层有缓冲区（8192字节）
 *      字符流 = 字节流 + 字符集
 *  特点：
 *      输入流：一次读取一个字节，遇到中文时，一次读取多个字节（读取的字节数量与字符集有关）
 *      输出流：底层会把数据按照指定的编码方式继续编码，变成字节再写到文件中
 *  使用场景：
 *      对于纯文本文件进行读写操作（中文） FileReader/FileWriter
 *
 */
public class Demo7_IO_Reader_Writer_Char {
    public static void main(String[] args) {

    }
}
