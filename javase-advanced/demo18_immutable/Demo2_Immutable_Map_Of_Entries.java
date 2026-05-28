package demo18_immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 目标：掌握Map的不可变集合（键值对的数量超过10个）
 * 方法： Map.ofEntries
 */
public class Demo2_Immutable_Map_Of_Entries {
    public static void main(String[] args) {
        //1.创建一个普通的Map集合
        HashMap<String,String> hm = new HashMap<>();
        hm.put("A","B");
        hm.put("C","D");
        hm.put("D","F");
        hm.put("E","H");
        hm.put("F","A");
        hm.put("G","B");
        hm.put("H","C");
        hm.put("I","D");
        hm.put("J","E");
        hm.put("K","F");
        hm.put("L","G");
        hm.put("M","A");

        //2.利用上面的数据，获取一个不可变的集合
        //2.1. 使用entrySet方法，获取所有键值对对象 entries
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //2.2. 把所有键值对对象 entries ，改造成一个数组
        //需要调用.toArray(T[] a) 方法，带数组形参的方法
        //数组entriesArray：里面获取的就是所有的键值对对象

        // toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        // 如果集合的长度 > 数组的长度:数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        // 如果集合的长度 <= 数组的长度:数据在数组中放的下，此时不会创建新的数组，而是直接用

        Map.Entry[] entriesArray = entries.toArray(new Map.Entry[entries.size()]);
        Map map = Map.ofEntries(entriesArray);

        //一步到位写法：Map不可变集合
        Map<Object, Object> objectObjectMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[entries.size()]));

        //最最最简化写法：JDK10 之后出现的
        Map<String, String> map1 = Map.copyOf(hm);


//        // 遍历数组
//        for (Map.Entry entry : entriesArray) {
//            System.out.println(entry);
//        }
    }
}
