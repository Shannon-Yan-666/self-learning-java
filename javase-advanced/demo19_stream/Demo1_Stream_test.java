package demo19_stream;

import java.util.ArrayList;

/**
 * 目标：体验Stream流
 * 创建集合添加元素，完成以下需求:
 * 1.把所有以“张”开头的元素存储到新集合中
 * 2.把“张”开头的，长度为3的元素再存储到新集合中
 * 3.遍历打印最终结果
 */
public class Demo1_Stream_test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        list1.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name)) ;

/*        //1.把所有以“张”开头的元素存储到新集合中
        ArrayList<String> list2 = new ArrayList<>();

        for (String name : list1) {
            if (name.startsWith("张")){
                list2.add(name);
            }
        }
//        System.out.println(list2);
        //2.把“张”开头的，长度为3的元素再存储到新集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list2) {
            if (name.length()==3){
                list3.add(name);
            }
        }

        //3.遍历打印最终结果
        list3.forEach(System.out::println);*/

    }
}
