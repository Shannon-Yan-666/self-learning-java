package demo05_collection_set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *  目标：掌握TreeSet集合/排序规则
 *  底层原理：
 *        底层是机遇红黑树的数据结构实现排序的，增删改查性能都较好。
 *  特点：可排序（按照元素的默认规则（从小到大）排序）、不重复、无索引
 *  默认的排序/自然排序规则：
 *          数值类型：Integer, Double ,默认按照从小到大的顺序进行排序。
 *          字符、字符串类型：按照字符在ACS||码表中的数字升序进行排序。
 *                        (按照首字母进行比较，跟字符长度无关，如果首字母相同，就比较第二顺位...)
 *  比较规则：
 *  * 使用原则：默认使用方式一，如果方式一不满足当前需求，就使用方式二
 *            如果方式一和方式二同时存在，java会优先按照方式二的规则进行排序。
 *  *
 *  * 方式一:
 *  *         默认的排序规则/自然排序
 *  *         Javabean类实现 Comparable接口，指定比较规则
 *  * 方式二：
 *  *         比较器排序
 *  *         创建TreeSet对象时，自定义Comparator比较器对象，指定规则
 *  返回值的特点：
 *          负数：表示当前要添加的元素是小的，存左边
 *          正数：表示当前要添加的元素是大的，存右边
 *           0 ：表示当前要添加的元素已经存在，会自动舍去，不会存在集合中
 *
 */
public class Demo04_TreeSet_feature {
    public static void main(String[] args) {
        //需求：利用TreeSet存储整数并进行排序

        //1.创建TreeSet集合对象
        TreeSet<Integer> ts = new TreeSet();

        //2.添加元素
        ts.add(3);
        ts.add(6);
        ts.add(5);
        ts.add(2);
        ts.add(1);

        //3.打印集合
        System.out.println(ts);//默认从小大排序

        //4.1迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            Integer integer = it.next();
            System.out.println(integer);
        }
        System.out.println("-------------------");

        //4.2增强for遍历
        for (Integer t : ts) {
            System.out.println(t);
        }
        System.out.println("-------------------");

        //4.3 lambda遍历
        ts.forEach((t) -> System.out.println(t));
    }
}
