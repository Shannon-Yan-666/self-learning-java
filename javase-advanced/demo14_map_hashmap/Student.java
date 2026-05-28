package demo14_map_hashmap;

import java.util.Objects;

/**
 * 需求
 * 创建一个HashMap集合
 * 键是学生对象(Student
 * 值是籍贯(String)。
 * 存储三个键值对元素，并遍历
 * 要求:同姓名，同年龄认为是同一个学生
 */
public class Student {
    private String name;
    private int age;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
