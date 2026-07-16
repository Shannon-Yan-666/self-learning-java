package Demo27_reflect.Demo4_Reflect_Method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 目标：利用反射获取成员方法-Method
 * Class类中用于获取成员方法的方法：
     * Method[]getMethods( )：
        返回所有公共成员方法对象的数组，包括继承的
     * Method[] getDeclaredMethods( )：
        返回所有成员方法对象的数组，不包括继承的（包括私有的）
     * Method getMethod(String name, Class<?>. parameterTypes)：
        返回单个公共成员方法对象
     * Method getDeclaredMethod(String name, Class<?>. parameterTypes)：
        返回单个成员方法对象（包括私有的）
 *
 * Method类中用于创建对象的方法:
     * Object invoke(Object obj, Object...args)：运行方法
     * 参数一：用obj对象调用该方法
     * 参数二：调用方法的传递的参数（如果没有就不写）
     * 返回值：方法的返回值（如果没有就不写）
 */
public class Demo4_Reflect_Method {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //1、获取Class对象字节码文件对象
        Class<?> clazz = Class.forName("Demo27_reflect.Demo4_Reflect_Method.Artist");

/*        // Method[]getMethods( )：
        // 返回所有公共成员方法对象的数组，包括父类中继承的所有公共方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/

/*        //Method[] getDeclaredMethods( )：
        //返回所有成员方法对象的数组，不包括继承的（包括私有的）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }*/

        //Method getMethod(String name, Class<?>. parameterTypes)：
        //返回单个公共成员方法对象


        //Method getDeclaredMethod(String name, Class<?>. parameterTypes)：
        //回单个成员方法对象（包括私有的）
        Method eat = clazz.getDeclaredMethod("eat", String.class, int.class);
        System.out.println(eat);

        //获取方法的修饰符
        int modifiers = eat.getModifiers();
        System.out.println(modifiers);//2 私有

        //获取方法名字
        String name = eat.getName();
        System.out.println(name);

        //获取方法的形参
        Parameter[] parameters = eat.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }

        //获取方法抛出的异常
        Class<?>[] exceptionTypes = eat.getExceptionTypes();
        for (Class<?> exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }

        //方法运行
        //     * Object invoke(Object obj, Object...args)：运行方法
        //     * 参数一：用obj对象调用该方法
        //     * 参数二：调用方法的传递的参数（如果没有就不写）
        //     * 返回值：方法的返回值（如果没有就不写）
        Artist artist = new Artist();
        eat.setAccessible(true);//临时取消访问权限，暴力反射
        //获取方法的返回值
        String result = (String) eat.invoke(artist, "打抛饭", 1);
        System.out.println(result);
        
    }
}
