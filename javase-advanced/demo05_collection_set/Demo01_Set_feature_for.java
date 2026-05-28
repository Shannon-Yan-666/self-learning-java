package demo05_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *  目标：了解 Set集合的特性，掌握Set集合的遍历方式
 *  特性：
 *      1.无序：存取顺序不一致
 *      2.不重复：可以去除重复
 *      3.无索引：没有待索引的方法，所以不能使用普通for循环遍历，也不能通过索引获取元素
 *
 *  实现类：
 *       HashSet：       无序、不重复、无索引
 *       LinkedHashSet： 有序、不重复、无索引
 *       TreeSet：       可排序、不重复、无索引
 *
 *  API： Set接口中的方法基本上与Collection的API一致
 *        add 添加  clear 清空  remove 删除
 *        contains 包含  isEmpty 是否为空  size 元素个数/集合长度
 *
 *  遍历方式：
 *      1.迭代器
 *      2.增强for
 *      3.Lambda表达式
 *
 *  使用场景：
 *  List集合：
 *          集合中元素可重复：用 ArrayList集合，基于数组的。（用的最多）
 *          集合中元素可重复，且增删操作明显对于查询：用 LinkedList 集合，基于链表 的。（用的最多）
 *  Set集合：
 *          集合中元素不重复：用  HashSet 集合，基于哈希表。（用的最多）
 *          集合中元素不重复，且保证存取顺序：用  LinkedHashSet 集合，基于哈希表和双链表，效率低于HashSet。
 *          集合中元素不重复，且元素进行排序：用 TreeSet 集合，基于红黑树。后续也可以用List集合实现排序。
 *
 *
 *
 */
public class Demo01_Set_feature_for {
    public static void main(String[] args) {
        //1.创建一个Set集合实现类的对象（Set是一个接口，不能直接创建对象）
        Set<String> set = new HashSet<String>();

        //2.添加元素（add方法带有布尔类型的返回值）
        boolean r1 = set.add("张三");
        boolean r2 = set.add("张三");
        //如果当前元素是第一次添加为true，当前元素是第二次添加为false
        System.out.println(r1);//返回值true
        System.out.println(r2);//返回值false
        set.add("李四");
        set.add("王五");
        set.add("赵六");

        //3.打印集合（集合特性：无序展示）
        System.out.println(set);//（自动去重）

        //迭代器遍历
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        //增强for遍历
        for (String str : set) {
            System.out.println(str);
        }

        //Lambda表达式遍历
        set.forEach((str)->System.out.println(str));
    }
}
