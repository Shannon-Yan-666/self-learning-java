package demo20_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.function.Function;

/**
 * 练习3:创建集合添加学生对象，学生对象属性:name，age
 * 把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三,23", "李四,24", "王五,25");

        String[] arr = list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.replace(",", "-");
            }
        }).toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
