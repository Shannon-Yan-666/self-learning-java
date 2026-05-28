package demo21_throwable;

public class Studen2 {
    private String name;
    private int age;


    public Studen2() {
    }

    public Studen2(String name, int age) {
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
        if (age < 18 || age > 35) {
            throw new RuntimeException();
        }else {
            this.age = age;
        }
    }

    public String toString() {
        return "Studen2{name = " + name + ", age = " + age + "}";
    }
}
