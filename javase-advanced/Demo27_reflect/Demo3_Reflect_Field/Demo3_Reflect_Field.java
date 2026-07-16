package Demo27_reflect.Demo3_Reflect_Field;

import java.lang.reflect.Field;

/**
 * 目标：利用反射获取成员变量-Field
 *
 * Class类中用于获取成员变量的方法:
     * Field[] getFields( )：返回所有公共成员变量对象的数组
     * Field[] getDeclaredFields( )：返回所有成员变量对象的数组（包括私有）
     * Field getField(String name)：返回单个公共成员变量对象
     * Field getDeclaredField(String name)：返回单个成员变量对象（包括私有）
 *
 * Field类中用于创建对象的方法:
     * void set(Object obj, Object value)：赋值
     * Object get(Object obj) 获取值
 *
 */
public class Demo3_Reflect_Field {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //1、获取class字节码文件的对象
        Class<?> clazz = Class.forName("Demo27_reflect.Demo3_Reflect_Field.Animal");

/*        //Field[] getFields( )：返回所有公共成员变量对象的数组
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----------------------------");
        //Field[] getDeclaredFields( )：返回所有成员变量对象的数组（包括私有）
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        System.out.println("----------------------------");
        //Field getField(String name)：返回单个公共成员变量对象
        Field gender = clazz.getField("gender");
        System.out.println(gender);*/

        System.out.println("----------------------------");
        //Field getDeclaredField(String name)：返回单个成员变量对象（包括私有）
        Field age = clazz.getDeclaredField("age");
        System.out.println(age);

        //获取权限修饰符
        //常量字段值：私有返回2、公开返回1
        int modifiers = age.getModifiers();
        System.out.println(modifiers);//2

        //获取成员变量的名字
        String a = age.getName();
        System.out.println(a);

        //获取成员变量的类型
        Class<?> type = age.getType();
        System.out.println(type);

        //Object get(Object obj) 获取值
        //获取成员变量记录的值
        //暴力反射：使用私有构造器创建对象
        age.setAccessible(true);//表示临时取消权限的校验
        Animal animal = new Animal("熊猫鸭",2,"女");
        int value = (int) age.get(animal);
        System.out.println(value);

        //void set(Object obj, Object value)：赋值
        //修改对象里面的值
        age.set(animal,1);
        System.out.println(animal);
    }
}
