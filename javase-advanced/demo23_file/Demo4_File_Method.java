package demo23_file;

import java.io.File;
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
 * 【重点】public  File[]    listFiles()                  获取当前该路径下所有内容（重点掌握）
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
public class Demo4_File_Method {
    public static void main(String[] args) {
        //1.创建File对象
//        File f1 =new File("D:\\aaa");

        //2.listFiles方法
        //作用：获取文件夹里面的所有内容，放到数组中并进行返回
//        File[] files = f1.listFiles();
//        for (File file : files) {
//            //变量file：依次表示文件夹里面的每一个文件/文件夹
//            System.out.println(file);
//        }

        //3.listRoots() 方法：获取系统中所有的盘符
//        File[] arr = File.listRoots();
//        System.out.println(Arrays.toString(arr));//[C:\, D:\]

        //4.list()方法：  获取当前该路径下所有内容（仅获取名字）
//        File f2 = new File("D:\\aaa");
//        String[] arr2 = f2.list();
//        for (String s : arr2) {
//            System.out.println(s);
//        }

        //5.list(FilenameFilter  filter)  方法： 利用文件名过滤器获取当前该路径下所有内容
        //需求：获取aaa文件夹里面所有的txt文件
        File f3 = new File("D:\\aaa");
        String[] arr3 = f3.list(new FilenameFilter() {
            //accept方法的形参：依次表示文件夹里面的每一个文件/文件夹的路径
            //参数一：父级路径
            //参数二：子级路径
            //返回值：如果返回值为true，就表示当前路径保留
            //       如果返回值为false，就表示当前路径舍弃不要
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
//                System.out.println(src);
                return src.isFile() && name.endsWith(".txt");
            }
        });
        System.out.println(Arrays.toString(arr3));


        //重点掌握：listFiles()方法： 获取当前该路径下所有内容
    }
}
