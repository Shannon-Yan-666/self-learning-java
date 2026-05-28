package demo19_stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 目标：掌握Steam流的  终结 方法的使用
 * 方法：
 * 方法名                           说明
 * collect(Collector collector)       收集流中的数据，放到集合中（List Set Map）
 */
public class Demo5_Stream_Collector {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13",
                "张强-男-20", "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        //收集到List集合当中
        //需求：收集所有的男性
        List<String> newList = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                //      toList静态方法：底层可以创建一个ArrayList集合
                .collect(Collectors.toList());
//        System.out.println(newList);

        //收集到Set集合中(无序、去重)
        //需求：收集所有的男性
        Set<String> newlist2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toSet());
//        System.out.println(newlist2);

        //收集到Map集合中
        //指定：键和值
        //需求：收集所有的男性，键：姓名、值：年龄
        //细节：Map集合，键必须保证唯一，不能够重复（否则报错）
        Map<String, Integer> newlist3 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
                //        toMap方法：需要指定键和值的规则
                //参数一：代表流里面的数据类型
                //参数二：代表Map集合中键/值的数据类型
                .collect(Collectors.toMap(
                        new Function<String, String>() {
                            @Override
                            //代表返回的键数据类型|代表流的数据类型
                            public String apply(String s) {
                                //apply方法：生成键的代码/方法体
                                return s.split("-")[0];
                            }
                        }, new Function<String, Integer>() {
                            @Override
                            //代表返回的键数据类型|代表流的数据类型
                            public Integer apply(String s) {
                                //apply方法：生成值的方法体
                                //获取的是String，使用parseInt进行强转
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));
//        System.out.println(newlist3);

        //Lambda表达式：简化写法
        Map<String, Integer> newlist4 = list.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0],
                        s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(newlist4);
    }
}
