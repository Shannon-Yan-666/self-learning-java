package demo05_collection_set.TreeSet_cast3;

import java.util.TreeSet;

/**
 * TreeSet对象排序练习题
 * 需求:创建5个学生对象
 * 属性:(姓名,年龄，语文成绩,数学成绩,英语成绩)
 * 排序规则：
     * 按照总分从高到低输出到控制台
     * 如果总分一样，按照语文成绩排
     * 如果语文一样，按照数学成绩排
     * 如果数学成绩一样，按照英语成绩排
     * 如果英文成绩一样，按照年龄排
     * 如果年龄一样，按照姓名的字母顺序排
     * 如果都一样，认为是同一个学生，不存。
 */
public class Test {
    public static void main(String[] args) {
        Student4 s1 = new Student4("zhangsan",23,90,99,50);
        Student4 s2 = new Student4("lisi",24,90,98,50);
        Student4 s3 = new Student4("wangwu",25,95,100,30);
        Student4 s4 = new Student4("zhaoliu",26,60,99,70);
        Student4 s5 = new Student4("tianqi",26,70,80,70);

        //创建集合对象
        //一般默认使用ArrayList集合
        //如果要求数据唯一，默认使用HashSet集合
        //如果要求数据唯一+排序，使用Tree集合
        TreeSet<Student4> ts = new TreeSet<Student4>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        //打印
        for (Student4 t : ts) {
            System.out.println(t);
        }

    }
}
