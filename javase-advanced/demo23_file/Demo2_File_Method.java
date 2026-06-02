package demo23_file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Instant;

/**
 * 目标：掌握File的常见成员方法（判断、获取）
 * 方法：
 *                 方法名                            说明
 *  public  boolean  isDirectory()      判断此路径名表示的File是否为文件夹
 *  public  boolean  isFile()           判断此路径名表示的File是否为文件
 *  public  boolean  exists()           判断此路径名表示的File是否存在
 *
 *  public  long     length()           返回文件的大小（字节数量）
 *  public  long     lastModified()     返回文件的最后修改时间（时间毫秒值）
 *  public  String   getAbsolutePath()  返回文件的绝对路径
 *  public  String   getPath()          返回定义文件时使用的路径
 *  public  String   getName()          返回文件的名称，带后缀
 */
public class Demo2_File_Method {
    public static void main(String[] args) {
        //4.length()：返回文件的大小（字节数量）

        //细节1：length方法，只能获取文件的大小，单位是字节
        //如果单位是M/G ，可以不断的除以1024
        File f4 = new File("D:\\aaa\\a.txt");
        long length = f4.length();
        System.out.println(length);//12

        //细节2：length方法，无法获取文件夹的大小
        //解决：需要把文件夹里的所有文件大小都累加在一起。
        File f5 = new File("D:\\aaa\\bbb");
        long len = f5.length();
        System.out.println(len);//0

        System.out.println("----------------------------------------");
        //5.getAbsolutePath()：  返回文件的绝对路径
        File f6 = new File("D:\\aaa\\a.txt");
        String path1 = f6.getAbsolutePath();
        System.out.println(path1);//D:\aaa\a.txt

        File f7 = new File("Slef_Study\\a.txt");
        String path2 = f7.getAbsolutePath();
        System.out.println(path2);//D:\workspace\javase\JavaseBasicProject\Slef_Study\a.txt

        System.out.println("----------------------------------------");
        //6.getPath()： 返回定义文件时使用的路径
        String path3 = f6.getPath();
        System.out.println(path3);//D:\aaa\a.txt
        String path4 = f7.getPath();
        System.out.println(path4);//Slef_Study\a.txt

        System.out.println("----------------------------------------");
        //7.getName()： 返回文件的名称，带后缀
        //细节1：调用者是文件，则返回文件名+扩展名
        //        a  文件名
        //      txt  后缀名、扩展名
        String name1 = f6.getName();
        System.out.println(name1);//a.txt

        //细节2：调用者是文件夹，则返回文件夹的名字
        String name2 = f5.getName();
        System.out.println(name2);//bbb

        System.out.println("----------------------------------------");
        //8.lastModified()：  返回文件的最后修改时间（时间毫秒值）
        long time = f6.lastModified();
        System.out.println(time);//1779796261725
        //需求：把时间的毫秒值字符串，变成字符串表示时间
        //格式：yyy年MM月dd日 HH: mm： ss
//        Instant instant = Instant.ofEpochMilli(time);
//        System.out.println(instant);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH: mm： ss");
        System.out.println(sdf.format(time));


/*        //1.对文件的路径进行判断
        File f1 = new File("D:\\aaa\\a.txt");
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//ture
        System.out.println(f1.exists());//ture

        System.out.println("----------------------------------------");
        //2.对文件夹的路径进行判断
        File f2 = new File("D:\\aaa\\bbb");
        System.out.println(f2.isDirectory());//ture
        System.out.println(f2.isFile());//false
        System.out.println(f2.exists());//ture

        System.out.println("----------------------------------------");
        //3.对一个不存在的文件进行判断
        File f3 = new File("D:\\aaa\\c.txt");
        System.out.println(f3.isDirectory());//false
        System.out.println(f3.isFile());//false
        System.out.println(f3.exists());//false
        */
    }
}
