package demo20_function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 目标：掌握引用构造方法
 * 格式：类名 ::  new
 *      示例：Student :: new
 * 作用：为了创建类的对象
 */
public class Demo5_Function_ConstructorMethod {

    //需求：
    //集合里面存储姓名和年龄，要求封装成Student对象并收集到List集合中
    //方法引用的规则:
    //1.需要有函数式接口
    //2.被引用的方法必须已经存在
    //3.被引用方法的形参和返回值，需要跟抽象方法的形参返回值保持一致
    //4.被引用方法的功能需要满足当前的需求
    //"张无忌,15","周芷,14","赵敏,13","张强,20","张三,100","张举山,40","张良,35","王二麻子,37"

    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        Collections.addAll(list,"张无忌,15","周芷,14","赵敏,13",
                "张强,20","张三,100","张举山,40","张良,35","王二麻子,37");

        List<Student> newList = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Student(name, age);
            }
        }).collect(Collectors.toList());
        System.out.println(newList);


        List<Student> newList2 = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(newList2);
    }
}
