package demo17_collections_method_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *  目标：掌握常用的Collections工具类
 *
 *                                  方法名                             说明
 * public static <T> boolean addAll(Collection<T> c, T... elements) 批量添加元素
 * public static void       shuffle(List<?> list)                   打乱List集合元素的顺序
 * public static <T> void   sort(List<T> list)                      排序
 * public static <T> void   sort(List<T> list, Comparator<T> c)     根据指定的规则进行排序
 * public static <T> int    binarySearch (List<T> list, T key)      以二分查找发查找元素
 * public static <T> void   copy(List<T> dest, List<T> src)         拷贝集合中的元素
 * public static <T> int    fill (List<T> list, T obj)              使用指定的元素填充集合
 * public static <T> void   max/min(Collection<T> coll)             根据默认的自然排序获取最大/最小值
 * public static <T> void   swap(List<?> list, int i, int j)        交换集合中指定位置的元素
 *
 */
public class Demo1_Collections_Method_API {
    public static void main(String[] args) {
        //默认规则，需要重写Comparable接口compareTo方法。Integer已经实现了从小到达的排序规则
        //如果是自定义对象，需要自己指定规则
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //sort(List<T> list)
        //小到大排序
        Collections.sort(list);

        //sort(List<T> list, Comparator<T> c)  根据指定规则排序
        //从大到小排序
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1));
        System.out.println(list);

        Integer max = Collections.max(list);
        System.out.println(max);
        Integer min = Collections.min(list);
        System.out.println(min);
    }
}
