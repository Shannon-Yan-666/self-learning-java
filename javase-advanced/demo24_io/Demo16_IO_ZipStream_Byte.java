package demo24_io;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 目标：了解解压缩流
 * 解压本质：把每一个ZipEntry按层级拷贝到本地另一个文件夹中
 */
public class Demo16_IO_ZipStream_Byte {
    public static void main(String[] args) throws IOException {
        //1、创建一个File 表示要解压的压缩包
        File src = new File("D:\\aaa.zip");
        //2、创建一个File 表示解压缩流的目的地
        File dest = new File("D:\\bbb\\");
        unZip(src, dest);

    }

    //3、定义一个方法用来解压
    public static void unZip(File src, File dest) throws IOException {
        //3.1、创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //3.2、先获取到压缩包中的每一个zipEntry对象
/*        for (int i = 0; i < 100; i++) {
            // getNextEntry方法底层:可以获取每一个文件/文件夹，不需要手动递归了
            ZipEntry zipEntry = zip.getNextEntry();
            System.out.println(zipEntry);
        }*/
        //3.3、定义一个变量，表示当前压缩包中获取到的文件/文件夹
        ZipEntry entry;
        //3.4、循环读取压缩包中的文件/文件夹，拷贝到目的地
        while ((entry = zip.getNextEntry()) != null) {
            if (entry.isDirectory()) {
                File f = new File(dest, entry.toString());
                f.mkdirs();
                //文件夹：需要在目的地dest出创建一个同样的文件夹
            } else {
                //文件：需要读取到压缩包中的文件，并把他存放到目的地dest文件夹中（按照层级目录进行存放）
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                //表示在压缩包中的一个文件处理完毕了。
                zip.closeEntry();
            }
        }
        zip.close();
    }
}

