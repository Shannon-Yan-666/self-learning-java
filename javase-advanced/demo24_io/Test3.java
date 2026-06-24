package demo24_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 综合练习2：文件加密
 * 需求：为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
 *      加密原理：
 *          对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
 *      解密原理：
 *          读取加密之后的文件，按照加密的规则反向操作，变成原始文件。
 *
 *  ^ : 异或  （相同为：false ，不同为：true）
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        //1、创建对象关联原始文件
        FileInputStream fis = new FileInputStream("slef_learning\\ency.txt");

        //2、创建对象关联加密文件
        FileOutputStream fos = new FileOutputStream("slef_learning\\redu.txt");

        //3、加密处理
        int b;
        while ((b=fis.read()) !=-1){
            fos.write(b ^ 10);
        }

        //4、释放资源
        fos.close();
        fis.close();
    }
}
