package Demo27_reflect.Demo4_Reflect_Method;

import java.io.IOException;

public class Artist {
    private String name;
    private int age;

    public Artist() {
    }

    public Artist(String name, int age) {
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

    public void show(){
        System.out.println("Name: " + name +"开始表演~");
    }

    private void eat(String something){
        System.out.println("Eating..." + something);
    }

    private String eat(String something,int a)throws IOException,NullPointerException{
        System.out.println("Eating..." + something);
        return something;
    }

    public String toString() {
        return "Artist{name = " + name + ", age = " + age + "}";
    }
}
