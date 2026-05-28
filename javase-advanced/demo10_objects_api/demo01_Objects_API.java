package demo10_objects_api;

import java.util.Objects;

/**
 *  目标：Objects方法的常用API
 *
 *                              方法名                             说明
 * public static boolean equals(Object a, Object b)     先做非空判断，比较两个对象
 * public static boolean isNull(Object obj)             判断对象是否为nul1，为nul1返回true，反之
 * public static boolean nonNull(Object obj)            判断对象是否不为nul1，跟isNul1的结果相反
 *
 */
public class demo01_Objects_API {
    public static void main(String[] args) {
        //1.创建动物类的对象
        Animal a1 = new Animal("蓝莓",2);
        Animal a2 = new Animal("蓝莓",2);
        Animal a3 = null;
        //2.比较两个对象的属性值是否相同
        boolean result = a1.equals(a2);
        System.out.println(result);

        //equals(Object a, Object b)   先做非空判断，比较两个对象
        boolean result2 = Objects.equals(a1, a3);
        //细节：
        //1.方法的底层会判断比较的对象是否为null，如果为null，直接返回false
        //2.如果不为null，则调用对象的equals方法
        //3.1此时对象是Animal类型，所以最终还是会调用Animal类型中的equals方法。
        //3.2如果Animal类型中没有重写equals方法，就比较地址值。如果重写了，就比较属性值。
        System.out.println(result2);

        //isNull(Object obj)   判断对象是否为nul1，为nul1返回true，反之
        Animal a4 = new Animal();
        boolean r1 = Objects.isNull(a4);
        System.out.println(r1);//false 不是空
        boolean r2 = Objects.isNull(a3);
        System.out.println(r2);//ture 为空

        //nonNull(Object obj)  判断对象是否不为nul1，跟isNul1的结果相反
        System.out.println(Objects.nonNull(a4));//true
        System.out.println(Objects.nonNull(a3));//false
    }
}
