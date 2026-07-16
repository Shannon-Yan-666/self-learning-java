package Demo27_reflect.Test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 练习：跟配置文件结合动态创建
 *      反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
 */
public class Test2_MyReflect {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1、读取配置文件中的信息
        Properties prop = new Properties();
        //IO输入流，绑定路径
        FileInputStream fis = new FileInputStream("slef_learning\\src\\Demo27_reflect\\Test2\\prop.properties");
        //读取配置文件信息
        prop.load(fis);
        //关流
        fis.close();
        //打印集合验证
        System.out.println(prop);

        //2、获取全类名和方法名
        String className = (String) prop.get("classname");
        String methodName = (String) prop.get("method");
        System.out.println(className);
        System.out.println(methodName);

        //3、利用反射创建对象并运行方法
        Class<?> clazz = Class.forName(className);
        //获取构造方法，创建对象
        Constructor<?> con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();//创建的对象
        System.out.println(o);//Artist{name = null, age = 0, gender =  , height = 0.0, hobby = null}

        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);//获取所有方法（包括私有）
        method.setAccessible(true);//暴力反射
        method.invoke(o);//利用对象去调用方法
    }
}
