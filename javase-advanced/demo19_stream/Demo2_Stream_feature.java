package demo19_stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * 目标：了解Stream流
 * 作用：结合了Lambda表达式，简化集合、数组的操作
 * 使用步骤：
 *          1、先得到一条Stream流（流水线），并把数据放上去
 *          2、利用Stream流中的API进行各种操作
 *              中间方法：方法调用完毕之后，还可以调用其他方法
 *                      比如：  过滤  转换
 *              终结方法：最后一步，调用完毕之后，不能调用其他方法
 *                      比如：   统计  打印
 *
 * 方法：
 *                          方法名                                              说明
 *      单列集合        default Stream<E> stream()                      Collection中的默认方法
 *      双列集合        无（需先转成单列集合：keySet方法、entrySet方法）       无法直接使用stream流
 *      数组           public static <T> Stream<T> stream(T[] array)   Arrays工具类中的静态方法
 *一堆零散数据（同类型）   public static<T> Stream<T> of(T... values)      Stream接口中的静态方法
 */
public class Demo2_Stream_feature {
    public static void main(String[] args) {
        //1.创建单列集合，获取Stream流
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "A", "B", "C", "D", "E", "F");
        //获取一条流水线，并把集合中的数据放到流水线上
//        Stream<String> stream1 = list.stream();
        //使用终结，打印流水线上的所有数据
//        stream1.forEach(System.out::println);
        list.stream().forEach(name-> System.out.println(name));

        //2.创建双列集合
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);

        //2.1.获取Stream流
        map.keySet().stream().forEach(System.out::println);//打印所有键
        map.entrySet().stream().forEach(System.out::println);//打印所有键值对

        //3.创建数组，获取Stream流
        int[]arr = {1,2,3,4,5};//基本数据类型
        Arrays.stream(arr).forEach(System.out::println);
        String[] arr1 = {"A","B","C","D","E","F"};//引用数据类型
        Arrays.stream(arr1).forEach(System.out::println);

        //4.一堆零散数据（同类型），获取Stream流
        Stream<String> stream2 = Stream.of("A","B","C","D","E","F");
        stream2.forEach(System.out::println);
    }
}
