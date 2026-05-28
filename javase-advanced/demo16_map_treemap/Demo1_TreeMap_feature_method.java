package demo16_map_treemap;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 目标：掌握  TreeMap的特点/使用方法
 * 特点：
 *      底层跟TreeSet集合底层原理一样，都是红黑树结构的。（增删改查性能比较好）
 *      可排序、不重复、无索引，都是由键决定的
 *  排序：
 *      对键进行排序
 *      默认按照键的从小到大进行排序，也可以自行规定键的排序规则。
 *
 *      规则书写方式：
 *      1、实现Comparable接口，指定比较规则。
 *      2、创建集合时传递Comparator比较器对象，指定比较规则。（权重更高）
 *
 *         /统计思想：利用map集合进行统计
 *         //HashMap：如果没有要求对结果进行排序，默认使用HashMap
 *         //TreeMap：如果要求对结果进行排序，请使用TreeMap
 *
 */
public class Demo1_TreeMap_feature_method {
    public static void main(String[] args) {
        /*
        需求1:
            键:整数表示id
            值:字符串表示商品名称
            要求:按照id的升序排列、按照id的降序排列
         */

        //创建一个集合
        TreeMap<Integer,String> tm = new TreeMap<>((o1, o2)-> o2.compareTo(o1));

        tm.put(1,"A");
        tm.put(3,"C");
        tm.put(2,"B");

        System.out.println(tm);

        /*
        需求2:
        键:学生对象
        值:籍贯
        要求:按照学生年龄的升序排列
            年龄一样按照姓名的字母排列，同姓名年龄视为同一个人
         */

        //创建集合
        TreeMap<Animal,String> tm2 = new TreeMap<>();
        Animal a3=new Animal("c",3);
        Animal a1=new Animal("a",1);
        Animal a2=new Animal("b",2);

        tm2.put(a1,"泰兰德");
        tm2.put(a2,"曼谷");
        tm2.put(a3,"清迈");
        System.out.println(tm2);

        /*
        统计个数
            需求:字符串“aababcabcdabcde”
            请统计字符串中每一个字符出现的次数，
            并按照以下格式输出输出结果:
            a (5) b (4)c (3)d (2) e (1)
         */

        //1.定义字符串
        String str1 = "aababcabcdabcde";

        //统计思想：利用map集合进行统计
        //HashMap：如果没有要求对结果进行排序，默认使用HashMap
        //TreeMap：如果要求对结果进行排序，请使用TreeMap

        //2.创建集合： Character代表字符类型
        TreeMap<Character,Integer> tm3 = new TreeMap<>();
        //3.遍历字符串
        for (int i = 0; i < str1.length(); i++) {
            //3.2.用charAt方法，获取遍历到的每一字符
            char str = str1.charAt(i);
            //3.3.拿着str在集合中进行判断
            if (tm3.containsKey(str)) {
                tm3.put(str, tm3.get(str) + 1);
            }else {
                tm3.put(str, 1);
            }
        }
        System.out.println(tm3);

        //4.遍历集合，并按照指定的格式进行拼接
        //StringBuilder 拼接方法
        StringBuilder sb = new StringBuilder();
        tm3.forEach((k,v)->sb.append(k).append("(").append(v).append(")").append(" "));
        System.out.println(sb);
    }
}
