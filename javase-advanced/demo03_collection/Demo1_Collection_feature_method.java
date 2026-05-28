package demo03_collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 *  目标：了解 Collection（单列集合） 集合体系：是祖宗接口，功能单列集合都可使用
 *             Map     （双列集合）
 *  Collection成员：
 *      List集合（单列集合）：添加的元素是有序（仅存取有序）、可重复、有索引
 *          ArrayList:
 *          LinkedList:
 *          Vector    :已淘汰，仅知悉即可。
 *
 *      Set集合（单列集合）：添加的元素是无序（存取顺序不确定）、不重复（自带去重）、无索引
 *          HashSet:
 *              LinkedHashSet:
 *          TreeSet：
 *  Collection方法（功能）：
 *      public  boolean  add (E e)              把给定的对象添加到当前集合中 （有注意事项/细节）
 *      public  void  clear()                   清空集合中所有的元素
 *      public  boolean  remove(E e)            把给定的对象在当前集合中删除 （有注意事项/细节）
 *      public  boolean  contains(Object obj)   判断当前集合中是否包含给定的对象（有注意事项/细节）
 *      public  boolean  isEmpty()              判断当前集合是否为空
 *      public  int  size()                     返回集合中元素的个数/集合的长度
 *
 */
public class Demo1_Collection_feature_method {
    public static void main(String[] args) {
        //注意点：Collection接口需要创建实现类对象
        //实现类对象：ArrayList
        //使用多态的方式创建对象：父类 = new 子类
        Collection<String> coll = new ArrayList<String>();

        //1.添加元素
        //返回值-细节1：List系列集合中添加数据，方法永远返回true，可重复特性
        //返回值-细节2：Set系列集合中添加数据，如果当前要添加的元素不存在，则方法返回true。
        //返回值-细节2：Set系列集合中添加数据，如果当前要添加的元素已存在，则方法返回false，不可重复特性。
        coll.add("A");
        coll.add("BBB");
        coll.add("CC");
        System.out.println(coll);

        //2.清空元素
//        coll.clear();
//        System.out.println(coll);

        //3.删除元素
        //索引-细节1：Collection是祖宗类方法，因此无法通过索引删除，只能通过元素内容/对象删除。
        //返回值-细节2：方法有布尔类型返回值，删除成功则为true，如果删除元素不存在集合中，则返回false。
        System.out.println(coll.remove("CC")); //true
        System.out.println(coll);

        //4.判断元素是否包含
        //细节：底层是依赖equals方法进行判断，如果集合中存储的是自定义对象，那么在javabean中，一定要重写equals方法
        //重点：自定义对象（如Student类、Animal类），如果没有重写equals方法，底层默认使用Object类中的equals方法，依赖地址值进行判断。
        //如果需要对属性值/元素内容进行比较，就喜欢在javabean中重写equals方法！！！！
        boolean result = coll.contains("CC");
        System.out.println(result);//false

        //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);//false

        //6.获取集合的长度
        int result3 = coll.size();
        System.out.println(result3);
    }

}
