package demo20_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 *练习2:
 * 创建集合添加学生对象，学生对象属性:name，age
 * 只获取姓名并放到数组当中(使用方法引用完成)
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Jack", 21));
        list.add(new Student("Yancy", 22));
        list.add(new Student("Film", 23));

        String[] array = list.stream().map(Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
