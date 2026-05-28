package demo20_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

/**
 * 目标：掌握使用类名引用成员方法
 * 格式：类名  :: 成员方法
 * 示例：String :: substring
 *
 * 独有的规则：
 *      1、需要有函数式接口
 *      2、被引用的方法必须已经存在
 *      3、被引用的方法形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致
 *      4、被引用的方法功能需要满足当前的需求
 *
 * 抽象方法形参的详解:
 *       第一个参数:表示被引用方法的调用者，决定了可以引用哪些类中的方法！！！
 *       在Stream流当中，第一个参数一般都表示流里面的每一个数据。
 *       假设流里面的数据是字符串，类名只能引用String这个类中的方法
 *
 *       第二个参数到最后一个参数:跟被引用方法的形参保持一致，
 *       如果没有第二个参数，说明被引用的方法需要是无参的成员方法
 *
 * 局限性：
 *      不能引用所有类中的成员方法
 *      跟抽象方法的第一个参数有关，第一个参数是什么类型，就只能引用同类型类中的方法。
 *
 */
public class Demo4_Function_OtherClassMethod {
    public static void main(String[] args) {
        //集合里面一些字符串，要求变成大写后进行输出

        ArrayList<String>list = new ArrayList<>();
        Collections.addAll( list, "A", "B", "C");

        list.stream().map(new Function<String,String>(){
            @Override
            public String apply(String s) {
                //String API ：toUpperCase方法：转大写
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

        list.stream().map(String :: toUpperCase).forEach(System.out::println);
    }
}
