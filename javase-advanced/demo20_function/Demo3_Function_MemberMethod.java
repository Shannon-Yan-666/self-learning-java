package demo20_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * 目标：掌握引用成员方法
 * 格式：对象 :: 成员方法
 * 示例：
 *     其他类：其他类对象 :: 方法名  （先获取其他类的对象 :: 引用方法）
 *     本类：    this  :: 方法名  （不用创建对象，引用处不能是静态方法）
 *     父类：   super  :: 方法名  （不用创建对象，引用处不能是静态方法）
 */
public class Demo3_Function_MemberMethod {
    public static void main(String[] args) {
        //需求:集合中有一些名字，按照要求过滤数据
        // 数据:"张无忌","周芷若","赵敏","张强","张三丰"
        // 要求:只要以张开头，而且名字是3个字的

        ArrayList<String>list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰");
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length()==3)
                .forEach(System.out::println);

//        //方法引用-其他类
//        StringOperation s = new StringOperation();
//        list.stream()
//                .filter(s::stringJudge)
//                .forEach(System.out::println);

        //方法引用-本类
        //细节：静态方法中，是没有this关键字的（main方法有static修饰）
        //所以只能创建本类对象，再去引用
        list.stream()
                .filter(new Demo3_Function_MemberMethod() ::stringJudge)
                .forEach(System.out::println);
    }
    public boolean stringJudge(String str) {
        return str.startsWith("张") && str.length() == 3;

    }
}
