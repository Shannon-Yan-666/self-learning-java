package demo19_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *数据操作
 * 现在有两个ArrayList集合，
 * 第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。姓名和年龄中间用逗号隔开。比如:张三,23要求完成如下的操作:
 * 1，男演员只要名字为3个字的前两人
 * 2，女演员只要姓杨的，并且不要第一个
 * 3，把过滤后的男演员姓名和女演员姓名合并到一起
 * 4，将上一步的演员信息封装成Actor对象。
 * 5，将所有的演员对象都保存到List集合中。
 * 备注:演员类Actor，属性只有一个:name，age
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<String>boyList = new ArrayList<>();
        Collections.addAll(boyList,"张一一,11","张二一,12","张三一,13","张四,14","张五,15","张六,16");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList,"杨一,11","杨二,12","杨三,13","李四,14","李五,15","李六,16");

        List<String> NBlist = boyList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2).collect(Collectors.toList());

        List<String> NGlist = girlList.stream()
                .filter(s -> (s.split(",")[0]).startsWith("杨"))
                .skip(1).collect(Collectors.toList());

        Stream.concat(NBlist.stream(),NGlist.stream()).map(new Function<String,Actor>(){
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                Integer age = Integer.valueOf(s.split(",")[1]);
                return new Actor(name,age);
            }
        })
                .forEach(System.out::println);

        List<Actor> ActorList = Stream.concat(NBlist.stream(), NGlist.stream())
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(ActorList);
    }
}
