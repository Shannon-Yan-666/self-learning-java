package demo24_io;

import java.io.*;

/**
 * 目标：了解序列化流（属于字节流的高级流）
 *   ObjectOutputStream：序列化流/对象操作输出流
 *   细节1：使用序列化流将对象写到文件时，NotSerializableException异常报错
 *          解决方案：需要让Javabean类实现Serializable接口
 *   细节2：序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了
 *   细节3：序列化对象后，修改了Javabean类，再次反序列化，InvalidClassException异常报错
 *          解决方案：给Javabean类添加serialVersionUID（序列号、版本号）自动生成
 *   细节4：关键字transient：瞬态关键字
 *        作用：该关键字标记的成员变量不参与序列化，不会把当前属性序列话到本地文件当中（读取默认初始化值）
 *
 *   方法：
 *                  构造方法                                说明
 * public ObjectOutputStream(OutputStream out)        把基本流包装成高级流
 *                  成员方法                                说明
 * public final void writeObject(Object obj)   把对象序列化（写出）到文件中去
 *
 *   ObjectInputStream：反序列化流/对象操作输入流
 *   方法：
 *                  构造方法                                说明
 * public ObjectInputStream(InputStream in)         把基本流包装成高级流
 *                  成员方法                                说明
 *      public Object readObject()       把序列化到本地文件中的对象，读取到程序中来
 *
 * 作用：序列化流，可以把Java中的对象写到本地文件中
 *      反序列化流，可以把序列化到本地文件中的对象，读取到程序中来
 *
 */
public class Demo13_IO_ObjectStream_Byte {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        //需求：利用序列化流/对象操作输出流，把一个对象写到本地文件中
        //1、创建一个对象
        Student stu = new Student("Engfa",32);
        //2、创建序列化流/对象操作输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("slef_learning\\stu.txt"));
        //3、写出数据
        oos.writeObject(stu);
        //4、释放资源
        oos.close();*/

        //需求：利用反序列化流/对象操作输入流，把文件中的对象，读取到程序中来
        //1、创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("slef_learning\\stu.txt"));
        //2、读取数据
        Student o = (Student) ois.readObject();//强转
        //3、打印对象
        System.out.println(o);
        //4、释放资源
        ois.close();
    }
}
