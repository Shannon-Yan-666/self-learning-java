package Demo27_reflect.Demo1_Reflect_Class;

/**
 * 目标：了解反射-Reflect
 * 概念：反射允许对成员变量，成员方法和构造方法的信息进行编程访问
 * 作用：获取任意一个类中的所有信息，结合配置文件动态创建对象
 *       获取class对象                   解剖
 *      字段（成员变量）      获取修饰符、获取名字、获取类型、赋值/获取值
 *        构造方法          获取修饰符、获取名字、获取形参、创建对象
 *        成员方法          获取修饰符、获取名字、获取形参、获取返回值、抛出的异常、获取注解、运行方法
 *
 * 获取class对象的三种方式：
 *      1、Class.forName("全类名");   源代码阶段，最为常用
 *      2、类名.class                 加载阶段，一般当作参数进行传递
 *      3、对象.getClass();           运行阶段，已经有类对象时，才可以使用
 *
 * 如何获取构造方法、成员方法、成员变量：
                             * get：获取
                             * set：设置
                             * Constructor：构造方法
                             * Field：成员变量
                             * Method：方法
                             * Parameter：参数
                             * Modifiers：修饰符
                             * Declared：私有的
 */
public class Demo1_Reflect_Class {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1、Class.forName("全类名");   源代码阶段
        // 全类名：包名 + 类名
        Class<?> clazz1 = Class.forName("Demo27_reflect.Demo1_Reflect_Class.Student");
//        System.out.println(clazz1);

        // 2、类名.class                 加载阶段
        Class<Student> clazz2 = Student.class;
//        System.out.println(clazz1 == clazz2);

        // 3、对象.getClass();           运行阶段
        Student s = new Student();
        Class<? extends Student> clazz3 = s.getClass();
//        System.out.println(clazz2 == clazz3);
    }
}
