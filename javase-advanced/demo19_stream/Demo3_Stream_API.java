package demo19_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * 目标：掌握Steam流的  中间 方法的使用
 * 方法：
 *          方法名                                   说明
 *      filter(Predicate<? super T>predicate)      过滤
 *      limit(long maxSize)                       获取前几个元素
 *      skip(long n)                              跳过前几个元素
 *      distinct()                         元素去重，底层依赖（hashCode和equals方法，自定义类需要重写）
 *      concat(Stream a , Stream b)              合并 a 和 b 两个流为一个流
 *      map(Function<T,R> mapper)                转换流中的数据类型

 * 注意1:中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
 * 注意2:修改Stream流中的数据，不会影响原来集合或者数组中的数据
 */
public class Demo3_Stream_API {
    public static void main(String[] args) {
        ArrayList<String>list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌","张无忌","张无忌","张强","张三丰","张翠山","张良","王二麻子","谢广坤");
        ArrayList<String>list2 = new ArrayList<>();
        Collections.addAll(list2,"周芷若","赵敏");
        ArrayList<String>list3 = new ArrayList<>();
        Collections.addAll(list3,"张无忌-15","周芷若-14","赵敏-13","张强-20","张三丰-100","张翠山-40","张良-35","王二麻子-37");
        //filter方法：过滤
        //startsWith:以“”开头
        list1.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()>=3)
                .forEach(s->System.out.println(s));

        System.out.println("==============================");
        //limit(long maxSize)方法：获取前几个元素
        list1.stream().limit(3).forEach(s->System.out.println(s)) ;

        System.out.println("==============================");
        //skip(long n)方法：跳过前几个元素
        list1.stream().skip(3).forEach(s->System.out.println(s)) ;

        // distinct()方法：元素去重
        //底层依赖（hashCode和equals方法，自定义类需要重写）
        list1.stream().distinct().forEach(s->System.out.println(s));

        System.out.println("==============================");
        //concat(Stream a , Stream b)方法：合并 a 和 b 两个流为一个流
        // 尽可能让数据类型保持一致
        // 不一致，则会合并为两个类型的父类（自动做类型提升），无法使用子类的特有功能/方法
        Stream.concat(list1.stream(), list2.stream()).forEach(s->System.out.println(s));

        System.out.println("==============================");
        //map(Function<T,R> mapper) 方法：转换流中的数据类型
        //需求：只获取里面的年龄，并进行打印
        //参数：
        //split: String API  切割方法，按照指定符号进行切割，返回一个数组（0索引：姓名、1索引：年龄）
        //  [1]: 获取上方返回数组的 1索引位置的元素，就是年龄（0索引是名字）
        list3.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s->System.out.println(s));


    }
}
