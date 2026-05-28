package demo13_map_api_method;

import java.util.HashMap;
import java.util.Map;

/**
 * 目标：掌握 Map集合的常见API
 *      Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
 * 特点：
 *      1.双列集合一次需要存一对数据，分别为键和值；
 *      2.键不能重复，值可以重复；
 *      3.键和值是一一对应的，每一个键只能找到自己对应的值
 *      4.键 + 值 这个整体 我们称之为“键值对” 或者 “键值对对象”
 *
 *  API方法：
             * V put(K key,V value)                 添加元素
             * V remove(Object key)                 根据键删除键值对元素
             * void clear()                         移除所有的键值对元素
             * boolean containsKey(Object key)      判断集合是否包含指定的键
             * boolean containsValue(Object value)  判断集合是否包含指定的值
             * boolean isEmpty()                    判判断集合是否为空
             * int size()                           集合的长度（集合中键值对的个数）
 *
 */
public class demo1_Map_feature_API_method {
    public static void main(String[] args) {
        //创建Map集合 （接口）
        Map<String,String> m1 = new HashMap<>();

        //V put(K key,V value)  添加元素-有返回值
        //put 方法：添加/覆盖
        // 在添加数据时，如果键不存在，那么直接把键值对对象添加到Map集合中
        // 在添加数据时，如果键是存在的，那么原有的键值对对象覆盖，被覆盖的值会进行返回。
        m1.put("小影", "老糖");
        m1.put("蓝莓", "山药");
        m1.put("牛奶", "小老爱");

        //被覆盖值的返回值
//        String result = m1.put("牛奶", "邦尼");
//        System.out.println(result);

        //V remove(Object key)   根据键删除键值对元素-有返回值
//        String result = m1.remove("牛奶");
//        System.out.println(result);

        //void clear()   移除所有的键值对元素
//        m1.clear();

        //boolean containsKey(Object key)      判断集合是否包含指定的键
        boolean KeyResult = m1.containsKey("牛奶");
        System.out.println(KeyResult);//true

        //boolean containsValue(Object value)  判断集合是否包含指定的值
        boolean ValueResult = m1.containsValue("山药");
        System.out.println(ValueResult);//true

        // boolean isEmpty()  判判断集合是否为空
        System.out.println(m1.isEmpty());//false

        //int size()   集合的长度（集合中键值对的个数）
        System.out.println(m1.size());//3

        //打印Map集合
        System.out.println(m1);
    }
}
