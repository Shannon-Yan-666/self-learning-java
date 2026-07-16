package demo28_dynamic_proxy;

public class Artist implements Star{
    private String name;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }
    //唱歌
    @Override
    public String sing(String name){
        System.out.println("Artist,sing..." + name);
        return "3Q~";
    }
    //跳舞
    @Override
    public void dance(){
        System.out.println("Artist,dance...");
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

    public String toString() {
        return "Artist{name = " + name + "}";
    }
}

