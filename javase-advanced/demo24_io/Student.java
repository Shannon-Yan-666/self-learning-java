package demo24_io;

import java.io.Serial;
import java.io.Serializable;

/**
 * Serializable接口：里面是没有抽象方法，是标记型接口（合格证）
 *  一旦实现了这个接口，那么就表示当前的Student类，可以被序列化
 */

public class Student implements Serializable {
    @Serial
    //固定版本号：避免javabean被修改后，反序列化读取报错
    private static final long serialVersionUID = 7208405148186348780L;

    private String name;
    private int age;
    private transient int score;//瞬态关键字,不会把当前属性序列话到本地文件当中

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
