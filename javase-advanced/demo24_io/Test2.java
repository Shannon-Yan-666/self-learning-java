package demo24_io;

import java.io.*;

/**
 * 综合练习1：文件夹拷贝（字节流）
 * 需求：
 *      拷贝一个文件夹，需要考虑子文件夹
 *      复制路径：D:\aaa\src
 *      粘贴路径：D:\aaa\TestDemo
 * 步骤：
 *      1、File、递归
 *      2、读取数据、写出数据
 *      3、拷贝文件：边读边写
 *      4、释放资源：先开的流，最后再关闭
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //1、创建File对象表示数据源
        File src = new File("D:\\aaa\\src");
        //2、创建File对象表示目的地
        File testDemo = new File("D:\\aaa\\TestDemo");
        //3、调用方法，拷贝文件夹
        copydir(src,testDemo);
    }

    /*
        作用：拷贝文件夹
        参数一：数据源
        参数二：目的地
     */
    private static void copydir(File src, File testDemo) throws IOException {
        //确保目的地文件夹是存在的：如果不存在，则创建出来；如果已经存在，也不会报错。
        testDemo.mkdirs();
        //递归
        //1、进入数据源
        File[] files = src.listFiles();//如果拷贝的文件夹带有权限返回null，需要进行非空判断，
        //2、遍历数组
        for (File f : files) {
            //3、判断：是文件，拷贝
            if (f.isFile()) {
                //4、创建通道读取数据：数据源
                FileInputStream fis = new FileInputStream(f);
                //5、创建通道写出数据：目的地(写出文件 )
                //细节：写入到目的地文件夹的里面，所以需要在文件夹（父级）里面创建一个新的文件
                //      new File：新的文件参数应该是：(目的地文件夹的名字(路径) + 数据源文件获取的名称)，作为新文件
                FileOutputStream fos = new FileOutputStream(new File(testDemo, f.getName()));
                //6、创建数组拷贝，速度更快
                byte[]bytes = new byte[1024*1024*5];
                //7、创建临时变量len，表示当前读取到了多少个字节
                int len;
                //8、创建循环：边读边写
                while ((len = fis.read(bytes)) != -1){
                    fos.write(bytes,0,len);
                }
                //循环结束后，关闭资源
                fos.close();
                fis.close();
            //判断：是文件夹，递归。
            }else {
                //递归：细节、参数见5
                copydir(f,new File(testDemo,f.getName()));
            }
        }
    }
}
