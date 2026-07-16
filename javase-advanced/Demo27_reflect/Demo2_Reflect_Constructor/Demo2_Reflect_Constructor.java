package Demo27_reflect.Demo2_Reflect_Constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

/**
 *  目标：利用反射获取构造方法-Constructor
 *
 *  Class类中用于获取构造方法的方法:
     *  Constructor<?>[ ] getConstructors( )：
     *  返回所有公共构造方法对象的数组（可以获取公开的）
     *  Constructor<?>[ ] getDeclaredConstructors( )：
     *  返回所有构造方法对象的数组（可以获取所有，包括私有的）
     *  Constructor<T> getConstructor(Class<?>... parameterTypes)：
     *  返回单个公共构造方法对象（可以获取公开的）
     *  Constructor<T> getDeclaredConstructor(Class<?>...parameterTypes)：
     *  返回单个构造方法对象（（可以获取单个的，包括私有的））
 *
 *  Constructor类中用于创建对象的方法：
     *  T newInstance(Object...initargs)：根据指定的构造方法创建对象
     *  setAccessible(boolean flag)：设置为true,表示取消访问检查
 */
public class Demo2_Reflect_Constructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1、获取class字节码文件的对象
        Class<?> clazz = Class.forName("Demo27_reflect.Demo2_Reflect_Constructor.Animal");

        //2、获取构造方法
/*        //Constructor<?>[ ] getConstructors( )：
        //返回所有公共构造方法对象的数组（可以获取公开的）
        Constructor<?>[] cons1 = clazz.getConstructors();
        for (Constructor<?> con : cons1) {
            System.out.println(con);
        }

        //Constructor<?>[ ] getDeclaredConstructors( )：
        //返回所有构造方法对象的数组（可以获取所有，包括私有的）
        Constructor<?>[] cons2 = clazz.getDeclaredConstructors();
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }

        //Constructor<T> getConstructor(Class<?>... parameterTypes)：
        //返回单个公共构造方法对象（可以获取公开的）
        Constructor<?> con1 = clazz.getConstructor();
        System.out.println(con1);
        Constructor<?> con2 = clazz.getConstructor(int.class);
        System.out.println(con2);*/

        //Constructor<T> getDeclaredConstructor(Class<?>...parameterTypes)：
        //返回单个构造方法对象（（可以获取单个的，包括私有的））
        Constructor<?> con3 = clazz.getDeclaredConstructor();
        System.out.println(con3);
        Constructor<?> con4 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con4);

        //获取权限修饰符
        //常量字段值：私有返回2、公开返回1
        int modifiers = con4.getModifiers();
        System.out.println(modifiers);//2

        //获取 所有的参数
        Parameter[] parameters = con4.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //暴力反射：使用私有构造器创建对象
        con4.setAccessible(true);//表示临时取消权限的校验
        Animal dog = (Animal) con4.newInstance("小狗", 2);
        System.out.println(dog);
    }
}
