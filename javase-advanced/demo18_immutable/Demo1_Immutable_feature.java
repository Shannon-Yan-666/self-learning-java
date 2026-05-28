package demo18_immutable;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 目标：掌握不可变集合
 * 特点：长度不可变，内容不可修改，不能删除，只能用来查询
 * 应用场景：
 *         如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践。
 *         或者当集合对象被不可信的库调用时，不可变形式是安全的。
 * 方法：
 *              方法名                                 说明
 * static<E>    List<E>  of(E...elements)    创建一个具有指定元素的List集合对象
 * static<E>    SEt<E>   of(E...elements)    创建一个具有指定元素的Set集合对象（元素不能重复）
 * static<K,V>  Map<K,V> of(E elements)      创建一个具有指定元素的Map集合对象（元素不能重复，最多10个键值对）
 *              Map      copyOf(集合)         创建一个具有指定元素的Map集合对象（元素不能重复，可以超过10个键值对）
 *
 * 注意：
     * Map.of :无可变参数，最多只能传递10个键值对。
     *         因为Java中可变参数只能存在一个，而键值对是2个参数。
 *
 */
public class Demo1_Immutable_feature {
    public static void main(String[] args) {
        //创建不可变List集合
        //该集合一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        List<String> list = List.of("a", "b", "c", "d");

        //创建不可变Set集合：无索引，不能用普通for遍历
        //参数：必须保证唯一性，不可能重复。（报错）
        Set<String> set = Set.of("a", "b", "c", "d");

        //创建不可变Map集合：
        //键：必须保证唯一性，不能重复。（报错）
        //Map.of：最多只能传递10个键值对。
        Map<String, String> map = Map.of("a", "b", "c", "d");



        //List集合：增强for遍历
        for (String s : list) {
            System.out.println(s);
        }

        //List集合：普通for遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        //List集合：迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.println(s);}

        //Set集合：增强for—Lambda表达式遍历
        set.forEach((s)->System.out.println("Set集合："+s));

        //Map集合：键遍历
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        //Map集合：键值对对象遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}
