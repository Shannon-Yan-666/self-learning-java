package demo23_file;

import java.io.File;
import java.io.IOException;

/**
 * 目标：掌握File的常见成员方法（创建、删除）
 * 常见成员方法：
 *                          方法              说明
 * public  boolean  createNewFile()     创建一个新的空的文件
 * public  boolean  mkdir()             创建单级文件夹
 * public  boolean  mkdirs()            创建多级文件夹（单级/多级，都可以）
 * public  boolean  delete()            删除文件、空文件夹（直接删除，不走回收站）
 */
public class Demo3_File_Method {
    public static void main(String[] args) throws IOException {
        // 1、createNewFile() 方法： 创建一个新的空的文件夹
        //细节1：如果当前路径表示的文件是不存在的，则创建成功，方法返回true
        //      如果当前路径表示的文件是存在的，则创建失败，方法返回false
        //细节2：如果父级路径是不存在的，那么方法会报错，IO异常，IOException
        //细节3：createNewFile方法创建的一定是文件，如果路径中未包含后缀名，则创建一个无后缀名的文件（非文件夹）
//        File f1 = new File("D:\\aaa\\c.txt");
//        boolean b = f1.createNewFile(); //快捷键：alt + 回车  ，抛出异常
//        System.out.println(b);

        // 2、mkdir() 方法： 创建单级文件夹
        //  make Directory（文件夹/目录）
        File f2 = new File("D:\\aaa\\ccc");
//        boolean b2 = f2.mkdir();
//        System.out.println(b2);

        // 3、mkdirs() 方法： 创建多级文件夹
//        File f3 = new File("D:\\aaa\\eee\\ccc\\bbb");
//        boolean b3 = f3.mkdirs();
//        System.out.println(b3);

        // 4、delete() 方法： 删除文件、空文件夹
        // 细节1：如果删除的是文件，则直接删除，不走回收站
        //       如果删除的是空文件夹，则直接删除，不走收回站
        //       如果删除的是有内容的文件夹，则删除失败
//        boolean delete = f2.delete();
//        System.out.println(delete);


    }
}
