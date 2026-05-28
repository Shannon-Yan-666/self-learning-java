package demo05_collection_set.TreeSet_cast1;

/**
 *  TreeSet的自定义类不需要重写HashSet和equals方法，因为底层是红黑树结构
 *
 */
public class Student3 implements Comparable<Student3>{
    private String name;
    private int age;

    //重写Comparable接口里面的排序规则
    @Override
    public int compareTo(Student3 o) {
        //指定排序规则
        //只看年龄进行排序
        return this.getAge() - o.getAge();
        //this :表示当前要添加的元素
        //  o  :表示已经在红黑树存在的元素
        //返回值:
        //      负数:认为要添加的元素是小的，存左边
        //      正数:认为要添加的元素是大的，存右边
        //       0  :认为要添加的元素已经存在，舍弃
    }

    public Student3() {
    }

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student3{name = " + name + ", age = " + age + "}";
    }
}
