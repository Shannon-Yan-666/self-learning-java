package demo24_io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 综合练习3：修改文件中的数据
 * 需求：
 *      文本文件中有以下的数据：
 *      2-1-9-4-7-8
 *      将文件中的数据进行排序，变成以下的数据：
 *      1-2-4-7-8-9
 * 步骤：
 *      1、读取数据
 *      2、排序
 *      3、写出
 *
 * 细节：
 *      1、文件中的数据不要换行，换行后面java底层会默认添加\r\n
 *      2、关联本地文件的话，可能会有一个隐含的bom头（字符标记/编码），可以另存改为UTF-8
 *
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        //1、读取数据：2-1-9-4-7-8
        FileReader fr = new FileReader("slef_learning\\c.txt");
        //1.1、使用StringBuilder工具获取文件内容的整体（方便后续切割及排序）
        //细节：不能直接做打印，如果直接打印，只能看不能用
        StringBuilder sb = new StringBuilder();
        //1.2、循环读取数据，并添加到sb容器中
        int ch;
        while ((ch= fr.read()) !=-1){
            //把读取到的数据，强转，添加到sb当中
            sb.append((char)ch);
        }
        //1.3、关流释放资源
        fr.close();
        //1.4、检验读取是否正确
        System.out.println(sb);

//        //2、常规写法-排序：1-2-4-7-8-9
//        //2.1、将sb容器中的内容转为字符串（方便调用String方法切割）
//        String str = sb.toString();
//        String[] arrStr = str.split("-");//以"-"进行切割，获取str类型的数据
//        //2.3、将str类型的数据，转变为int类型
//        //2.3.1、创建一个数据，存储int类型的数据
//        ArrayList<Integer>list = new ArrayList<>();
//        //2.3.2、循环读取arrStr中的每一个数据，并转换为int类型
//        // （直接使用parseInt工具，一次只能转换一个数据，所有需要嵌套在循环内）
//        for (String s : arrStr) {
//            int i = Integer.parseInt(s);
//            list.add(i);//依次将转换后的数据添加到int类型列表中
//        }
//        //2.4、使用Collections工具的sort方法进行排序：默认才小到达，升序排列
//        Collections.sort(list);
//        //打印列表检验数据是否正确、完整
//        System.out.println(list);
//
//        //3、常规写法-写出数据
//        FileWriter fw = new FileWriter("slef_learning\\c.txt");
//        //3.1、普通for循环（因为需要获取索引并判断）
//        for (int i = 0; i < list.size(); i++) {
//            //3.2、判断如果是最后一个元素，就直接写出（后面不需要+"-"）
//            if (i == list.size()-1){
//                fw.write(list.get(i) + "");//原样写出
//            }else {
//                //不是最后一个元素，在写出后面添加间隔符号"-"
//                fw.write(list.get(i) + "-");
//            }
//        }
//        //4、关流、释放资源
//        fw.close();

        //2、stream流写法-排序
        Integer[] array = Arrays.stream(sb.toString()
                        .split("-"))//字符串以间隔符进行切割
                .map(Integer::parseInt)//字符串转换为int类型
                .sorted()//排序：默认升序
                .toArray(Integer[]::new);//new int类型的容器储存

        //打印检验
        System.out.println(Arrays.toString(array));

        //3、写出数据
        FileWriter fw = new FileWriter("slef_learning\\c.txt");
        //使用Arrays的toString类，replace方法处理。消除数组的首尾大括号、替换间隔符
        String s = Arrays.toString(array).replace("[", "").replace("]", "").replace(", ", "-");
        //写出
        fw.write(s);
        //关流
        fw.close();

    }
}
