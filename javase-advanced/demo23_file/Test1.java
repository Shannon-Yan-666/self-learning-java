package demo23_file;

import java.io.File;
import java.io.IOException;

/**
 * 需求：在当前模块下的aaa文件夹中，创建一个a.txt文件
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //1.创建a.txt 的父级路径
        File file = new File("slef_learning\\aaa");
        //2.调用mkdirs方法，创建父级文件夹
        //细节：底层会自行判断文件是否存在。
        //     如果存在，那么创建失败；如果不存在，创建成功。
        file.mkdirs();

        //3.拼接父级路径和子级路径
        File src = new File(file,"a.txt");
        boolean newFile = src.createNewFile();
        if (newFile){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }

    }
}
