package demo05_collection_set.TreeSet_cast2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 需求:请自行选择比较器排序和自然排序两种方式;
 * 要求:存入四个字符串，“c”，“ab”，“df”，“qwer”
 * 按照长度排序，如果一样长则按照首字母排序
 */
public class Test {
    public static void main(String[] args) {
        //1.创建集合
//        TreeSet<String> ts = new TreeSet<>((o1, o2)->(o1.length()-(o2.length())) == 0 ? o1.compareTo(o2) : (o1.length()-(o2.length())));
        TreeSet<String> ts = new TreeSet<>((o1, o2)-> {
            //按照长度排序
            int i = o1.length() - o2.length();
            //三元运算符写法
            //如果长度一样（为0），则使用compareTo默认的首字母规则排序
            //如果长度不一样（不为0）则按照 i 规则，按字符长度进行排序
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;
            });

        //2.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        //3.打印集合
        System.out.println(ts);//字符串有默认修改规则

    }
}
