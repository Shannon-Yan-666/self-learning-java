package demo03_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * 目标：掌握Collection集合的通用遍历方式（有索引/无索引）
 *      方法名称                        方法                      说明/功能
 *      1.迭代器遍历：不依赖索引
 *                                  iterator()       返回迭代器对象，默认指向当前集合的 0 索引
 *                               boolean  hasNext     判断当前位置是否有元素
 *                                    E next()       获取当前位置的元素，并将迭代器对象移向下一个位置
 *
 *      2.增强for遍历：JDK5之后，底层就是迭代器，为了简化迭代器的代码书写。（单列集合/数组）
 *              格式：
 *                   for(元素的数据类型  变量名 : 数组/集合){
 *                          方法体
 *                          sout(变量名)
 *                   }
 *      3。Lambda表达式遍历：JDK8的新技术，更简单、更直接的遍历方式
 *              格式：
 *                  forEach(Consumer<? super T> action)
 *
 *  使用场景：  迭代器：在遍历过程中需要删除元素，使用迭代器
 *           增强for、Lambda：仅遍历集合，可以使用
 */
public class Demo3_Collection_foreach_lambda {
    public static void main(String[] args) {

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<String>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //2.利用增加强for，进行遍历
        //变量s : 是一个临时变量（第三方变量），在循环过程中一次表示集合中的每一个元素
        //for(元素的数据类型  变量名 : 数组/集合)
        //快捷键： 集合名称.for
        for (String s : coll) {
            System.out.println(s);
        }

        //3.利用lambda表达式，进行遍历
        //快捷键： 集合名称.forEach
        //底层原理：for循环遍历集合，把每一个元素传递给accept方法处理

        //3.1 匿名内部类的形式
        coll.forEach(new Consumer<String>() {
            @Override
            // 变量s ：依次表示集合中的每一个数据
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //3.2 lambda表达式
//        coll.forEach(System.out::println);
        coll.forEach(s -> System.out.println(s));
    }
}
