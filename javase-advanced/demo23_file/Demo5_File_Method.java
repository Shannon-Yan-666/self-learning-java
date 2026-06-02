package demo23_file;


import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * 目标：掌握File的常见成员方法（获取并遍历）
 * 常见成员方法：
 *                      方法名                                  说明
 * public  File[]    listFiles()                        获取当前该路径下所有内容
 *
 * public static File[] listRoots()                     列出可用的文件系统根
 *
 * public  String[]  list()                             获取当前该路径下所有内容（仅获取名字）
 * public  String[]  list(FilenameFilter  filter)       利用文件名过滤器获取当前该路径下所有内容
 *
 * 【重点】public  File[]    listFiles()                        获取当前该路径下所有内容（重点掌握）
 * public  File[]    listFiles(FileFilter  filter))     利用文件名过滤器获取当前该路径下所有内容
 * public  File[]    listFiles(FilenameFilter  filter)) 利用文件名过滤器获取当前该路径下所有内容
 *
 * listFiles()方法，底层细节（重点）：
         * 当调用者File表示的路径不存在时，返回null
         * 当调用者File表示的路径是文件时，返回null
         * 当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
         * 当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回、
         * 当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
         * 当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
 *
 */
public class Demo5_File_Method {
    public static void main(String[] args) {
        //6.重点掌握：listFiles()方法： 获取当前该路径下所有内容
        //需求：打印文件夹里面所有的txt文件
        //6.1 创建File对象
        File f1 = new File("D:\\aaa");
        //6.2 调用方法获取该路径下所有内容，返回一个数组
        File[] files = f1.listFiles();
        //6.3 遍历数组，获取每一个文件
        for (File file : files) {
            //变量 file：依次代表获取到的每一个文件
            //6.4 判断文件名后缀是否为 .txt 格式
            if (file.isFile()&&file.getName().endsWith(".txt")) {
                System.out.println(file);
            }
        }

        //7. listFiles(FileFilter  filter))  方法：  利用文件名过滤器获取当前该路径下所有内容
        File[] arr = f1.listFiles(new FileFilter() {
            //accept方法的形参：依次表示文件夹里面的每一个文件/文件夹的路径
            //返回值：如果返回值为true，就表示当前路径保留
            //       如果返回值为false，就表示当前路径舍弃不要
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr));

        //8.listFiles(FilenameFilter  filter))  方法： 利用文件名过滤器获取当前该路径下所有内容
        File[] arr2 = f1.listFiles(new FilenameFilter() {
            //accept方法的形参：依次表示文件夹里面的每一个文件/文件夹的路径
            //参数一：父级路径
            //参数二：子级路径
            //返回值：如果返回值为true，就表示当前路径保留
            //       如果返回值为false，就表示当前路径舍弃不要
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr2));
    }
}
