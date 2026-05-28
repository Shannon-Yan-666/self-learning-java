package demo20_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 练习1:
 * 集合中存储一些字符串的数据，比如:张三,23。
 * 收集到Student类型的数组当中(使用方法引用完成)
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "李四,24", "王五,25");

        Student[] array = list.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(array));
    }
}
