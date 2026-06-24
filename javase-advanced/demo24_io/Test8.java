package demo24_io;

import java.io.*;
import java.util.ArrayList;

/**
 * 小练习：用对象流读写多个对象
 * 需求：
 *      将多个自定义对象序列化到文件中，
 *      但是由于对象的个数不确定，反序列化流该如何读取呢?
 */
public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
/*        //1、创建多个自定义对象
        Animal a1 = new Animal("wangcai",4,"上海");
        Animal a2 = new Animal("yuanbao",2,"重庆");
        Animal a3 = new Animal("jiaozi",3,"深圳");

        //1.1、将多个对象添加到数组中
        ArrayList<Animal> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        //2、创建序列化对象-将数组写入文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("slef_learning\\anm.txt"));
        oos.writeObject(list);
        oos.close();*/

        //3、创建反序列化对象-将文件读取到程序中
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("slef_learning\\anm.txt"));
        ArrayList<Animal> dl = (ArrayList<Animal>) ois.readObject();
        for (Animal animal : dl) {
            System.out.println(animal);
        }
        ois.close();

    }
}
