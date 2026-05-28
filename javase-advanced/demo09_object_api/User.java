package demo09_object_api;

import java.util.StringJoiner;

/**
 * 克隆方法的学习，测试
 */

    //Cloneable 接口 ： 表示一旦实现，那么当前类的对象就可以被克隆（如果没有实现，就不能克隆）
    //如果一个接口内没有抽象方法，则表示当前接口是一个标记性几口
public class User implements  Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;//游戏图片
    private int[] data;// 游戏进度


    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "角色编号： " + id + ", 用户名：" + username + ", 密码： " + password + ", 游戏图片： " + path + ", 游戏进度： " +arrToString();
    }

    //游戏进度：返回数组的属性值
    public String arrToString() {
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    //重写clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java克隆一个对象，并把克隆之后的对象返回出去
        //本类需要实现一个  Cloneable 接口
        return super.clone();
    }
}
