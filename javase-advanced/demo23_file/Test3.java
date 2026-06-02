package demo23_file;

import java.io.File;

/**
 * 需求：
 *      找到电脑中所有以avi结尾的电脑
 *      （需要考虑子文件夹）
 *  思路：递归
 *      把大问题拆分，拆到某一个文件夹不包含其他文件夹为止
 *      1.进入文件夹
 *      2.遍历数组
 *      3.判断
 *      4.再判断
 *
 *listFiles()方法，底层细节（重点）：
 *          * 当调用者File表示的路径不存在时，返回null
 *          * 当调用者File表示的路径是文件时，返回null
 *          * 当调用者File表示的路径是一个空文件夹时，返回一个长度为0的数组
 *          * 当调用者File表示的路径是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回、
 *          * 当调用者File表示的路径是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
 *          * 当调用者File表示的路径是需要权限才能访问的文件夹时，返回null
 */
public class Test3 {
    public static void main(String[] args) {

        File file = new File("D:\\");
        findAVI(file);
    }

//    //空参方法
//    //此方法不要轻易运行，风扇呼呼响
//    public static void  findAVI(){
//        //依次获取本地所有盘符
//        File[] arr = File.listRoots();
//        for (File file : arr) {
//          //反复调用带参的findAVI方法，在电脑的所有盘中搜索
//            findAVI(file);
//        }
//    }

    public static void findAVI(File file) {
        //1.进入文件夹
        File[] files = file.listFiles();//注意访问权限问题，返回null
        if (files != null) {
            //2.遍历数组，获取每一个内容
            for (File f : files) {
                //3.如果是文件，则搜索.avi结尾的文件
                if (f.isFile()){
                    String name = f.getName();
                    if (name.endsWith(".avi")){
                        System.out.println(f);
                    }
                    //3.1.如果是文件夹，则使用递归
                }else {
                    //细节：再次调用本方法的时候，参数一定要是src的次一级路径（变量f）
                    findAVI(f);
                }
            }
        }
    }
}
