package demo05_collection_set.HashSet_cast1;

/**
 * 目标：了解HashSet集合的特性
 * 底层原理： HashSet集合底层采取 哈希表 存储数据
 *          哈希表：是一种对于增删改查数据性能都较好的结构（底层是有数组存在的）
 *          哈希表的组成：
 *                     JDK8之前：  数组 + 链表
 *                     JDK8之后：  数组 + 链表 + 红黑树
 *
 *          哈希值：对象的整数表现形式
 *                1.根据hashCode方法计算出来的int类型的整数
 *                2.该方法定义在Object类中，所有对象都可以调用，默认使用地址值进行计算
 *                （意义不大，一般会重写hashCode方法）
 *                3.一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值
 *
 *          对象的哈希值特点：
 *                 1.如果没有重写hashCode方法，不同对象计算出来的哈希值是不同的
 *                 2.如果已经重写hashCode方法，不同对象只要属性值相同，计算出来的哈希值也相同
 *                 3.在小部分情况下，不同属性值或者不同的地址值计算出来的哈希值也有可能相同。（哈希碰撞）
 *                   极端情况：int取值范围 -21亿多 ~ 21亿多   假如创建了50亿个对象，去50亿个对象的哈希值，会有8亿的哈希碰撞
 */
public class Demo2_HashSet_feature_case1 {
    public static void main(String[] args) {

        //1.创建对象
        Student s1 = new Student("zhangsan",25);
        Student s2 = new Student("zhangsan",25);

        //2.如果没有重写hashCode方法，不同对象计算出来的哈希值是不同的
        //2.1如果已经重写hashCode方法，不同对象只要属性值相同，计算出来的哈希值也相同
        System.out.println(s1.hashCode());
        //重写前哈希值：189568618  重写后哈希值  ：-1461067290
        System.out.println(s2.hashCode());
        //重写前哈希值：793589513  重写后哈希值：-1461067290

        //在小部分情况下，不同属性值或者不同的地址值计算出来的哈希值也有可能相同。
        // （哈希碰撞）
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354


    }
}
