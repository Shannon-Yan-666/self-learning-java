package demo03_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
 *               格式：
 *                   forEach(Consumer<? super T> action)
 *
 * 使用场景：  迭代器：在遍历过程中需要删除元素，使用迭代器
 *          增强for、Lambda：仅遍历集合，可以使用
 *
 */
public class Demo2_Collection_iterator {
    public static void main(String[] args) {

        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<String>();
        coll.add("AAA");
        coll.add("bbb");
        coll.add("cc");
        coll.add("D");
        coll.add("eee");

        //2.获取迭代器对象
        // 迭代器好比一个箭头，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();

        //3.利用循环获取集合中的元素
        //使用hasNext方法：判断当前位置是否有元素，如果有则进入循环体内
        while (it.hasNext()){
            //4.next方法：获取元素的同时，指针向后移动一位，停留在下一个元素上
            String str = it.next();
            //5.打印获取的所有元素
            System.out.println(str);
        }

        //迭代器的细节注意点:
        //1.报错NoSuchElementException
//        System.out.println(it.next());//NoSuchElementException  遍历结束后，再次调用报错

        //2.1迭代器遍历完毕，指针不会复位
//        System.out.println(it.hasNext());//false 遍历结束后，指针保持在没有元素的位置
//        System.out.println(it.hasNext());//false
//        System.out.println(it.hasNext());//false

        //2.2如果需要二次遍历，需要创建获取一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()){
            //3.循环中只能用一次next方法（多次使用，会索引越界。
            // 解决方式：将next方法赋值给一个变量，使用变量记录可重复使用
            String str = it2.next();
            //4.迭代器遍历时，不能用集合的方法对集合进行增加或者删除
            // 解决方式-删除：可以使用iterator方法进行删除
            if("bbb".equals(str)){
//                coll.remove("bbb");//ConcurrentModificationException 报错
                it2.remove();
            }
        }
        System.out.println(coll);
    }
}
