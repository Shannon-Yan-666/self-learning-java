package demo13_map_api_method;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 目标：Map集合的遍历方式
 * 方式：
 *      1.键找值
 *      2.键值对
 *      3.Lambda表达式
 *
 */

public class demo2_Map_For_Lambda {
    public static void main(String[] args) {
        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("小影", "老糖");
        map.put("蓝莓", "山药");
        map.put("牛奶", "小老爱");

        //3.遍历：通过键找值
        //3.1获取所有键元素，放到一个单列集合当中
        Set<String> keys = map.keySet();

        //3.2遍历单列集合，找到所有的键(it迭代器、增强for、forEach)
        //3.2.1增强for遍历
        System.out.println(" 键找值-增强for遍历 ");
        for (String key : keys) {
//            System.out.println(key);
            //3.3利用map集合中的键获取对应的值  get方法
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println(" 键找值-Iterator迭代器遍历 ");
        //3.2.2it迭代器遍历
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            Object n = it.next();
            System.out.println(n + " = " + map.get(n));
        }

        System.out.println(" 键找值-Lambda表达式遍历 ");
        //3.2.3Lambda表达式遍历
        map.forEach((k, v) -> System.out.println(k +  " = " + v));

        //4.遍历：通过键值对对象
        //4.1获取所有的键值对对象，放到一个单列，set集合当中
        //      Entry是Map集合中的内部接口，需要用外部接口.内部接口，进行调用
        Set<Map.Entry<String, String>> entries = map.entrySet();

        System.out.println(" 键值对对象-增强for遍历 ");
        //4.2.1增强for遍历entries集合，获取每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {//entry-->临时变量，获取每个元素
            //4.3 使用get方法获取每一个键/值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

        System.out.println(" 键值对对象-Iterator迭代器遍历 ");
        //4.2.2it迭代器
        Iterator<Map.Entry<String, String>> it1 = map.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            System.out.println(entry);
        }

        System.out.println(" 通过-Lambda表达式遍历 ");
        //5.遍历：通过Lambda表达式
        //底层：利用增强for遍历entrySet集合，依次获取每一个键/值，再调用accept方法
        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
