package demo14_map_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 目标：掌握  HashMap的特点/使用方法（HashMap无特有方法，直接使用Map的方法就可以）
 * 特点：
 *      HashMap是Map集合的一个实现类
 *      特点都由键决定的：无序（存取顺序不一样）、不重复、无索引
 * 底层原理：
 *      HashMap和HashSet，底层原理一样，都是哈希表结构。
 *      1.底层创建一个默认加载因子为 0.75的数组
 *      2.put方法在底层会创建一个Entry对象，利用键计算哈希值，跟值无关
 *      3.根据哈希值计算出在数组需要存储的索引位置，如果为null直接添加/反之会进行覆盖
 *      4.长度超过8 & 数字长度 >=64 ，自动转称红黑树、
 *
 *      5.依赖hashCod方法和equals方法，保证键的唯一（值不唯一）
 *      5.2.如果键存储的是自定义对象，需要重写hashCod方法和equals方法
 *      5.3.如果值存储自定义对象，不需要重写hashCod方法和equals方法
 *
 *
 */
public class Demo1_HashMap_feature_method {
    public static void main(String[] args) {
        //创建一个HashMap集合
        Map<Student, String> map = new HashMap<Student, String>();
        //创建学生对象
        Student s1 = new Student("Film",25);
        Student s2 = new Student("蓝莓",22);
        Student s3 = new Student("蓝莓",22);
        Student s4 = new Student("邦尼",20);

        /*
         * 需求1：
         * 创建一个HashMap集合
         * 键是学生对象(Student)
         * 值是籍贯(String)。
         * 存储三个键值对元素，并遍历
         * 要求:同姓名，同年龄认为是同一个学生
         */

        //添加学生对象到集合中
        map.put(s1, "泰国");
        map.put(s2, "清迈");//被覆盖了
        map.put(s3, "曼谷");
        map.put(s4,"曼谷");
//        System.out.println(map);

        //遍历集合:键找值
        for (Student k : map.keySet()) {
            String v = map.get(k);
            System.out.println(k+"\t"+v);
        }

        System.out.println("--------------------------------");
        //遍历：键值对对象
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"\t"+value);
        }

        System.out.println("--------------------------------");
        //遍历：Lambda表达式
        map.forEach((k, v) -> System.out.println(k+"\t"+v));

    }
}
