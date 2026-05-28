package demo20_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * 目标：掌握引用静态方法
 * 格式： 类名::静态方法
 *      示例：Integer::parseInt
 */
public class Demo2_Function_StaticMethod {
    public static void main(String[] args) {
        //需求：把集合中的数字，变成int类型
        ArrayList<String>list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5", "6");

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);

        //方法引用
        list.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);

    }
}
