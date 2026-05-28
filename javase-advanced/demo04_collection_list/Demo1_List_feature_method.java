package demo04_collection_list;

import java.util.ArrayList;
import java.util.List;

/**
 *  目标：掌握List集合
 *  集合特点：
 *          有 序      指存取的元素顺序一致
 *          有索引     可以通过索引操作元素
 *          可重复     存储的元素可以重复
 *
 *  特有方法：           方法名                              说明
 *            void  add(int index , E element)      在指定索引处/位置，插入/添加元素
 *              E   remove(int index)               删除指定索引处的元素，返回被删除元素
 *              E   set(int index , E element)      修改指定索引处的元素，返回被修改元素
 *              E   get(int index )                 返回指定索引处的元素
 *
 *  使用场景：
 *  List集合：
 *          集合中元素可重复：用 ArrayList集合，基于数组的。（用的最多）
 *          集合中元素可重复，且增删操作明显对于查询：用 LinkedList 集合，基于链表 的。（用的最多）
 *  Set集合：
 *          集合中元素不重复：用  HashSet 集合，基于哈希表。（用的最多）
 *          集合中元素不重复，且保证存取顺序：用  LinkedHashSet 集合，基于哈希表和双链表，效率低于HashSet。
 *          集合中元素不重复，且元素进行排序：用 TreeSet 集合，基于红黑树。后续也可以用List集合实现排序。
 */
public class Demo1_List_feature_method {
    public static void main(String[] args) {

        //1.创建一个List集合
        List<String> list = new ArrayList<String>();

        //2.添加元素
        list.add("Film");
        list.add("Namtan");
        list.add("Lookmhee");
        list.add("LMSY");
        System.out.println(list);

        //3.在指定位置添加元素
        list.add(3,"山药");
        System.out.println(list);

        //4.删除指定位置的元素
        String remove = list.remove(3);
        System.out.println(remove);
        System.out.println(list);

        //5.修改指定位置的元素
        String s = list.set(1, "yanxiao");
        System.out.println(s);
        System.out.println(list);

        //返回指定位置的元素
        String s1 = list.get(0);
        System.out.println(s1);

    }
}
