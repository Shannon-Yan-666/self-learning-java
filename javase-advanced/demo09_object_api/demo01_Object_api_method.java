package demo09_object_api;

/**
 * 目标：掌握常见的Object API
 *      顶级父类，所有类都直接或间接的继承于Object类
 *      无成员变量、无带参构造器，只有无参构造方法
 *
 *              方法名                         说明
 * public String toString()             返回对象的字符串表示形式(一般会重写)
 * public boolean equals(Object obj)    比较两个对象是否相等
 * protected Object clone(int a)        对象克隆（obj，默认是浅克隆 / 第三方library，可以实现深克隆）

 */
public class demo01_Object_api_method {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.toString()  返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        //细节:
        // System:类名
        // out:静态变量
        // System.out:获取打印的对象
        // println():方法
        // 参数:表示打印的内容
        System.out.println(str1);//java.lang.Object@10f87f48

        // 2.equals(Object obj)   比较两个对象是否相等

        // 3.clone(int a)   对象克隆/拷贝/赋值
        //3.1 先创建一个对象
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        User u1 = new User(01,"Film","123qwe","girl01",data);
        //3.2浅克隆对象  (需要类型强转)
        //细节:
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去。//书写细节:
        //1.重写object中的clone方法
        //2.让javabean类实现Cloneable接口
        //3.创建原对象并调用clone就可以了。
        Object u2 =(User) u1.clone();
        System.out.println(u1);
        System.out.println(u2);

        //3.3第三方工具（深克隆）
//        //1.第三方写的代码导入到项目中//2.编写代码
//        Gson gson = new Gson();
//        //把对象变成一个字符串
//        String s = gson.toJson(u1);
//        //再把字符串变回对象就可以了
//        User u3 = gson.fromJson(s, User.class);
//        //验证
//        int[] arr = u1.getData();
//        arr[0] = 100;
//        //打印对象
//        System.out.println(u3);




    }
}
