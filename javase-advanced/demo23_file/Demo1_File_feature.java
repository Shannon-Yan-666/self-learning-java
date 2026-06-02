package demo23_file;

import java.io.File;

/**
 * 目标：了解路径
 *
 *       File对象就表示一个路径，可以是文件的路径、也可以是文件夹的路径
 *      这个路径可以是存在的，也允许是不存在的
 *
 * 绝对路径和相对路径：
 *      绝对路径：带盘符
 *      相对路径：不带盘符，默认到当前项目下去找。
 *
 * 构造方法：
 *                  方法名                                   说明
 *      public File(String pathname)                根据文件路径创建文件对象
 *      public File(String parent, String child)    根据父路径名字符串和子路径名字符串，进行拼接创建文件对象
 *      public File(File parent, String child)      根据父路径对应文件对象和子路径名字符串，进行拼接创建文件对象
 */

public class Demo1_File_feature {
    public static void main(String[] args) {
        //1.根据文件路径创建文件对象：根据字符串表示的路径，变成File对象
        String str = "C:\\Users\\15001\\Desktop\\a.txt";
        File file = new File(str);
        System.out.println(file);//C:\Users\15001\Desktop\a.txt

        //2.根据父路径名字符串和子路径名字符串创建文件对象：父级+子级，继续拼接
        //  父级路径：C:\Users\15001\Desktop
        //  子级路径：a.txt
        String parent ="C:\\Users\\15001\\Desktop";
        String child = "a.txt";
        File file1 = new File(parent, child);//进行拼接
        System.out.println(file1);//C:\Users\15001\Desktop\a.txt

        //3.根据父路径对应文件对象和子路径名字符串创建文件对象：File路径+String路径，进行拼接
        File file2 = new File("C:\\Users\\15001\\Desktop");
        String child1 = "a.txt";
        File file3 = new File(file2,child1);
        System.out.println(file3);//C:\Users\15001\Desktop\a.txt


    }
}
