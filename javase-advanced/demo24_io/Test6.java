package demo24_io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * 综合练习6：修改文本顺序
 * 需求：
 *      把《出师表》的文章顺序进行恢复到一个新文件中。
 */
public class Test6 {
    public static void main(String[] args) throws IOException {
        //1、创建字符缓冲输入/输出流的对象
        BufferedReader br = new BufferedReader(new FileReader("slef_learning\\csb.txt"));

        //2、读取数据
        String line;
        ArrayList<String> list = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //3、排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer i1 = Integer.parseInt(o1.split("\\.")[0]);
                Integer i2 = Integer.parseInt(o2.split("\\.")[0]);
                return i1-i2;
            }
        });

        //4、写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("slef_learning\\csbSort.txt"));
        for (String str : list) {
            bw.write(str + "\n");
        }
        bw.close();


    }
}
