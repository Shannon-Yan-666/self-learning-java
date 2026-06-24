package demo24_io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 目标：掌握FileInputStream-字节输入流
 * 作用：操作本地文件的字节输入流，可以把本地文件中的数据读取到程序中来。
 *
 * 步骤：
 *      1、创建字节输入流对象
 *              细节：如果文件不存在，直接报错
 *      2、读取数据：
 *              细节1：一次读一个字节，读出来的数据在ASCII上对应的数字
 *                                             69 --> E
 *              细节2：读到文件末尾后，read方法返回-1 (底层有指针，读取一位，后移一次)
 *      3、释放资源（解除资源占用）
 *            每次使用完流之后，都要释放资源
 * 原理：在程序和文件中创建一条通道，把文件中的数据，读取到程序中来，关闭通道释放资源
 *
 */
public class Demo4_IO_FileInputStream_Byte_English {
    public static void main(String[] args) throws IOException {
        //需求：读取文件中的数据。（暂时不写中文）
        //1.创建对象
                                    //提示：检查本地文件中是否有a.txt文件
                                    //编译时异常：alt + 回车 抛出处理
        FileInputStream fis = new FileInputStream("slef_learning\\a.txt");

        //2.读取数据
        // 有异常进行抛出处理
//        int read1 = fis.read();//一次读取一个数据
//        System.out.println(read1);
//        System.out.println((char) read1);//强转为字符

        //2.1.字节输入流循环读取
        //定义一个第三方变量，表示记录当前读取到的数据
        int read ;
        while ((read = fis.read()) != -1) {
            System.out.print((char) read);
        }

        //3.释放资源
        // 有异常进行抛出处理
        fis.close();
    }
}
