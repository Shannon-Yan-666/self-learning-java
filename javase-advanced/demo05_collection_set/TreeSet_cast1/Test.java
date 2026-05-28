package demo05_collection_set.TreeSet_cast1;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 目标：掌握TreeSet集合的两种比较方式
 * 使用原则：默认使用方式一，如果方式一不满足当前需求，就使用方式二
 *
 * 方式一:
 *         默认的排序规则/自然排序
 *         Javabean类实现 Comparable接口指定比较规则
 * 方式二：
 *          比较器排序
 *          创建TreeSet对象时，传递比较器Comparator指定规则
 *
 * 需求:创建TreeSet集合，并添加3个学生对象
 * 学生对象属性:
 * 姓名，年龄。
 * 要求按照学生的年龄进行排序
 * 同年龄按照姓名字母排列(暂不考虑中文)
 *同姓名，同年龄认为是同一个人
 */
public class Test {
    public static void main(String[] args) {
        //1.创建三个学生对象
        Student3 s1 = new Student3("zhangsan",23);
        Student3 s2 = new Student3("lisi",24);
        Student3 s3 = new Student3("wangwu",25);

        //2.创建TreeSet集合
        TreeSet<Student3> ts = new TreeSet();

        //3.添加元素
        ts.add(s3);
        ts.add(s1);
        ts.add(s2);

        //4.打印集合
        System.out.println(ts);
    }
}
