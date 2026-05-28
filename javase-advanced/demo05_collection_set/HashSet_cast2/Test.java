package demo05_collection_set.HashSet_cast2;

import java.util.HashSet;

/**
 * 利用HashSet集合去除重复元素
     * 需求:
     *      创建一个存储学生对象的集合，存储多个学生对象。
     *      使用程序实现在控制台遍历该集合。
     * 要求:
     *      学生对象的成员变量值相审，我们就认为是同一个对象
 *
 */
public class Test {
    public static void main(String[] args) {
        //1.创建四个学生对象
        Student2 s1 = new Student2("zhangsan",23);
        Student2 s2 = new Student2("lisi",24);
        Student2 s3 = new Student2("wangwu",25);
        Student2 s4 = new Student2("zhangsan",23);

        //2.创建集合用来添加学生（去重）
        HashSet<Student2> hs = new HashSet();

        //3，添加元素
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));

        //4.打印集合
        System.out.println(hs);
    }
}
