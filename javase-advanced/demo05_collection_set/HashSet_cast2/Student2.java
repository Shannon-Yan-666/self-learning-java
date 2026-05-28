package demo05_collection_set.HashSet_cast2;

import java.util.Objects;

/**
 *  自定义对象（如Student对象）：必须要重写hashCode和equals方法
 *  String / Integer 类型的数据:不用重写hashCode和equals方法(因为java底层已经默认重写好了)
 */
public class Student2 {
    private String name;
    private int age;


    public Student2() {
    }

    public Student2(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}

