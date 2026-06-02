package demo23_file;

import java.io.File;

/**
 * 需求：
 *      定义一个方法，找某一个文件夹中，是否有以avi结尾的电影。
 *      （暂时不需要考虑子文件夹）
 */
public class Test2 {
    public static void main(String[] args) {
        //创建要搜索的文件夹对象
        File f1 = new File("D:\\aaa");
        boolean b = haveAVI(f1);
        System.out.println(b);

    }

    //定义一个方法：用来查找某个文件夹中，是否有.avi格式的文件
    //形参：表示我们要查找的文件夹
    //返回值：查找的结果  存在为ture  不存在为false
    public static boolean haveAVI(File file){
        //1.调用listFiles方法，获取文件夹中的所有内容，返回一个数组
        File[] files = file.listFiles();

        //2.遍历数组，获取里面每一个元素
        for(File f : files){
            //判断是否为文件，且是否以.avi 后缀结尾
            if (f.isFile() && f.getName().endsWith(".avi")){
                //如果是返回true
                return true;
            }
        }
        //如果循环结束，都未返回true，则返回false
        return false;
    }
}
