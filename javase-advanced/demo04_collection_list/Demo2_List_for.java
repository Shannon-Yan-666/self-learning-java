package demo04_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *  目标：List集合的遍历方式（共5种方式）
 *      1.继承了Collection集合的通用遍历方式：iterator迭代器、增强for、lambda
 *      2.List集合独有的遍历方式： 列表迭代器遍历、普通for循环（因为List集合存在索引）
 *                               迭代器名称     方法名称          说明
 *                             ListIterator  add(E e)   将指定的元素插入列表
 *
 *  使用场景：
 *          迭代器遍历： 在遍历过程中，需要删除元素。  iterator
 *          列表迭代器遍历： 在遍历的过程中，需要添加元素。 ListIterator
 *          增强for、Lambda表达式： 仅遍历（代码简单） .for / .forEach
 *          普通for遍历： 在遍历的时候，需要操作索引，可以使用普通 .fori
 *
 *
 */
public class Demo2_List_for {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        List<String> list = new ArrayList<String>();
        list.add("Film");
        list.add("Namtan");
        list.add("Lookmhee");
        list.add("LMSY");
//        System.out.println(list);

        //2.使用 Collection iterator迭代器方式，进行遍历
        //创建迭代器的对象，指针默认指向0索引
        Iterator<String> it = list.iterator();
        //判断条件：hasNext 判断当前位置是否有元素
        //        返回true则进入循环内部
        while (it.hasNext()) {
            //next方法：移动指针，并获取当前位置的元素，并把指针后移一位（交给一个变量，可以多次使用）
            String s = it.next();
            System.out.println(s);
        }

        //3.使用  增强for方式，进行遍历 .for
        //变量s：是三方变量，在循环过程中，依次表明集合中的每一个元素
        for (String s : list) {
            System.out.println(s);
        }

        //4.使用  Lambda表达式，进行遍历 .forEach
        // 底层：循环得到的元素交给accept方法
        // accept方法的形参s：依次表明集合中的每一个元素
        list.forEach(s-> System.out.println(s));

        //5.使用  普通for循环，进行遍历（List独有方式）.fori
        //size方法、get方法、循环结合的方式，利用索引获取每一个元素
        //变量i: 是索引位置，在循环过程中，依次表明结合中的每一个索引位置
        for (int i = 0; i < list.size(); i++) {
            //获取的每一个索引位置，都交给变量s，进行记录
            String s = list.get(i);
            //打印s变量的内容
            System.out.println(s);
        }

        //6.使用 List iterator列表迭代器方式，进行遍历（List独有方式）
        // 独有方法：在遍历过程中，可以添加元素
        //创建列表迭代器的对象，指针默认指向0索引
        ListIterator<String> it2 = list.listIterator();
        while (it2.hasNext()) {
            String s = it2.next();
            // 增加判断：如果列表种有 film 则进入循环
            if ("Film".equals(s)) {
                //只能使用列表迭代器的add方法添加元素
                it2.add("yanxiao");
            }
        }
        //打印列表中的内容
        System.out.println(list);
    }
}
