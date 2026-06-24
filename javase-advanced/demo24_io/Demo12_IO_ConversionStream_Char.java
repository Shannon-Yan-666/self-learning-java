package demo24_io;

import java.io.*;
import java.nio.charset.Charset;

/**
 * 目标：了解转换流（属于字符流的高级流）-转换流是字符流和字节流之间的桥梁
 *      InputStreamReader：转换输入流
 *      OutputStreamWriter：转换输出流
 * 作用：字节流需要使用字符流中的方法
 */
public class Demo12_IO_ConversionStream_Char {
    public static void main(String[] args) throws IOException {
        //练习1：转换文件编码
        //需求1：手动创建一个GBK的文件，把文件中的中文读取到内存中，不能出现乱码
/*        //利用转换流按照指定字符编码读取（了解），因为JDK11，这种方式被淘汰了
        //1、创建转换流对象并指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("slef_learning\\gbk.txt"),"GBK");
        //2、读取数据
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }

        //3、释放资源
        isr.close();
        */

/*        //利用转换流按照指定字符编码读取（掌握），JDK11出现的方式
        //1、创建对象并指定字符编码
        FileReader fr = new FileReader("slef_learning\\gbk.txt", Charset.forName("GBK"));
        //2、读取数据
        int ch;
        while ((ch = fr.read()) != -1){
            System.out.print((char)ch);
        }

        //3、释放资源
        fr.close();*/

        //需求2：把一段中文按照GBK的方式写到本地文件
/*        //1、创建转换流对象并指定字符编码(了解)
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("slef_learning\\gbkWriter.txt"),"GBK");
        //2、写出数据
        osw.write("你真不错 ");
        //3、释放资源
        osw.close();*/

/*        //1、创建转换流对象并指定字符编码(掌握)
        FileWriter fw = new FileWriter("slef_learning\\gbkWriter.txt",Charset.forName("GBK"));
        //2、写出数据
        fw.write("你真不错，人美心善 ");
        //3、释放资源
        fw.close();*/

/*        //需求3：将本地文件中的GBK文件，转成UTF-8
         FileReader fr = new FileReader("slef_learning\\gbk.txt",Charset.forName("GBK"));
         FileWriter fw = new FileWriter("slef_learning\\gbkWriter.txt",Charset.forName("UTF-8"));
         int b;
         while ((b = fr.read()) != -1) {
             fw.write(b);
         }
         fw.close();
         fr.close();*/

         //练习2：读取文件中的数据
        //利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
/*        FileInputStream fis = new FileInputStream("slef_learning\\gbkWriter.txt");
        InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        System.out.println(line);
        br.close();*/

        BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream("slef_learning\\gbkWriter.txt"), Charset.forName("UTF-8")));
        String line2;
        while ((line2 =br2.readLine()) != null){
            System.out.println(line2);
        }
        br2.close();
    }
}
