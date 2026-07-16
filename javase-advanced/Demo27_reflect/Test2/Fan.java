package Demo27_reflect.Test2;

public class Fan {
    private String name;
    private int age;

    public Fan() {
    }

    public Fan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void applaud(){
        System.out.println("Fan,Applaud...");
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
        return "Fan{name = " + name + ", age = " + age + "}";
    }
}
