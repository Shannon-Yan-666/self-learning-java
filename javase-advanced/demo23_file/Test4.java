package demo23_file;

import java.io.File;

/**
 * 需求：
 *      删除一个多级文件夹
 * 思路（递归）：如果要删除一个有内容的文件夹
 *      1.先删除文件夹里面所有的内容
 *      2.再删除自己
 *
 *listFiles()方法，底层细节（重点）：
 * 当调用者File表示的路径不存在时，返回null
 * 当调用者File表示的路径是文件时，返回null
 * 当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
 * 当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回、
 * 当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
 * 当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
 */
public class Test4 {
    public static void main(String[] args) {
        //注意事项：此方法，千万不要乱填路径！！！不要乱删文件夹
//        File file = new File("D:\\aaa\\eee");//这里路径不要乱填！！！
//        deleteFile(file);
    }

    // 定义一个方法：删除文件夹
    // 参数：要删除的文件夹
    public static void deleteFile(File file) {
        //1.删除文件夹里面的所有内容
        //1.1.进入文件夹
        File[] files = file.listFiles();
        for (File f : files) {
            //1.2.判断是否是文件，如果是则删除
            if (f.isFile()){
                f.delete();
            }else {
                //1.3 .再判断，如果是文件夹，则递归
                deleteFile(f);
            }
        }
        //2.删除自己
        file.delete();
    }
}
