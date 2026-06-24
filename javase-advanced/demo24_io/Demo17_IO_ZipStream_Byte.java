package demo24_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 目标：了解压缩流-单个文件压缩/压缩文件夹
 */
public class Demo17_IO_ZipStream_Byte {
    public static void main(String[] args) throws IOException {
/*        //需求1：把D:\\aaa\\csb.txt 文件， 打包成一个压缩包
        //1、创建File对象表示要压缩的文件
        File src = new File("D:\\aaa\\csb.txt");
        //2、创建File对象表示压缩包的位置
        File dest = new File("D:\\aaa\\");
        //3、调用方法用来压缩
        toZip(src,dest);*/

        //需求2：把D:\\aaa 文件夹， 打包成一个压缩包
        //1、创建File对象表示要压缩的文件夹
        File src = new File("D:\\bbb");
        //2、创建File都西昂表示压缩包存放的位置（压缩包的父级路径）
        File destParent = src.getParentFile();//D:\\
        //3、创建File对象表示压缩包的路径
        File dest = new File(destParent,src.getName()+".zip");
        System.out.println(dest);
        //4、创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        //5、获取src里面的每个文件，变成ZipEntry对象，放入到压缩包当中（递归）
        toZipFiles(src,zos,src.getName());
        //6、关流
        zos.close();
    }

    /*
        作用：压缩文件
        参数一：表示要压缩的文件
        参数二：表示压缩包的位置
     */

    public static void toZip(File src, File dest) throws IOException {
        //1、创建压缩流关联压缩包-写到压缩包当中
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest,"csb.zip")));
        //2、创建zipEntry对象，表示压缩包里面的每一个文件和文件夹
        ZipEntry ze = new ZipEntry("csb.txt");
        //3、把ZipEntry对象放到压缩包当中
        zos.putNextEntry(ze);
        //4、把src文件中的数据写到压缩包当中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }

    /*
        作用：获取src里面的每一个文件，变成ZipEntry对象，放入到压缩包当中
        参数一：数据源
        参数二：压缩流
        参数三：压缩包内部的路径
     */
    public static void toZipFiles(File src, ZipOutputStream zos,String name) throws IOException {
        //1、进入src文件夹
        File[] files = src.listFiles();
        //2、遍历数组
        for (File file : files) {
            //3、判断
            if (file.isFile()) {
                //3.1、文件，变成ZipEntry对象，放入到压缩包中
                ZipEntry ze = new ZipEntry(name+"\\"+file.getName());//难点
                zos.putNextEntry(ze);
                //读取文件中的数据，写到压缩包中
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1) {
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else {
                //3.2、文件夹，递归
                toZipFiles(file, zos, name+"\\"+file.getName());
            }
        }
    }
}
