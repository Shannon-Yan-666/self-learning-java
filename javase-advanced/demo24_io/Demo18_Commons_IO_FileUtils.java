package demo24_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 目标：了解Commons工具包
 * FileUtils类
 *                方法名                                                  说明
 * static void copyFile(File srcFile, File destFile)                    复制文件
 * static void copyDirectory(File srcDir, File destDir)                 复制文件夹（直接拷贝文件夹里面的内容）
 * static void copyDirectoryToDirectory(File srcDir, File destDir)      复制文件夹（把数据源文件夹，拷贝到目的地文件夹里面去）
 * static void deleteDirectory(File directory)                          删除文件夹
 * static void cleanDirectory(File directory)                           清空文件夹
 * static String readFileToString(File file, Charset encoding)          读取文件中的数据变成字符串
 * static void write(File file, CharSequence data, String encoding)     写出数据
 *
 * IOUtils类
 *                    方法名                                              说明
 * public static int copy(InputStream input, OutputStream output)       复制文件
 * public static int copyLarge(Reader input, Writer output)             复制大文件
 * public static String readLines(Reader input)                         读取数据
 * public static void write(String data, OutputStream output)           写出数据
 */
public class Demo18_Commons_IO_FileUtils {
    public static void main(String[] args) throws IOException {
/*        //copyFile(File srcFile, File destFile)  复制文件
        File src = new File("slef_learning\\a.txt");
        File dest = new File("slef_learning\\d18.txt");
        FileUtils.copyFile(src,dest);*/

/*        //copyDirectory(File srcDir, File destDir)  复制文件夹
        File src = new File("D:\\aaa");
        File dest = new File("D:\\bbb");
        FileUtils.copyDirectory(src, dest);*/


/*        //deleteDirectory(File directory)  删除文件夹
        File src = new File("D:\\bbb");
        FileUtils.deleteDirectory(src);*/

    }
}
