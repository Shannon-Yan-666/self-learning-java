package Demo27_reflect.Test1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 练习：保存信息
 * 对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
 */
public class Test1_MyReflect {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        Artist a = new Artist("王邦邦", 22, '女', 166, "唱歌");
        Fan f = new Fan("艾米", 28);

        saveObject(a);
    }

    //把对象里面所有的成员变量名和值，保存到本地文件当中
    public static void saveObject(Object obj) throws IllegalAccessException, IOException {
        //1、获取字节码文件的对象
        Class<?> clazz = obj.getClass();

        //2、创建IO流，写入本地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("slef_learning\\src\\Demo27_reflect\\Test1\\a.txt"));

        //3、获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);//临时取消访问权限
            //获取成员变量的名字
            String name = f.getName();
            //获取成员变量的值
            Object value = f.get(obj);
            bw.write(name + "=" + value);
//            System.out.println(name + "=" + value);
            bw.newLine();
        }
        bw.close();
    }
}
