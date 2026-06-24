package demo24_io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 目标：FileInputStream文件字节输入流-一次读取多个字节
 *
 *       硬盘      输入通道    读取数据   临时变量     写出数据     输出通道      硬盘
 *      数据源--创建输入流对象-->read() -->int b--> write(b)--创建输出流对象-->目的地
 *
 *      读取数据的小问题：
 *                弊端：一次读写一个字节，速度太慢
 * 方法：
 *                方法                 说明
 * public  int  read()          一次读取一个字节数据
 * public  int  read(byte[] b)  一次读取一个字节数据数据
 *                          （每次读取会尽可能把数组装满，数据长度使用1024的整数倍）
 *                                                   1024 * 1024 * 5
 */
public class Demo5_IO_FileInputStream_Byte_English {
    public static void main(String[] args) throws IOException {
        //1.创建对象
        FileInputStream fis = new FileInputStream("slef_learning\\a.txt");

        //2.读取数据
        //2.1.创建一个字节数组
        byte[] bytes = new byte[2];//长度为2的数组
//        byte[] bytes1 = new byte[1024 * 1024 * 5];//长度为5M的数组

        //2.2.int read(byte[] b)方法：一次读取一个字节数据数据
        //具体读多长，和数组的长度有关，数组越长，读取的越多

        //创建临时变量 read：记录读了几个数据
        int read = fis.read(bytes);//读取2个字节的数据
        System.out.println(read);//2

        //2.3.把读取到的数据，转换为字符串，进行打印
        //细节：读取到末尾，出现的读取有误的问题（因为每次读取会尽可能把数组装满）
                                    // 参数二：表示从0索引读取
                                            //参数三：读取长度为：read
        String str = new String(bytes,0,read);
        System.out.println(str);

        //3.释放资源
        fis.close();
    }
}
