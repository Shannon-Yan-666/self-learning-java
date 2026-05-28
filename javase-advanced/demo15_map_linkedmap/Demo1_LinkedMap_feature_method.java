package demo15_map_linkedmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *  目标：掌握 LinkedHashMap 的特点/使用方法
 *  特点：有序（存取顺序一致）、不重复、无索引，都是由键决定的。
 *  底层原理：
 *          底层是哈希表，每个键值对元素，额外增加了一个双链表机制，用来记录存储的顺序。
 *
 *
 */
public class Demo1_LinkedMap_feature_method {
    public static void main(String[] args) {
        //创建集合
        Map <String , Integer > map = new LinkedHashMap<String , Integer>() ;

        //添加元素，存取有序
        map.put("C", 789);
        map.put("A", 123);
        map.put("A", 123);//去重或覆盖
        map.put("A", 111);//覆盖
        map.put("B", 456);

        //打印集合
        System.out.println(map);

    }
}
