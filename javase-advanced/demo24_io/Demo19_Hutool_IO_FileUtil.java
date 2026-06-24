package demo24_io;


import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 目标：了解Hutool工具包
 * FileUtil类:
         * file:根据参数创建一个file对象
         * touch:根据参数创建新的文件
 *
         * writeLines:把集合中的数据写出到文件中，覆盖模式。
         * appendLines:把集合中的数据写出到文件中，续写模式。
         * readLines:指定字符编码，把文件中的数据，读到集合中。
         * readUtf8Lines:按照UTF-8的形式，把文件中的数据，读到集合中
         * copy:拷贝文件或者文件夹
 */
public class Demo19_Hutool_IO_FileUtil {
    public static void main(String[] args) {
        //file:根据参数创建一个file对象
        //String...names：可变参数
        File file = FileUtil.file("D:\\", "aaa", "bbb", "a.txt");
        System.out.println(file);//D:\aaa\bbb\a.txt

/*        //touch:根据参数创建新的文件（如果父级路径不存在，会直接创建出来）
        File touch = FileUtil.touch(file);
        System.out.println(touch);*/

        //writeLines:把集合中的数据写出到文件中，覆盖模式。
        ArrayList<String>list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
/*        File file1 = FileUtil.writeLines(list,file,"UTF-8");
        System.out.println(file1);*/

/*
        //appendLines:把集合中的数据写出到文件中，续写模式。
        File file2 = FileUtil.appendLines(list, file, "UTF-8");
        System.out.println(file2);
*/

        //readLines:指定字符编码，把文件中的数据，读到集合中。
        List<String> stringList = FileUtil.readLines(file, "UTF-8");
        System.out.println(stringList);//[aaa, bbb, aaa, bbb]
        

    }
}
