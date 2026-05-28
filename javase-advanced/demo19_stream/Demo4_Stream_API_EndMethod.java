package demo19_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

/**
 *  目标：掌握Steam流的  终结 方法的使用
 * 方法：
 *      方法名                           说明
 * void forEach(Consumer action)       遍历
 * long count()                        统计
 * toArray()                          收集流中的数据，放到数组中
 * collect(Collector collector)       收集流中的数据，放到集合中
 *
 */
public class Demo4_Stream_API_EndMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌","周芷若","赵敏",
                "张强","张三丰","张翠山","张良","王二麻子","谢广坤");

        // void forEach(Consumer action)方法：遍历
        list.stream().forEach(System.out::println);

        System.out.println("=========================");
        // long count()方法：统计
        long count = list.stream().count();
        System.out.println(count);


        System.out.println("=========================");
        // toArray() 方法：收集流中的数据，放到数组中
        //参数：value代表流当中数据的个数
        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));


        System.out.println("=========================");
        // collect(Collector collector) 方法：收集流中的数据，放到集合中
    }
}
