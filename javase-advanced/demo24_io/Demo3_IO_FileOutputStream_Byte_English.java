package demo24_io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 目标：FileOutputStream文件字节输出流-换行/续写
 *      写数据的两个小问题：
 *                  换行写：写出一个换行符
 *                        windows: \r\n
 *                        Linux:   \n
 *                        mac:     \r
 *                  细节：在windows操作系统当中，java对回车换行进行了优化。
 *                       如果只写一个 \r 或 \n ，底层会自动补全，也可以实现换行操作。
 *                  建议：书写不要省略，写全，写完整比较好。
 *
 *                  续写：打开续写开关
 *                      开关为止：创建对象的第二个参数
 *                      默认false：表示关闭续写，此时创建对象会清空文件
 *                      手动传递ture：表示打开续写，此时创建对象不会清空文件
 */
public class Demo3_IO_FileOutputStream_Byte_English {
    public static void main(String[] args) throws IOException {
        //1.创建对象 （有异常直接抛出）
        FileOutputStream fos = new FileOutputStream("slef_learning\\a.txt",true);
                                                                                // 续写开关，手动打开

        //2.写出数据
        //Engfa Waraha 创建字符串
        String str = "Engfa Waraha";
        String str2= "999";
        String wrap = "\r\n";//换行符
        //把字符串转换为byte字节数组
        byte[] strBytes = str.getBytes();
        byte[] strBytes2 = str2.getBytes();
        byte[] wrapBytes = wrap.getBytes();

        //打印检查byte字节数组
//        System.out.println(Arrays.toString(strBytes));
//        System.out.println(Arrays.toString(strBytes2));
//        System.out.println(Arrays.toString(wrapBytes));

        //2.1 write方法：写入数据
        //（有异常直接抛出）
        fos.write(strBytes);
        fos.write(wrapBytes);//换行
        fos.write(strBytes2);

        //3.释放资源
        fos.close();

    }
}
