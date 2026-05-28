package demo16_map_treemap;

import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //this：表示当前要添加的元素
    // o  ：表示红黑树中已经存在的元素
    // 返回值：负数，表示当前要添加的元素是小的，存左边
    // 返回值：正数数，表示当前要添加的元素是大的，存右边
    // 返回值：0，表示当前要添加的元素已存在，舍弃

    @Override
    public int compareTo(Animal o) {
        //按照年龄升序排序
        int i = this.getAge() - o.getAge() ;
        //同年龄就按照名字排序
        //如果同年龄且同姓名，认为是同一个人
        i = i == 0 ? this.getName().compareTo(o.getName()): i;
        return i;
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
        return "Animal{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {


        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
