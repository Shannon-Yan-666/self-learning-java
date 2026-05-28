package demo05_collection_set;
import demo05_collection_set.HashSet_cast1.Student;
import java.util.LinkedHashSet;

/**
 *  目标：掌握LinkedHashSet 集合
 *  特点：有序（存取元素的顺序一致）、不重复、无索引
 *  底层原理：
 *          有序原理： 底层依然是哈希表，
 *                  只是每个元素又额外多了一个双链表的机制记录存储的顺序。
 *  使用场景：默认使用HashSet
 *          如果要求去重且存取有序，才使用LinkedHashSet（操作多/效率较低）
 *
 */
public class Demo03_LinkedHashSet_feature {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //创建集合对象
        LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();

        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
    }
}
