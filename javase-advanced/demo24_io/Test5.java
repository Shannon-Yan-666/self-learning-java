package demo24_io;

import java.io.*;

/**
 * 综合练习5：拷贝文件
 * 需求:
     * 四种式拷件，并统计各自用时
         * 字节流的基本流：一次读写一个字节
         * 字节流的基本流：一次读写一个字节数组
         * 字节缓冲流：一次读写一个字节
         * 字节缓冲流：一读写一个字节数组
 *
 */
public class Test5 {
    public static void main(String[] args) throws IOException {
        //1、创建读写对象：byte基本流/缓冲流
        FileInputStream fis = new FileInputStream("slef_learning\\a.txt");
        FileOutputStream fos = new FileOutputStream("slef_learning\\test5.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //创建开始时间
        long start = System.currentTimeMillis();

        //2、读写
        //2.1、字节流的基本流：一次读写一个字节
//        int b;
//        while ((b = fis.read()) != -1) {
//            fos.write(b);
//        }

        //2.2、字节流的基本流：一次读写一个字节数组
        byte[] arr = new byte[8192];
        int len;
        while ((len = fis.read(arr)) != -1) {
            fos.write(arr, 0, len);
        }


        //2.3、字节缓冲流：一次读写一个字节
//        int b1;
//        while ((b1 = bis.read()) != -1) {
//            bos.write(b1);
//        }

        //2.4、字节缓冲流：一读写一个字节数组
//        byte[] bytes = new byte[8192];
//        int len;
//        while ((len = bis.read(bytes)) != -1) {
//            bos.write(bytes, 0, len);
//        }


        //3、关流
        bos.close();
        bis.close();
        fos.close();
        fis.close();

        ///创建结束时间
        long end = System.currentTimeMillis();
        //计算用时时长（秒）
        System.out.println((start - end)/1000.0 + "s");
    }
}
